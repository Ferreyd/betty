package betty.organisation

import betty.equipes.Equipe
import betty.equipes.Score

class Match {
    Equipe equipeA
    Equipe equipeB

    Equipe gagant

    static hasMany = [prediction: Prediction]
    static hasOne = [score: Score]
    static belongsTo = [competition: Competition]

    static constraints = {
    }
}
