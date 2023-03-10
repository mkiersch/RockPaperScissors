import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WeaponTests {

        @Test
        fun testRockBeatsScissors() {
            val rock = Weapon.ROCK
            val scissors = Weapon.SCISSORS
            assertEquals(Result.WIN, rock.fight(scissors))
            assertEquals(Result.LOSE, scissors.fight(rock))
        }

        @Test
        fun testPaperBeatsRock() {
            val paper = Weapon.PAPER
            val rock = Weapon.ROCK
            assertEquals(Result.WIN, paper.fight(rock))
            assertEquals(Result.LOSE, rock.fight(paper))
        }

        @Test
        fun testScissorsBeatsPaper() {
            val scissors = Weapon.SCISSORS
            val paper = Weapon.PAPER
            assertEquals(Result.WIN, scissors.fight(paper))
            assertEquals(Result.LOSE, paper.fight(scissors))
        }

        @Test
        fun testDraw() {
            val rock = Weapon.ROCK
            assertEquals(Result.DRAW, rock.fight(rock))
        }


}