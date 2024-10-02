package fpoly.nghianmph38531.ontapkotlin

open class Human {
    var name: String
    var year = 0

    constructor(name: String, year: Int) {
        this.name = name
        this.year = year
    }

    open fun printInfo() {
        println("$name $year")
    }
}

class Human2(var name: String, var year: Int) {

    fun printInfo() {
        println("$name $year")
    }
}

class Student(var id: Int, name: String, year: Int) : Human(name, year) {
    override fun printInfo() {
        println(id)
        super.printInfo()
    }
}

interface People {
    var name: String
    var year: Int

    fun printInfo()
}

class Teacher(name: String, year: Int) : People {
    override var name: String = name
        get() = field
        set(value) {
            field = value
        }
    override var year: Int = year
        get() = field
        set(value) {
            field = value
        }

    override fun printInfo() {
        println("$name $year")
    }

    companion object{
        fun doubleYear(t: Teacher):Teacher{
            return Teacher(t.name, t.year *2 )
        }
    }
}

enum class LoadStatus {
    Init , Loading , Error , Done
}

sealed class Human3(var name: String, var year: Int) {
    class DefaultValue():Human3("Default name", 10)

    fun printInfo() {
        println("$name $year")
    }
}

data class Human4(val name: String , val year: Int )