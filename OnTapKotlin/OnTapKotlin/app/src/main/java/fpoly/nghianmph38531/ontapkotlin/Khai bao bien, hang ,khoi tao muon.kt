package fpoly.nghianmph38531.ontapkotlin

const val kc:String = "Hello"
fun main(){
    var i:Byte = 0
    i++
    var j = 1
    println("$i $j")

    val k: String = "Hello"
//    k = "Hi"
//    const val kc:String = "Hello"

    lateinit var s: String // attribute in class
//    // var s2: String
//    println("$s  $s2")

    var l: Long? = null
//i = null

    var o: Any ="World"
    k.uppercase()
    (o as String).uppercase()
    var o2:Any? = null
    o2 = "Hello World"
}