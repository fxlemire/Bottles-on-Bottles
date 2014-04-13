<%@ page import="category.Category" %>



<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="category.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${categoryInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="category.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${categoryInstance?.image}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: categoryInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="category.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${categoryInstance?.name}"/>

</div>

