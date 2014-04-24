import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bottlesOnBottles_common_topbar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/common/_topbar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('message','g',8,['code':("topbar.welcome_msg")],-1)
printHtmlPart(2)
invokeTag('username','sec',8,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
invokeTag('message','g',9,['code':("topbar.logout")],-1)
})
invokeTag('link','g',9,['controller':("logout"),'action':("logout")],2)
printHtmlPart(4)
})
invokeTag('ifLoggedIn','sec',10,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
invokeTag('message','g',12,['code':("topbar.login")],-1)
})
invokeTag('link','g',12,['controller':("login"),'action':("auth")],2)
printHtmlPart(4)
})
invokeTag('ifNotLoggedIn','sec',13,[:],1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398360589393L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
