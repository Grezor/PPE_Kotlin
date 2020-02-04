fun sum(x: Int, y: Int): Int{
    return x + y
}
// y est un paramétre optionnel car il y a une valeur par défault
// y a uen valeur par default
fun multiply(x: Int, y: Int = 1): Int{
    println("x => $x, y => $y")
    return x * y
}


fun main(){
    //our faire l'apel
    println(multiply(7))
    val somme = sum(4, 9);
    println(somme) // affiche 13
    println(sum(5,5))
    val texte = "la somme de 6 et 7 est ${sum(6, 7)}"
    println(texte)

}