import bottlesonbottles.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_productindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'product.label', default: 'Product'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("name"),'title':(message(code: 'product.name.label', default: 'Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("upc"),'title':(message(code: 'product.upc.label', default: 'Upc'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("aoc"),'title':(message(code: 'product.aoc.label', default: 'Aoc'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("description"),'title':(message(code: 'product.description.label', default: 'Description'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("image"),'title':(message(code: 'product.image.label', default: 'Image'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("price"),'title':(message(code: 'product.price.label', default: 'Price'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( productInstance in (productInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: productInstance, field: "name"))
})
invokeTag('link','g',45,['action':("show"),'id':(productInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: productInstance, field: "upc"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: productInstance, field: "aoc"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: productInstance, field: "description"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: productInstance, field: "image"))
printHtmlPart(19)
expressionOut.print(productInstance.id)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: productInstance, field: "price"))
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('paginate','g',63,['total':(productInstanceCount ?: 0)],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397420083485L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
