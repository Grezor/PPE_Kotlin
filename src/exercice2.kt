import kotlin.random.Random

/*
Créer un programme qui affiche deux nombres réels aléatoires. Le deuxième doit être plus grand que le premier
Astuces: utiliser Random (https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/index.html)
 */
fun main(){
    val a = Random.nextDouble()
    println(a)

    val b = Random.nextDouble(a)
    println("premier nombre $b, deuxieme nombre $a")
}

