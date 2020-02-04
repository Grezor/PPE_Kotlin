/*
 Créer une fonction qui prend trois paramètres
 year: entier avec valeur par défaut 2020
 month: entier avec valeur par défaut 1
 message: Chaine de caractères avec valeur par défaut "Hello"
 Cett fonction reroune une chaine de caractères qui suit le
 modèle suivant:
 [message]. Nous somme en [annee] / [mois]
 Créer la fonction 'main' qui affiche le résultat de cette fonction.
 Le choix de la valeur des paramètres est laissé au choix.
 Faire des appels de cette fonction qui en passant:
 - Un seul paramètre
 - Deux paramètres
 - Trois paramètres
 */

fun showMessage(year: Int = 2020, month: Int = 1, message: String = "hello") :String{
    return "${message}, Nous somme en ${year} / ${month}"
}

fun main(){
    println(showMessage(1800))
    println(showMessage(1800, 4))
    println(showMessage(1980,6, "bonjour"))
}