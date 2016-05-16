package betty.security

import groovy.transform.ToString

@ToString(cache = true, includeNames = true, includePackage = false)
class UserRole implements Serializable {
    private static final long serialVersionUID = 1


    User user
    Role role

    static belongsTo = [user: User]

    UserRole(User u, Role r) {
        user = u
        role = r
    }

    static constraints = {
    }

    static mapping = {
        id composite: ['user', 'role']
        version false
    }

    static UserRole create(User user, Role role, boolean flush = false) {
        def instance = new UserRole(user, role)
        instance.save(flush: flush, insert: true)
        instance
    }
}

