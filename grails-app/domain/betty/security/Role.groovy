package betty.security

class Role implements Serializable {
    public static final String ROLE_ROOT = 'ROLE_ROOT'
    public static final String ROLE_USER = 'ROLE_USER'

    private static final long serialVersionUID = 1


    String authority
    String label

    static constraints = {
        authority nullable: false
        label nullable: false
    }

    static mapping = { cache true }
}
