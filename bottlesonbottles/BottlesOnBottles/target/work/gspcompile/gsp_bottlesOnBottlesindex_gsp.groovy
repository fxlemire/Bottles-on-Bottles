import bottlesonbottles.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottlesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'product.label', default: 'Product'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',114,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',117,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('ifAllGranted','sec',142,['roles':("ROLE_ADMIN")],2)
printHtmlPart(7)
invokeTag('message','g',146,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',159,['property':("name"),'title':(message(code: 'product.name.label', default: 'Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',162,['property':("upc"),'title':(message(code: 'product.upc.label', default: 'Upc'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',165,['property':("aoc"),'title':(message(code: 'product.aoc.label', default: 'Aoc'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',168,['property':("description"),'title':(message(code: 'product.description.label', default: 'Description'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',171,['property':("image"),'title':(message(code: 'product.image.label', default: 'Image'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',174,['property':("price"),'title':(message(code: 'product.price.label', default: 'Price'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( productInstance in (productInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(fieldValue(bean: productInstance, field: "name"))
printHtmlPart(17)
})
invokeTag('link','g',185,['controller':("Product"),'action':("show"),'id':(productInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: productInstance, field: "upc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: productInstance, field: "aoc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: productInstance, field: "description"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: productInstance, field: "image"))
printHtmlPart(21)
expressionOut.print(productInstance.id)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: productInstance, field: "price"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',213,['total':(productInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',222,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397981545593L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
