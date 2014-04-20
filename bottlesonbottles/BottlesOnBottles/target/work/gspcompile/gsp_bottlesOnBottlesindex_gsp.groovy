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
printHtmlPart(2)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'product.label', default: 'Product'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',90,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('message','g',92,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(7)
invokeTag('message','g',111,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',119,['property':("name"),'title':(message(code: 'product.name.label', default: 'Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',121,['property':("upc"),'title':(message(code: 'product.upc.label', default: 'Upc'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',123,['property':("aoc"),'title':(message(code: 'product.aoc.label', default: 'Aoc'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',125,['property':("description"),'title':(message(code: 'product.description.label', default: 'Description'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',127,['property':("image"),'title':(message(code: 'product.image.label', default: 'Image'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',129,['property':("price"),'title':(message(code: 'product.price.label', default: 'Price'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( productInstance in (productInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: productInstance, field: "name"))
})
invokeTag('link','g',137,['controller':("Product"),'action':("show"),'id':(productInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: productInstance, field: "upc"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: productInstance, field: "aoc"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: productInstance, field: "description"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: productInstance, field: "image"))
printHtmlPart(18)
expressionOut.print(productInstance.id)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: productInstance, field: "price"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',155,['total':(productInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',163,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397441656279L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
