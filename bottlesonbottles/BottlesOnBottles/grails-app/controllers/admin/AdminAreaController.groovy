package admin

import grails.plugin.springsecurity.annotation.Secured

class AdminAreaController {

    @Secured(['ROLE_ADMIN'])
    def index() {
        render 'Secure access only'
    }
}
