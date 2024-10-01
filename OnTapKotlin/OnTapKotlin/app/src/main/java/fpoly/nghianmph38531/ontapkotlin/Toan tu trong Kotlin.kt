package fpoly.nghianmph38531.ontapkotlin

fun main(){
    var x = 7
    var y = 3

    /// + - * / ++ --
    x+= 1
    y *= 2
    println("$x $y")

    // > < >= <= == !=
    var m = "h"
    var n = "i"
    println("${m == n}")
    println("${m > n}")

    // as if !is
    var o:Any
    o = m
    (o as String).uppercase()

    println("${m is String}")
    println("${m !is String}")

    // || && !
    println("${x> 5 && y < 10}")

    // & ! ^ ~ << >> >>>
    // and or xor .inv() shl ushr

}