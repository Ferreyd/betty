package betty.equipes

import betty.organisation.Match

class Score {
    int scoreEquipeA
    int scoreEquipeB

    static belongsTo = [match : Match]


    boolean tirAuxButs = false
    boolean prolongation = false
    static constraints = {
    }
}
