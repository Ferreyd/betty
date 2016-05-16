package betty.organisation

import betty.equipes.Equipe

class Competition {

    String nom //nom de la compétition
    String type //Type de la compétition championnat ou coupe
    static hasMany = [equipes : Equipe] //Les équipes participantes

    static constraints = {
    }
}
