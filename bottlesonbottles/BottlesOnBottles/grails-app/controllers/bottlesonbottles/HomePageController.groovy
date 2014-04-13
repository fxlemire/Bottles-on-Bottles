package bottlesonbottles

import grails.plugin.springsecurity.annotation.Secured
class HomePageController {

    @Secured(['ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Product.list(params), model:[productInstanceCount: Product.count()]
    }
}
