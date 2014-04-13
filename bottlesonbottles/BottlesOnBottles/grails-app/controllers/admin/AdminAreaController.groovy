package admin

import grails.plugin.springsecurity.annotation.Secured
import product.Product

class AdminAreaController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render(view: "index")
    }
    @Secured(['ROLE_ADMIN'])
    def addproduct() {
        render(view: "addProductForm")
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
    }
    
    def newCatagory() {
        //Add to Catagory db
        
    }
}
