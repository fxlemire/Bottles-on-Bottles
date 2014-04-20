import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_AdminAreaaddProductForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/AdminArea/addProductForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('textField','g',21,['name':("name")],3)
printHtmlPart(8)
invokeTag('textField','g',25,['name':("upc")],-1)
printHtmlPart(9)
invokeTag('textField','g',29,['name':("aoc")],-1)
printHtmlPart(10)
invokeTag('textField','g',33,['name':("description")],-1)
printHtmlPart(11)
invokeTag('textField','g',37,['name':("img")],-1)
printHtmlPart(12)
invokeTag('textField','g',41,['name':("price")],-1)
printHtmlPart(13)
invokeTag('textField','g',45,['name':("country")],-1)
printHtmlPart(14)
invokeTag('textField','g',49,['name':("quanity")],-1)
printHtmlPart(15)
invokeTag('textField','g',53,['name':("percent")],-1)
printHtmlPart(16)
invokeTag('textField','g',57,['name':("age")],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',60,['value':("Submit"),'action':("addProductPost")],-1)
printHtmlPart(18)
})
invokeTag('form','g',62,['controller':("AdminArea"),'action':("addProductPost")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1397403713668L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
