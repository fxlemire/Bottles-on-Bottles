package bottlesonbottles


import grails.plugin.springsecurity.annotation.Secured
class HomePageController {

    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        List<Product> productInstanceList = Product.list(params)
        render (view : '/index', model : [productInstanceList : productInstanceList])
       
    }
}