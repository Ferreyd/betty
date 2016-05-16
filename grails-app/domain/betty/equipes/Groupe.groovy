package betty.equipes

import betty.equipes.Equipe

class Groupe {

    def Equipe gagnants = []
    static hasMany = [equipes : Equipe]

    static constraints = {
    }
}
