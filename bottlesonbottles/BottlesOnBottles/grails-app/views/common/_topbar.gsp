<div id="topbar">
	<div id="header">Bottles On Bottles<img class="header"
		src="http://localhost:8080/BottlesOnBottles/images/logo.jpg" alt="bottlesOnBottles" />
	</div>
	<div id="session">
		<nobr>
			<g:if test="${session.user}">
				<b>${session.user?.firstName}&nbsp;${session.user?.lastName}</b> |
				<g:link controller="user" action="logout">Logout</g:link>
			</g:if>
			<g:else>
				<a href="login/auth">Login</a>
				<!--<g:link controller="user" action="login">Login</g:link>
			-->
			</g:else>
		</nobr>
	</div>
</div>