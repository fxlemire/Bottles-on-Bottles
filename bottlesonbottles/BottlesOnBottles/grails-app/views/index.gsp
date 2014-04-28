<%@ page import="bottlesonbottles.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<g:set var="entityName"
	value="${message(code: 'product.label', default: 'Product')}" />
<title>Bottles on Bottles</title>
<style type="text/css" media="screen">
input {
	float: right;
	margin-right: 5%;
}

#mainSection {
	display:inline-block;
	width:80%;
	vertical-align: top;
}

#list-product {
	display: inline-block;
	width: 100%;
}

#mainSection div#adminMenu {
	padding: 1% 0%;
	text-align: center;
}

#mainSection #adminMenu li {
	list-style-type: none;
	display: inline;
	padding: 0% 10%;
	font-size: 26px;
	font-weight: 900;
}

#mainSection #adminMenu a {
	text-decoration: none;
}

#mainSection #adminMenu a:hover {
	text-decoration: underline;
}

#status {
	background-color: #FAFAFA;
	border-top: 1px solid #E0E0E0;
	border-right: 1px solid #E0E0E0;
	width: 19%;
	height: 100%;
	display: inline-block;
}

.ie6 #status {
	display: inline;
	/* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
}

#status ul {
	font-size: 0.9em;
	list-style-type: none;
	margin-left: 2em;
	text-transform: uppercase;
}

#status li {
	line-height: 1.3;
	padding-bottom: 2em;
}

#status h1 {
	text-transform: uppercase;
	text-align: center;
}

#page-body {
	margin: 2em 1em 1.25em 18em;
}

h2 {
	margin-top: 1em;
	margin-bottom: 0.3em;
	font-size: 1em;
}

p {
	line-height: 1.5;
	margin: 0.25em 0;
}

#controller-list ul {
	list-style-position: inside;
}

#controller-list li {
	line-height: 1.3;
	list-style-position: inside;
	margin: 0.25em 0;
}

@media screen and (max-width: 480px) {
	#status {
		display: none;
	}
	#page-body {
		margin: 0 1em 1em;
	}
	#page-body h1 {
		margin-top: 0;
	}
}
</style>
</head>
<body>
	<a href="#page-body" class="skip"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div id="status" role="complementary">
            <div><g:link action="aboutus"> about us </g:link></div>
		<h1>Search Product</h1>
		<g:form action="searchProducts" method="get">
			<ul>
				<li><label for="name">name</label> <g:textField name="name" value="${product?.name}"/></li>
			<!--
				<li><label for="upc">UPC</label> <g:textField name="upc" value="${product?.upc}"/></li>
				<li><label for="price">price</label> <g:textField name="price" value="${product?.price}"/></li>
			-->
			
				<li><label for="priceFrom">price from</label> <g:textField name="priceFrom" value="${product?.price}"/></li>
				<li><label for="priceTo">price to</label> <g:textField name="priceTo" value="${product?.price}"/></li>
			<!--
				<li><label for="aoc">AOC</label> <g:textField name="aoc" value="${product?.aoc}"/></li>
				<li><label for="country">country</label> <g:textField name="country" value="${product?.country}"/></li>
				<li><label for="size">size</label> <g:textField name="size" value="${product?.size}"/></li>
				<li><label for="percent">percentage</label> <g:textField name="percent" value="${product?.percent}"/></li>
				<li><label for="age">age</label> <g:textField name="age" value="${product?.age}"/></li>
			-->
			</ul>
			<g:actionSubmit value="Search" action="searchProducts"/>
		</g:form>
		<br>
		<br>
		<h1>Search Category</h1>
		<g:form action="searchCategory" method="get">
			<ul>
				<li><label for="category">category</label> <g:textField name="category" /></li>
			</ul>
			<g:actionSubmit value="Search Category Products" action="searchCategoryProducts"/>
			<br>
			<br>
			<g:actionSubmit value="Search Categories" action="searchCategory"/>
		</g:form>
                        
               
	</div>
	<!--<div id="page-body" role="main">-->

	<div id="mainSection">
	
		<sec:ifAllGranted roles="ROLE_ADMIN">
			<div id="adminMenu">
				<ul>
					<li><a href="product/index">Product</a></li>
					<li><a href="category/index">Category</a></li>
				</ul>
			</div>
		</sec:ifAllGranted>
	
		<div id="list-product" class="content scaffold-list" role="main">
			<h1>
				<!--<g:message code="default.list.label" args="[entityName]" />-->
				BoB's Products
			</h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">
					${flash.message}
				</div>
			</g:if>
			<table>
				<thead>
					<tr>
	
						<g:sortableColumn property="name"
							title="${message(code: 'product.name.label', default: 'Name')}" />
	
						<g:sortableColumn property="category"
							title="${message(code: 'product.category.label', default: 'Category')}" />
							
						<g:sortableColumn property="upc"
							title="${message(code: 'product.upc.label', default: 'Upc')}" />
	
						<g:sortableColumn property="aoc"
							title="${message(code: 'product.aoc.label', default: 'Aoc')}" />
	
						<g:sortableColumn property="description"
							title="${message(code: 'product.description.label', default: 'Description')}" />
	
						<g:sortableColumn property="image"
							title="${message(code: 'product.image.label', default: 'Image')}" />
	
						<g:sortableColumn property="price"
							title="${message(code: 'product.price.label', default: 'Price')}" />
	
					</tr>
				</thead>
				<tbody>
					<g:each in="${productInstanceList}" status="i" var="productInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
	
							<td><g:link controller="Product" action="show"
									id="${productInstance.id}">
									${fieldValue(bean: productInstance, field: "name")}
								</g:link>
							</td>
							
							<td>
								${fieldValue(bean: productInstance, field: "category")}
							</td>
	
							<td>
								${fieldValue(bean: productInstance, field: "upc")}
							</td>
	
							<td>
								${fieldValue(bean: productInstance, field: "aoc")}
							</td>
	
							<td>
								${fieldValue(bean: productInstance, field: "description")}
							</td>
	
							<!--<td>${fieldValue(bean: productInstance, field: "image")}</td>-->
							<td><img
								src="/BottlesOnBottles/product/displayImage/${productInstance.id}"
								width="100" height="100"></td>
	
							<td>
								${fieldValue(bean: productInstance, field: "price")}
							</td>
	
						</tr>
					</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${productInstanceCount ?: 0}" />
			</div>
		</div>
	</div>




	<!--</div>-->
</body>
</html>
