<div id="topbar">
	<div id="header"><a class="bob" href="${createLink(uri: '/')}">Bottles On Bottles</a><img class="header"
		src="http://localhost:8080/BottlesOnBottles/images/logo.jpg" alt="bottlesOnBottles" />
	</div>
	<div id="session">
		<nobr>
			<sec:ifLoggedIn>
				<g:message code="topbar.welcome_msg" /><b><sec:username/></b>! &nbsp;&nbsp;
				<g:link controller='logout' action='logout'><g:message code="topbar.logout" /></g:link>
			</sec:ifLoggedIn>
			<sec:ifNotLoggedIn>
				<g:link controller='login' action='auth'><g:message code="topbar.login" /></g:link>
			</sec:ifNotLoggedIn>
		</nobr>
	</div>
</div>