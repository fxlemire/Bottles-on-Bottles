
import secure.Role
import secure.User
import secure.UserRole


class BootStrap {

    def init = { servletContext ->
        
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush:true)
        def adminUser = new User(username: 'admin', password: 'FishTest').save(flush:true)
        UserRole.create adminUser, adminRole, true
        
        //Check make sure stuff is all good
        assert User.count() == 1
        assert Role.count() == 1
        assert UserRole.count() == 1
    }
    def destroy = {
    }
}
