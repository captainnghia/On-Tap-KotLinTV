package fpoly.nghianmph38531.ontapkotlin

fun main() {
    var list = listOf(10, 20, 30, 40, 50)
    println("--for--")
    for (i in 0..(list.size - 1)) {
        println(list[i])
    }

    println("----")
    for (i in 0..<list.size) {
        println(list[i])
    }

    println("----")
    for (i in 0 until list.size) {
        println(list[i])
    }

    println("----")
    for (i in list.size - 1 downTo 0) {
        println(list[i])
    }

    println("----")
    for (i in 0 until list.size step 2) {
        println(list[i])
    }

    println("----")
    for (i in list.size - 1 downTo 0 step 2) {
        println(list[i])
    }

    println("--for each--")
    for (item in list) {
        println(item)
    }

    println("----")
    list.forEach {
        println(it)
    }

    println("--break--")
    for (i in 0..<list.size) {
        if (i == 2)
            break
        println(list[i])
    }

    println("--continue--")
    for (i in 0..<list.size) {
        if (i == 2)
            continue
        println(list[i])
    }

    println("--while--")
    var i = 0
    while (i < list.size) {
        println(list[i])
        i++
    }

    println("--do while--")
    i = 0
    do {
        println(list[i])
        i++
    } while (i < list.size)

    println("--while true--")
    i = 0
    while(true){
        println(list[i])
        i++
        if(i >= list.size)
            break
    }
}