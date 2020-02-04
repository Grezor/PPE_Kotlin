/*
Créer une fonction 'findMax' qui prend deux réels en paramètre et retourne le réel le plus grand
Crée une fonction 'findMin' qui prend deux réels en paramètre et retourne le réel le plus petit
Créer une fonction main qui affiche le résultat de l'appel de findMax et findMin
 */

fun findmax(a: Int, b: Int){

}

fun findMin(a: Double, b:Double): Double{

    if (a < b){
        return  a
    }else{
        return b
    }

}

fun main(){
    println(findMin(3.0, 110.3334))
    println(findMin(3.0, -110.3334))
}