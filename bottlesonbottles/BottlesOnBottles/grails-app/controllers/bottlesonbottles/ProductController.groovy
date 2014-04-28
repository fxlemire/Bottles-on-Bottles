package bottlesonbottles


import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


@Transactional(readOnly = true)
class ProductController {

    static allowedMethods = [save: "POST", update: ["PUT","POST"], delete: "DELETE"]

    //@Secured(['ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Product.list(params), model:[productInstanceCount: Product.count()]
    }

   // @Secured(['ROLE_ADMIN'])
    def show(Product productInstance) {
        respond productInstance
    }

    @Secured(['ROLE_ADMIN'])
    def create() {
        respond new Product(params)
    }

    @Secured(['ROLE_ADMIN'])
    @Transactional
    def save(Product productInstance) {
        if (productInstance == null) {
            notFound()
            return
        }

        if (productInstance.hasErrors()) {
            respond productInstance.errors, view:'create'
            return
        }

        productInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'productInstance.label', default: 'Product'), productInstance.id])
                redirect productInstance
            }
            '*' { respond productInstance, [status: CREATED] }
        }
    }

    @Secured(['ROLE_ADMIN'])
    def edit(Product productInstance) {
        respond productInstance
    }

    @Secured(['ROLE_ADMIN'])
    @Transactional
    def update(Product productInstance) {
        if (productInstance == null) {
            notFound()
            return
        }

        if (productInstance.hasErrors()) {
            respond productInstance.errors, view:'edit'
            return
        }

        productInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
                redirect productInstance
            }
            '*'{ respond productInstance, [status: OK] }
        }
    }

    @Secured(['ROLE_ADMIN'])
    @Transactional
    def delete(Product productInstance) {

        if (productInstance == null) {
            notFound()
            return
        }

        productInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Product.label', default: 'Product'), productInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }
    //@Secured(['ROLE_ADMIN'])
    def displayImage(Product productInstance) {
        def product = Product.get( params.id ) // get the record
        response.outputStream << productInstance.image // write the image to the outputstream
        response.outputStream.flush()
    }
    
    
    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'productInstance.label', default: 'Product'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
