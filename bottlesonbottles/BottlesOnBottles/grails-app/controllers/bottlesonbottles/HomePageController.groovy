package bottlesonbottles


import grails.plugin.springsecurity.annotation.Secured

class HomePageController {
	
	static scaffold = Product
	
    //@Secured(['ROLE_USER','ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        List<Product> productInstanceList = Product.list(params)
        render (view : '/index', model : [productInstanceList : productInstanceList])
       
    }
	
    //@Secured(['ROLE_USER','ROLE_ADMIN'])
    def searchProducts() {
        //List<Product> productInstanceList = Product.search(params.name, [result:'every']/*params.name /*upc: upc:params.upc, price:params.price, aoc:params.aoc, country:params.country, size:params.size, percent:params.int('percent'), age:params.int('age')*/)
        //def productInstanceList = Product.findAllWhere([name:params.name, /*upc:params.upc,*/ price:params.price, aoc:params.aoc, country:params.country, size:params.size, percent:params.int('percent'), age:params.int('age')])
		def productInstanceList
		
		if (!params.name) {
			
			if (!(params.priceFrom || params.priceTo)) {
				productInstanceList = Product.list()
			} else if (!params.priceFrom) {
				productInstanceList = Product.createCriteria().list {
					and {
						between("price", 0, params.int('priceTo'))
					}
					order("name", "asc")
				}
			} else if (!params.priceTo) {
				productInstanceList = Product.createCriteria().list {
					and {
						between("price", params.int('priceFrom'), Integer.MAX_VALUE)
					}
					order("name", "asc")
				}
			} else {
				productInstanceList = Product.createCriteria().list {
					and {
						between("price", params.int('priceFrom'), params.int('priceTo'))
					}
					order("name", "asc")
				}
			}
			
		} else {
		
			def name = "%" + params.name + "%"
			
			if (!(params.priceFrom || params.priceTo)) {
				productInstanceList = Product.createCriteria().list {
					like ("name", name)
				}
			} else if (!params.priceFrom) {
				productInstanceList = Product.createCriteria().list {
					like ("name", name)
					and {
						between("price", 0, params.int('priceTo'))
					}
					order("name", "asc")
				}
			} else if (!params.priceTo) {
				productInstanceList = Product.createCriteria().list {
					like ("name", name)
					and {
						between("price", params.int('priceFrom'), Integer.MAX_VALUE)
					}
					order("name", "asc")
				}
			} else {
				productInstanceList = Product.createCriteria().list {
					like ("name", name)
					and {
						between("price", params.int('priceFrom'), params.int('priceTo'))
					}
					order("name", "asc")
				}
			}
			
		}
		
		render (view : '/index', model : [productInstanceList: productInstanceList])
    }
	
	//@Secured(['ROLE_USER','ROLE_ADMIN'])
	def searchCategoryProducts() {
		def productInstanceList
        def categoryInstanceList
		def categoryName = "%" + params.category + "%"
			
		if (params.category) {
                    
            categoryInstanceList = Category.findByName(params.category)
            if(categoryInstanceList == null) {
            	flash.message = "Category not found"
            }
			productInstanceList = Product.createCriteria().list {
				like ("category",categoryInstanceList)
			}
		} else {
			productInstanceList = Product.list()
		}
		
		render (view : '/index', model : [productInstanceList: productInstanceList])
	}
	
	//@Secured(['ROLE_USER','ROLE_ADMIN'])
	def searchCategory() {
		def cat
		def categoryName = "%" + params.category + "%"

		if (params.category) {
			cat = Category.findByName(params.category)
			if (cat) {
				redirect(controller:"Category", action:"showCat", params:[cat: cat.id])
			} else {
				flash.message = "Category not found"
				redirect(uri: request.getHeader('referer'))
			}
		} else if (Category.list()) {
				redirect(controller:'Category', action: "index")
		} else {
				flash.message = "Category not found"
				redirect(uri: request.getHeader('referer'))
		}
	}
	
}