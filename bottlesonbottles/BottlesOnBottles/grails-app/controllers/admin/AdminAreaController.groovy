package admin

import grails.plugin.springsecurity.annotation.Secured

class AdminAreaController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render 'Secure access only'
    }
    
    def editProducts() {
        render 'Strech Goal'
    }
    
    def newProduct() {
        //Add to Product db 
        //For now will have == codes overwrite so can edit aswell
    }
    
    def newCatagory() {
        //Add to Catagory db
        
    }
}
