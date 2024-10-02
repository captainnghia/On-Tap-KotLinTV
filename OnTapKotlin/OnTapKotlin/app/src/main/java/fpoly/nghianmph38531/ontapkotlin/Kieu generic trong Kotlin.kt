package fpoly.nghianmph38531.ontapkotlin

class MyClass<A, B>(var a: A, var b: B) {
    override fun toString(): String {
        return "MyClass data ${a!!::class.simpleName} ${b!!::class.simpleName}"
    }


}

fun <c> myFun(a: c, b: c): String {
    return "MyClass data ${a!!::class.simpleName} ${b!!::class.simpleName}"
}

val <T> T.mySize: Int where T : String
    get() = this.length

val <T> T.myValue: Long where T : Long
    get() = (this + 2)

fun main() {
    var list: List<Int> = listOf(1, 2, 3)
    var myClass: MyClass<String, Int> = MyClass("Hello", 1)
    var myClass2 = MyClass("Hello", 2)
    var myClass3 = MyClass<String, Long>("Hello", 3)

    println(myClass)
    println(myClass2)
    println(myClass3)

    println(myFun(5, 6))

    "Hello world".mySize

    println(234L.myValue)
}