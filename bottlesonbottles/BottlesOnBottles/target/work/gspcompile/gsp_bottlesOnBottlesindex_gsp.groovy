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
createTagBody(2, {->
printHtmlPart(6)
invokeTag('textField','g',122,['name':("name")],-1)
printHtmlPart(7)
invokeTag('textField','g',123,['name':("price")],-1)
printHtmlPart(8)
invokeTag('textField','g',124,['name':("AOC")],-1)
printHtmlPart(9)
invokeTag('textField','g',125,['name':("country")],-1)
printHtmlPart(10)
invokeTag('textField','g',126,['name':("quantity")],-1)
printHtmlPart(11)
invokeTag('textField','g',127,['name':("percentage")],-1)
printHtmlPart(12)
invokeTag('textField','g',128,['name':("age")],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',130,['value':("Search"),'action':("searchProducts")],-1)
printHtmlPart(14)
})
invokeTag('form','g',131,['action':("searchProducts"),'method':("post")],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('ifAllGranted','sec',144,['roles':("ROLE_ADMIN")],2)
printHtmlPart(17)
invokeTag('message','g',148,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(18)
if(true && (flash.message)) {
printHtmlPart(19)
expressionOut.print(flash.message)
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('sortableColumn','g',161,['property':("name"),'title':(message(code: 'product.name.label', default: 'Name'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',164,['property':("upc"),'title':(message(code: 'product.upc.label', default: 'Upc'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',167,['property':("aoc"),'title':(message(code: 'product.aoc.label', default: 'Aoc'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',170,['property':("description"),'title':(message(code: 'product.description.label', default: 'Description'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',173,['property':("image"),'title':(message(code: 'product.image.label', default: 'Image'))],-1)
printHtmlPart(22)
invokeTag('sortableColumn','g',176,['property':("price"),'title':(message(code: 'product.price.label', default: 'Price'))],-1)
printHtmlPart(23)
loop:{
int i = 0
for( productInstance in (productInstanceList) ) {
printHtmlPart(24)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(26)
expressionOut.print(fieldValue(bean: productInstance, field: "name"))
printHtmlPart(27)
})
invokeTag('link','g',187,['controller':("Product"),'action':("show"),'id':(productInstance.id)],3)
printHtmlPart(28)
expressionOut.print(fieldValue(bean: productInstance, field: "upc"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: productInstance, field: "aoc"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: productInstance, field: "description"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: productInstance, field: "image"))
printHtmlPart(31)
expressionOut.print(productInstance.id)
printHtmlPart(32)
expressionOut.print(fieldValue(bean: productInstance, field: "price"))
printHtmlPart(33)
i++
}
}
printHtmlPart(34)
invokeTag('paginate','g',215,['total':(productInstanceCount ?: 0)],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',224,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398347138722L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
