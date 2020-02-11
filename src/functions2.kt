fun showResult(x: Int, y: Int, f: (Int, Int)->Int){
    val result = f(x, y)
    println(result)

}

fun main() {
    //fonction dans une variable
    val f1 = ::sum
    println(f1(3,5))

    showResult(6,5, ::sum)
    showResult(6,5, f1)
    showResult(6,5, ::multiply)


}