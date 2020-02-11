// une classe qui abstrait
open abstract class Pokemon(val name: String, var attack: Int, var pv: Int)

class Pikachu(name: String, attack: Int, pv: Int): Pokemon(name, attack, pv)
class Carapuce(name: String, attack: Int, pv: Int): Pokemon(name, attack, pv)


    fun main(){
        val pokemon = Pikachu("Pi",20, 100)
        println("name of pokemon ${pokemon.name} avec d'attaque ${pokemon.attack} et de de vie ${pokemon.pv}")

        pokemon.pv = 20
        pokemon.attack = 10

        val Cara = Carapuce("PU PU",2, 120)
        println("[change value] pokemon ${Cara.name} avec d'attaque ${Cara.attack} et de de vie ${Cara.pv}")
    }
