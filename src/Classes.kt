// une classe qui abstrait
open abstract class Pokemon(val name: String, var attack: Int, var pv: Int){
    abstract fun crier():String
}

class Pikachu(name: String, attack: Int, pv: Int): Pokemon(name, attack, pv) {
    override fun crier(): String {
        return "pika pika"
    }
}

class Carapuce(name: String, attack: Int, pv: Int): Pokemon(name, attack, pv) {
    override fun crier(): String {
        return "Carapuuuucee"
    }
}


fun main(){
        val pokemon = Pikachu("Pi",20, 100)
        println("name of pokemon ${pokemon.name} avec d'attaque ${pokemon.attack} et de de vie ${pokemon.pv} avec comme crie ${pokemon.crier()}")

        pokemon.pv = 20
        pokemon.attack = 10

        val Cara = Carapuce("PU PU",2, 120)
        println("[change value] pokemon ${Cara.name} avec d'attaque ${Cara.attack} et de de vie ${Cara.pv} et avec comme crie ${pokemon.crier()}")
}

// class exemple(name: String, attack: Int, pv: Int): Pokemon(name, attack, pv) {
// simplification de la methode crier
// override fun crier() = "Cardddapuuuucee"
// }

