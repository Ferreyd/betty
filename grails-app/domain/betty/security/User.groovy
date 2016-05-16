package betty.security

import betty.core.Match
import betty.core.Prediction
import grails.plugin.mail.MailMessageBuilder

class User implements Serializable {

    private static final long serialVersionUID = 1

    String username
    String password

    int points


    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    static hasMany = [userRoles: UserRole, predictions : Prediction]

    static constraints = {
        username nullable: false
        password nullable: false

    }

    static mapping = {
        table '`user`'
        password column: '`password`'
    }
}
