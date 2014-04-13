<%@ page import="bottlesonbottles.Product" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
                <g:set var="entityName" value="${message(code: 'product.label', default: 'Product')}" />
		<title>Bottles on Bottles</title>
		<style type="text/css" media="screen">
                    
                        input {
                            float: right;
                            margin-right: 5%;
                        }
                        
                        #list-product {
                            display: inline-block;
                            width: 80%;
                            max-width: 80%;
                            vertical-align: top;
                        }
                    
			#status {
				background-color: #FAFAFA;
				border: .2em solid #fff;
				width: 20em;
                                height: 100%;
                                display: inline-block;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
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
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div id="status" role="complementary">
			<h1>Search Product</h1>
			<ul>
				<li>name <input type=text" /></li>
                                <li>price <input type=text" /></li>
                                <li>AOC <input type=text" /></li>
                                <li>country <input type=text" /></li>
                                <li>quantity <input type=text" /></li>
                                <li>percentage <input type=text" /></li>
                                <li>age <input type=text" /></li>
                                <input type="submit" />
			</ul>
		</div>
		<!--<div id="page-body" role="main">-->
                    
                    
                    
                    <div id="list-product" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'product.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="upc" title="${message(code: 'product.upc.label', default: 'Upc')}" />
					
						<g:sortableColumn property="aoc" title="${message(code: 'product.aoc.label', default: 'Aoc')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'product.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="image" title="${message(code: 'product.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="price" title="${message(code: 'product.price.label', default: 'Price')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${productInstanceList}" status="i" var="productInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${productInstance.id}">${fieldValue(bean: productInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: productInstance, field: "upc")}</td>
					
						<td>${fieldValue(bean: productInstance, field: "aoc")}</td>
					
						<td>${fieldValue(bean: productInstance, field: "description")}</td>
					
						<!--<td>${fieldValue(bean: productInstance, field: "image")}</td>-->
                                                <td> <img src="/BottlesOnBottles/product/displayImage/${productInstance.id}" width = "100" height = "100"> </td>
					
						<td>${fieldValue(bean: productInstance, field: "price")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${productInstanceCount ?: 0}" />
			</div>
		</div>
                    
                    
                    
                    
		<!--</div>-->
	</body>
</html>
