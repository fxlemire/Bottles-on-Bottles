package bottlesonbottles


import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CategoryController {

    static allowedMethods = [save: "POST", update: ["PUT","POST"], delete: "DELETE"]
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Category.list(params), model:[categoryInstanceCount: Category.count()]
    }

    def show(Category categoryInstance) {
        respond categoryInstance
    }
    
    def showCat() {
		def cat = Category.get(params.cat)
		respond cat, view:'show'
	}
    @Secured(['ROLE_ADMIN'])
    def create() {
        respond new Category(params)
    }

    @Transactional
    @Secured(['ROLE_ADMIN'])
    def save(Category categoryInstance) {
        if (categoryInstance == null) {
            notFound()
            return
        }

        if (categoryInstance.hasErrors()) {
            respond categoryInstance.errors, view:'create'
            return
        }

        categoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'categoryInstance.label', default: 'Category'), categoryInstance.id])
                redirect categoryInstance
            }
            '*' { respond categoryInstance, [status: CREATED] }
        }
    }
    @Secured(['ROLE_ADMIN'])
    def edit(Category categoryInstance) {
        respond categoryInstance
    }

    @Transactional
    @Secured(['ROLE_ADMIN'])
    def update(Category categoryInstance) {
        if (categoryInstance == null) {
            notFound()
            return
        }

        if (categoryInstance.hasErrors()) {
            respond categoryInstance.errors, view:'edit'
            return
        }

        categoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Category.label', default: 'Category'), categoryInstance.id])
                redirect categoryInstance
            }
            '*'{ respond categoryInstance, [status: OK] }
        }
    }

    @Transactional
    @Secured(['ROLE_ADMIN'])
    def delete(Category categoryInstance) {

        if (categoryInstance == null) {
            notFound()
            return
        }

        categoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Category.label', default: 'Category'), categoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    def displayImage(Category categoryInstance) {
        def product = Category.get( params.id ) // get the record
        response.outputStream << categoryInstance.image // write the image to the outputstream
        response.outputStream.flush()
    }
    
    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'categoryInstance.label', default: 'Category'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
