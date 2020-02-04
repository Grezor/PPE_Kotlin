import java.security.cert.CertificateNotYetValidException
import java.time.Month
import java.time.Year

// crée uen fonction qui prend 3 paramtetre
// year : entier avec cvaleur par défault 2020
// month: entier avec valeur par default 1
// message chaine de caractère avec valeur par défault "hello"
// Cette fonction retourne uen chaine de caractère qui suit le modele suivant

// [messaage],  Nous somme en [année] / [mois]
// crée la fonction qui affiche le résultat de cette fonction
// le choix de la valeur des paramétre est laissé au choix

fun showMessage(year: Int = 2020, month: Int = 1, message: String = "hello") :String{
    return "${message}, Nous somme en ${year} / ${month}"
}

fun main(){
    println(showMessage(1800))
    println(showMessage(1800, 4))
    println(showMessage(1980,6, "bonjour"))
}