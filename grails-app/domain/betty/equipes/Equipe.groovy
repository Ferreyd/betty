package betty.equipes

import betty.organisation.Match

class Equipe {

    String nom //Nom de l'équipe
    boolean nationale = true // sélection nationale ou non

    static hasMany = [matches: Match] // Liste des matches de l'équipe

    static constraints = {
    }
}
