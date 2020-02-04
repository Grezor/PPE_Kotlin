import kotlin.random.Random

/*
Créer une fonction 'generateList' qui prend un entier 'n' en paramètre. La fonction retourne une liste qui contient n
entiers aléatoires compris entre 0 et 20
 */
fun iscompteurszeo(compteurs: Map<Int, Int>): Boolean {
    return compteurs.filter { it.value != 0 }.count() == 0
    for (v in compteurs.values){
       if (v != 0){
           return false
       }
    }
}

fun main() {
    val compteurs = mutableMapOf(2 to 2, 3 to 4)
    while (!iscompteurszeo(compteurs)) {
        val r = Random.nextInt(0, 5)
        print("$r -")
        val v = compteurs[r]
        if (v != null && v > 0) {
            compteurs[r] = v - 1
        }
    }
}
