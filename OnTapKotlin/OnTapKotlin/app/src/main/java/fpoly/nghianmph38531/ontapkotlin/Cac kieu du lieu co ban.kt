package fpoly.nghianmph38531.ontapkotlin

fun main(){
    var name = "Kotlin"

    println("Hello, " + name + "!")

    /// Các kiểu dữ liệu cơ bản
    // number

    var i = 10
    i++
    val j : Byte = 11 // const
    var k: Long = 12L
    println("$i $j")

    var d = 1.5
    var e: Float = 1.5f
    println("$d $e")

    // String , Char
    var s1 = "az"
    var c1 = s1[1] /// kí tự , lấy chữ a
    s1.uppercase()
    s1.trim()
    var s2 = """Hi 
        |World
    """.trimMargin()
    println("$s1 $c1")
    println(s2)

    // boolean
    val b:Boolean = true
    println(!b)

    // pair triple
    var p = Pair(4, true)
    var p2 = Pair<Long, Boolean>(4, true)
    var p3: Pair<Long, Boolean> = Pair(4, true)
    var (e1, e2) = p

    var t = Triple<String, Boolean, Byte>("A", false, 1)
    println("$e1 $e2 ${t.second}")

    // collection
    var l1:List<Int> = listOf(1, 2,3,)
    var l2 = mutableListOf(4,5,6)
    l2.removeFirst()
    println("$l1 $l2")

    var set1 = setOf("a","a", "A","b")
    var set2 = mutableSetOf("c", "d")
    set2.add("d")
    set2.add("e")
    println("$set1 $set2")

    var mapA = mapOf("x" to 1)
    var mapB = mutableMapOf("y" to 2)
    mapB.put("z", 3)

    println("$mapA ${mapB.containsKey("y")}")
}