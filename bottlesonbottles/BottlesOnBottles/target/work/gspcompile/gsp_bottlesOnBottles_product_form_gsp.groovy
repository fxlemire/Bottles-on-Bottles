import bottlesonbottles.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_product_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: productInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("product.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(productInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'upc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("product.upc.label"),'default':("Upc")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("upc"),'required':(""),'value':(productInstance?.upc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'aoc', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("product.aoc.label"),'default':("Aoc")],-1)
printHtmlPart(6)
invokeTag('textField','g',28,['name':("aoc"),'value':(productInstance?.aoc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'description', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("product.description.label"),'default':("Description")],-1)
printHtmlPart(6)
invokeTag('textField','g',37,['name':("description"),'value':(productInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'image', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("product.image.label"),'default':("Image")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: productInstance, field: 'price', 'error'))
printHtmlPart(10)
invokeTag('message','g',52,['code':("product.price.label"),'default':("Price")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("price"),'required':(""),'value':(productInstance?.price)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'country', 'error'))
printHtmlPart(11)
invokeTag('message','g',61,['code':("product.country.label"),'default':("Country")],-1)
printHtmlPart(6)
invokeTag('textField','g',64,['name':("country"),'value':(productInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'size', 'error'))
printHtmlPart(12)
invokeTag('message','g',70,['code':("product.size.label"),'default':("Size")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("size"),'required':(""),'value':(productInstance?.size)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'percent', 'error'))
printHtmlPart(13)
invokeTag('message','g',79,['code':("product.percent.label"),'default':("Percent")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("percent"),'type':("number"),'min':("0"),'max':("100"),'value':(productInstance.percent),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'age', 'error'))
printHtmlPart(14)
invokeTag('message','g',88,['code':("product.age.label"),'default':("Age")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("age"),'type':("number"),'value':(productInstance.age),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'category', 'error'))
printHtmlPart(15)
invokeTag('message','g',97,['code':("product.category.label"),'default':("Category")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['id':("category"),'name':("category.id"),'from':(bottlesonbottles.Category.list()),'optionKey':("id"),'required':(""),'value':(productInstance?.category?.id),'class':("many-to-one")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397420083482L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
