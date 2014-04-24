<div id="topbar">
	<div id="header">Bottles On Bottles<img class="header"
		src="http://localhost:8080/BottlesOnBottles/images/logo.jpg" alt="bottlesOnBottles" />
	</div>
	<div id="session">
		<nobr>
			<sec:ifLoggedIn>
				Welcome back, <b><sec:username/></b>! &nbsp;&nbsp;
				<g:link controller='logout' action='logout'>Logout</g:link>
			</sec:ifLoggedIn>
			<sec:ifNotLoggedIn>
				<g:link controller='login' action='auth'>Login</g:link>
			</sec:ifNotLoggedIn>
		</nobr>
	</div>
</div>