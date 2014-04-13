package admin

import grails.plugin.springsecurity.annotation.Secured
import product.Product
import category.Category

class AdminAreaController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render(view: "index")
    }
    @Secured(['ROLE_ADMIN'])
    def addproduct() {
        render(view: "addProductForm")
    }
    @Secured(['ROLE_ADMIN'])
    def addcategory() {
        render(view : "addCategoryForm")
    }
    def editProducts() {
        render 'Strech Goal'
    }
    @Secured(['ROLE_ADMIN'])
    def addProductPost() {
       def newProduct = new  Product (
            name : params.name,
            upc : params.upc,
            aoc : params.aoc,
            description : params.description,
            image : params.img,
            price : params.price,
            country : params.country,
            size : params.quanity,
            percent : params.percent,
            age : params.age
           )
          
       newProduct.save(flush: true)
       redirect(action: "index")
    }
    
    @Secured(['ROLE_ADMIN'])
    def addCatagoryPost() {
        def newCategory = new category.Category (
            name: params.name,
            description: params.description,
            image: params.img
        )
        
        newCategory.save(flush: true)
    }
}
