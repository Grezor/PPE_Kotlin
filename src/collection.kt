// les collection sont tout types de données qui peret d'avoir un ensemble de valeur
fun main(){
    val l = listOf(2,4,4,5)
    val l2 = listOf("it's me ", "marion")
    // si on veut changer
    val l3 = mutableListOf(6,5,3,2)

    println(l[0])
    println(l2[1])

    //ici je modifie les elements
    l3[2] = 20
    l3.add(10)

    for (item in l3){
        print("$item - ")
    }

    println()

    val d = mapOf("AM" to "Amaury", "NI" to "Nicolas", "JE" to "JESSICA")
    println(d["AM"])

    for ((k,v) in d){
        print("$k => $v,")
    }
}