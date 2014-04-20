
import secure.Role
import secure.User
import secure.UserRole


class BootStrap {

    def init = { servletContext ->
        
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush:true)
        def adminUser = new User(username: 'admin', password: 'FishTest').save(flush:true)
        UserRole.create adminUser, adminRole, true
		
		def userRole = new Role(authority: 'ROLE_USER').save(flush:true)
		def userUser = new User(username: 'me', password: 'noob').save(flush:true)
		UserRole.create userUser, userRole, true
        
        //Check make sure stuff is all good
        assert User.count() == 2
        assert Role.count() == 2
        assert UserRole.count() == 2
    }
    def destroy = {
    }
}
