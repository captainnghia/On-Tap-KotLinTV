package fpoly.nghianmph38531.ontapkotlin

fun sum1(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum2(a: Int, b: Int, c: Int) {
    // khong tra ve
    println("${a + b + c}")
}

fun sum3(a: Int = 10, b: Int = 20, c: Int = 30) {
    println("${a + b + c}")
}

fun sum4(a: Int = 10, b: Int = 20, c: Int = 30) = println("${a + b + c}")

// trả về nhiều hơn 1 gía trị
fun sum5(a: Int = 10, b: Int = 20, c: Int = 30): Pair<Int, String> {
    return Pair(a + b + c, "String: ${a + b + c}")
}

private fun printElement() = fun(v: Int){
    println("String1 $v")
    println("String2 $v")
}

class A {
    fun print1(s: String){
        println(s)
    }
    infix fun print2(s: String){
        println(s)
    }
}

fun Int.doMore(){
    println("doMore ${this}")
}
fun main() {
    println(sum1(1, 2, 3))
    sum2(2, 2, 2)
    sum2(b = 4, c = 4, a = 1)    // dao vi tri truyen
    sum3(a = 100)
    sum4(a = 100)
    println(sum5())

    var list = listOf(1, 2, 3)
    list.forEach { (println("String $it")) }

    list.forEach{ v: Int ->
        println("String1 $v")
        println("String2 $v")
    }

    list.forEach(fun(v: Int){
        println("String1 $v")
        println("String2 $v")
    })

    list.forEach(printElement())

    var a = A()
    a.print1("Hello")
    a print2 "World"

    var v = 50
    v.doMore()
}