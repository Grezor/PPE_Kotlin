import kotlin.random.Random

fun main(){
    val r = Random.nextInt(0,20)
    if (r % 2 == 0){
        println("pair")
    }else{
        println("impair")
    }


    val  message = "bonne soirée"

    when(message){
        "bonjour" -> println("matin")
        "bonsoir", "bonne soirée" -> println("soir")
        "Bonne nuit" -> println("nuit")
        "bon appétit" ->{
            println("midi")
        }
        else -> println("Inconnu")
    }
}