<%@ page import="product.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="product.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${productInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'aoc', 'error')} ">
	<label for="aoc">
		<g:message code="product.aoc.label" default="Aoc" />
		
	</label>
	<g:textField name="aoc" value="${productInstance?.aoc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="product.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${productInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="product.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${productInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="product.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${productInstance?.image}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="product.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${productInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'percent', 'error')} required">
	<label for="percent">
		<g:message code="product.percent.label" default="Percent" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="percent" type="number" value="${productInstance.percent}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'price', 'error')} ">
	<label for="price">
		<g:message code="product.price.label" default="Price" />
		
	</label>
	<g:textField name="price" value="${productInstance?.price}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'size', 'error')} ">
	<label for="size">
		<g:message code="product.size.label" default="Size" />
		
	</label>
	<g:textField name="size" value="${productInstance?.size}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'upc', 'error')} ">
	<label for="upc">
		<g:message code="product.upc.label" default="Upc" />
		
	</label>
	<g:textField name="upc" value="${productInstance?.upc}"/>

</div>

