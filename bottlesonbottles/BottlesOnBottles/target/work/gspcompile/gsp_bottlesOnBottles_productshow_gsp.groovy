import bottlesonbottles.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_productshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (productInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("product.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(productInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.upc)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("product.upc.label"),'default':("Upc")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(productInstance),'field':("upc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.aoc)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("product.aoc.label"),'default':("Aoc")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(productInstance),'field':("aoc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.description)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("product.description.label"),'default':("Description")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(productInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.image)) {
printHtmlPart(24)
expressionOut.print(productInstance.id)
printHtmlPart(25)
invokeTag('message','g',64,['code':("product.image.label"),'default':("Image")],-1)
printHtmlPart(26)
}
printHtmlPart(17)
if(true && (productInstance?.price)) {
printHtmlPart(27)
invokeTag('message','g',71,['code':("product.price.label"),'default':("Price")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',73,['bean':(productInstance),'field':("price")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.country)) {
printHtmlPart(29)
invokeTag('message','g',80,['code':("product.country.label"),'default':("Country")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',82,['bean':(productInstance),'field':("country")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.size)) {
printHtmlPart(31)
invokeTag('message','g',89,['code':("product.size.label"),'default':("Size")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',91,['bean':(productInstance),'field':("size")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.percent)) {
printHtmlPart(33)
invokeTag('message','g',98,['code':("product.percent.label"),'default':("Percent")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',100,['bean':(productInstance),'field':("percent")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.age)) {
printHtmlPart(35)
invokeTag('message','g',107,['code':("product.age.label"),'default':("Age")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',109,['bean':(productInstance),'field':("age")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.category)) {
printHtmlPart(37)
invokeTag('message','g',116,['code':("product.category.label"),'default':("Category")],-1)
printHtmlPart(38)
createTagBody(3, {->
expressionOut.print(productInstance?.category?.encodeAsHTML())
})
invokeTag('link','g',118,['controller':("category"),'action':("show"),'id':(productInstance?.category?.id)],3)
printHtmlPart(16)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',126,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',126,['class':("edit"),'action':("edit"),'resource':(productInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',127,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',129,['url':([resource:productInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',131,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397420511558L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
