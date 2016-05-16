package betty.core

class Match {
    Equipe equipeA
    Equipe equipeB

    boolean prediction = true

    static hasOne = [score : Score]
    static belongsTo = [equipe: Equipe]

    static constraints = {
    }
}
