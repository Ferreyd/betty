package betty.organisation

import betty.equipes.Score
import betty.organisation.Match
import betty.security.User

class Prediction {

    Match match
    static belongsTo = [user : User]
    Score predictedScore

    static constraints = {
    }
}
