import kotlin.random.Random

fun main() {
    val rounds = 100
    var player1wins = 0
    var player2wins = 0
    var draws = 0

    for(i in 1..rounds){
        val player1Weapon = Weapon.values()[Random.nextInt(Weapon.values().size)]
        val player2Weapon = Weapon.ROCK

        when(player1Weapon.fight(player2Weapon)){
            Result.WIN -> player1wins++
            Result.LOSE -> player2wins++
            Result.DRAW -> draws++
        }
    }

    println("Player1 won $player1wins rounds.")
    println("Player2 won $player2wins rounds.")
    println("$draws draws.")
}
