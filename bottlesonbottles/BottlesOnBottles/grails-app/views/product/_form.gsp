<%@ page import="bottlesonbottles.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="product.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${productInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'upc', 'error')} required">
	<label for="upc">
		<g:message code="product.upc.label" default="Upc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="upc" required="" value="${productInstance?.upc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'aoc', 'error')} ">
	<label for="aoc">
		<g:message code="product.aoc.label" default="Aoc" />
		
	</label>
	<g:textField name="aoc" value="${productInstance?.aoc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="product.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${productInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'image', 'error')} required">
	<label for="image">
		<g:message code="product.image.label" default="Image" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="image" name="image" />

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="product.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="price" required="" value="${productInstance?.price}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="product.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${productInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'size', 'error')} required">
	<label for="size">
		<g:message code="product.size.label" default="Size" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="size" required="" value="${productInstance?.size}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'percent', 'error')} required">
	<label for="percent">
		<g:message code="product.percent.label" default="Percent" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="percent" type="number" min="0" max="100" value="${productInstance.percent}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="product.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${productInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'category', 'error')} required">
	<label for="category">
		<g:message code="product.category.label" default="Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="category" name="category.id" from="${bottlesonbottles.Category.list()}" optionKey="id" required="" value="${productInstance?.category?.id}" class="many-to-one"/>

</div>

