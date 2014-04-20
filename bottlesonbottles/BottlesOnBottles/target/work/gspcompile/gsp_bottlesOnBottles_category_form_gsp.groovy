import bottlesonbottles.Category
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_category_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/category/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: categoryInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("category.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(categoryInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: categoryInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("category.description.label"),'default':("Description")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("description"),'value':(categoryInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: categoryInstance, field: 'image', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("category.image.label"),'default':("Image")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("image"),'value':(categoryInstance?.image)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: categoryInstance, field: 'products', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("category.products.label"),'default':("Products")],-1)
printHtmlPart(8)
for( p in (categoryInstance?.products) ) {
printHtmlPart(9)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("product"),'action':("show"),'id':(p.id)],2)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'product.label', default: 'Product')]))
})
invokeTag('link','g',43,['controller':("product"),'action':("create"),'params':(['category.id': categoryInstance?.id])],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397420083475L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
