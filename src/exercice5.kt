/*
Créer une programme qui détermine si une chaine de caractères est un palindrome
*/

fun direPalindrome(texte: String): Boolean {
    val moitie = texte.length / 2
    for (i in 0..moitie) {
        if (texte[i] != texte[texte.length - i - 1]) {
            return false
        }
    }
    return true
}

fun main(){
    println(direPalindrome("xanax"))
    println(direPalindrome("depression"))
    println(direPalindrome("cha"))
    println(direPalindrome("kayak"))


}