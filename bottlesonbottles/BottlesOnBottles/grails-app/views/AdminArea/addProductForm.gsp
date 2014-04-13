<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
    </head>
    <body>
        <h1>Add Product</h1>
        
        <g:form controller = "AdminArea" action = "addProductPost">
            
            <div>
                *Name of product: 
                <g:textField name="name"> </g:textField>
            </div>
            <div>
                *Universal Product Code:
                <g:textField name="upc" />
            </div>
            <div>
                Special Regional Distiction:
                <g:textField name="aoc" />
            </div>
            <div>
                *Product Description:
                <g:textField name="description" />
            </div>
            <div>
                *path to image:
                <g:textField name="img"/>
            </div>
            <div>
                *price of product:
                <g:textField name="price"/>
            </div>
            <div>
                country of origin:
                <g:textField name="country"/>
            </div>
            <div>
                *volume / quanity:
                <g:textField name="quanity"/>
            </div>
            <div>
                *percentage alcohol content:
                <g:textField name="percent"/>
            </div>
            <div>
                age:
                <g:textField name="age"/>
            </div>
            
            <g:actionSubmit value="Submit" action="addProductPost" />
            
        </g:form>   
        
    </body>
</html>
