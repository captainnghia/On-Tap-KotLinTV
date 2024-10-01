package fpoly.nghianmph38531.ontapkotlin

import kotlin.math.max

fun main(){
    var a = 5
    var b = 6
    var max1 = if (a >= b) a else b // a >= b ? a : b
    max1 = if (a > b ) a else if (a < b) b else a

    println(max1)

    a = 7
    var max2 = 0
    if(a >= b ){
        max2 = a
    }else
        max2 = b
    println(max2)

    var max3 = 0
    a = 6
    if(a > b){
        max3 =a
    }else if ( a<b )
        max3 = b
    else{
        println(" a == b")
        max3 = a
    }
    println(max3)


    var s = "Hello"
    var y = 1
    var sr = ""
    when (y){ // switch
        1 -> sr = s.uppercase()
        2,3,4 -> sr = s.lowercase()
        //in 2..4 -> sr = s.lowercase()

        else -> {
            println("do something")
            sr = s
        }
    }

    println(sr)
}