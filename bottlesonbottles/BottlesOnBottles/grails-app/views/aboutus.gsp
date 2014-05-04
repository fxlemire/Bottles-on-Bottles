<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

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

 <center><h1>About Us</h1></center>
        <center>We're a young and dynamic team whose focus is not on design but on selling booze!</center>

	<!--</div>-->
</body>
