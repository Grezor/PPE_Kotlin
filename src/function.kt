fun main() {
    // boucle de 0 a 10
    for (i in 0..10) {
        print("$i -")
    }

    println()

    for (i in 6 downTo -7 step 2) {
        print("$i ,")
    }
    println()

    var x = 0
    while (x < 10) {
        print("$x , ")
        x += 1
    }
}