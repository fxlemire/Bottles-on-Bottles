<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Bottles on Bottles</title>
		<style type="text/css" media="screen">
                    
                        input {
                            float: right;
                            margin-right: 5%;
                        }
                    
			#status {
				background-color: #FAFAFA;
				border: .2em solid #fff;
				width: 20em;
                                height: 100%;
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
		<div id="page-body" role="main">
		</div>
	</body>
</html>
