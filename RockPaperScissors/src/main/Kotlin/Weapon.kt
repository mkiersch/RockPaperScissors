enum class Weapon {
    ROCK,
    PAPER,
    SCISSORS;

    fun fight(opponent: Weapon): Result {
        return when {
            this == opponent -> Result.DRAW
            this == ROCK && opponent == PAPER -> Result.LOSE
            this == PAPER && opponent == SCISSORS -> Result.LOSE
            this == SCISSORS && opponent == ROCK -> Result.LOSE
            else -> Result.WIN
        }
    }
}