package fpoly.nghianmph38531.ontapkotlin

fun main() {
    var human = Human("Hi", 10)
    human.printInfo()

    var student = Student(1, "s", 4)
    student.printInfo()

    var teacher = Teacher("t", 23)
    teacher.printInfo()

    Teacher.doubleYear(teacher).printInfo()

    println(LoadStatus.Loading)

    Human3.DefaultValue().printInfo()

    var human4 = Human4("h4", 30)
    var human5 = human4.copy(name = "h5")
    println(human5.toString())
}