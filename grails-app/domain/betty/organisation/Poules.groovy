package betty.organisation

import betty.equipes.Groupe

class Poules {

    static hasMany = [groupes: Groupe, matches: Match]

    static constraints = {
    }
}
