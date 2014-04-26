package bottlesonbottles


import grails.plugin.springsecurity.annotation.Secured

class HomePageController {
	
	static scaffold = Product
	
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        List<Product> productInstanceList = Product.list(params)
        render (view : '/index', model : [productInstanceList : productInstanceList])
       
    }
	
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def searchProducts() {
        List<Product> productInstanceList = Product.search(params.name, [result:'every']/*params.name /*upc: upc:params.upc, price:params.price, aoc:params.aoc, country:params.country, size:params.size, percent:params.int('percent'), age:params.int('age')*/)
	render (view : '/index', model : [productInstanceList: productInstanceList])
    }
}