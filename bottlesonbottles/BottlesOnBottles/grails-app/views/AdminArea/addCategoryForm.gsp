<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item Category</title>
    </head>
    <body>
        <h1>Add Category</h1>
        <g:form controller ="AdminArea" action="addCategoryPost">
            <div>
                *Name of category: 
                <g:textField name="name"> </g:textField>
            </div>
            <div>
                *Category descritption:
                <g:textField name="description" />
            </div>
            <div>
                Image location
                <g:textField name="img" />
            </div>
        </g:form>
    </body>
</html>
