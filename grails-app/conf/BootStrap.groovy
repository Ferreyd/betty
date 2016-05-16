import grails.util.Environment
import betty.security.*

class BootStrap {

    def springSecurityService
    def init = { servletContext ->
        createRolesAndAdmin()
    }
    def destroy = {
    }

    def createRolesAndAdmin() {
        def roles = [
                [Role.ROLE_ROOT, "Super administrateur"],
                [Role.ROLE_USER, "User standard"]
        ].each { name, label ->
            def role = Role.findByAuthority(name)
            if (!role) {
                new Role(authority: name, label: label).save(failOnError: true)
            }
        }

        def superUser = User.findByUsername('super')
        def superPass = (Environment.current == Environment.PRODUCTION) ? "123_SUPER_!_" : 'super'
        if(!superUser){
            superUser = new User(username: 'super', password: springSecurityService.encodePassword(superPass),
            enabled: true)
        }
        if (!superUser.save()) {
            println superUser.errors
        }
        UserRole.create(superUser, Role.findByAuthority('ROLE_ROOT'), true)
    }

}
