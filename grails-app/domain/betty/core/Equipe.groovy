package betty.core

class Equipe {

    String nom

    static hasMany = [matches: Match]
    static hasOne = [groupe: Groupe]

    static constraints = {
    }
}
