
<%@ page import="bottlesonbottles.Product" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'product.label', default: 'Product')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-product" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<!--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>-->
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-product" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list product">
			
				<g:if test="${productInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="product.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${productInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.upc}">
				<li class="fieldcontain">
					<span id="upc-label" class="property-label"><g:message code="product.upc.label" default="Upc" /></span>
					
						<span class="property-value" aria-labelledby="upc-label"><g:fieldValue bean="${productInstance}" field="upc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.aoc}">
				<li class="fieldcontain">
					<span id="aoc-label" class="property-label"><g:message code="product.aoc.label" default="Aoc" /></span>
					
						<span class="property-value" aria-labelledby="aoc-label"><g:fieldValue bean="${productInstance}" field="aoc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="product.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${productInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><img src="/BottlesOnBottles/product/displayImage/${productInstance.id}" width = "100" height = "100"><!--<g:message code="product.image.label" default="Image" />--></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="product.price.label" default="Price" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${productInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.country}">
				<li class="fieldcontain">
					<span id="country-label" class="property-label"><g:message code="product.country.label" default="Country" /></span>
					
						<span class="property-value" aria-labelledby="country-label"><g:fieldValue bean="${productInstance}" field="country"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.size}">
				<li class="fieldcontain">
					<span id="size-label" class="property-label"><g:message code="product.size.label" default="Size" /></span>
					
						<span class="property-value" aria-labelledby="size-label"><g:fieldValue bean="${productInstance}" field="size"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.percent}">
				<li class="fieldcontain">
					<span id="percent-label" class="property-label"><g:message code="product.percent.label" default="Percent" /></span>
					
						<span class="property-value" aria-labelledby="percent-label"><g:fieldValue bean="${productInstance}" field="percent"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.age}">
				<li class="fieldcontain">
					<span id="age-label" class="property-label"><g:message code="product.age.label" default="Age" /></span>
					
						<span class="property-value" aria-labelledby="age-label"><g:fieldValue bean="${productInstance}" field="age"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.category}">
				<li class="fieldcontain">
					<span id="category-label" class="property-label"><g:message code="product.category.label" default="Category" /></span>
					
						<span class="property-value" aria-labelledby="category-label"><g:link controller="category" action="show" id="${productInstance?.category?.id}">${productInstance?.category?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:productInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${productInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
