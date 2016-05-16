package betty.core

class Score {
    int scoreEquipeA
    int scoreEquipeB

    static belongsTo = [match : Match]


    boolean tirAuxButs = false
    static constraints = {
    }
}
