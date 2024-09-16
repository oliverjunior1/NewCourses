

//fun main() {
    /* 
    //while
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
//--------------------------------------
// Arrays
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

for(car in cars) {
    println(car)

//-----------------loop_for------------------------------
    
val cars = arrayOf("Volvo", "BMW", "Ford", "Ford")
for (x in cars) {
    println(x)
}

//-----------------------range---------------------------
for (nums in 5..15) {
    println(nums)
}

fun main() {
    println("Hello World!")
}
main()

//-----------------------class---------------------------
class Car {
    var brand = ""
    var model = ""
    var year = 0
}

var myCar = Car()
myCar.brand = "Volkswagen"
myCar.model = "Polo"
myCar.year = 2009

println(myCar.brand)
println(myCar.model)
println(myCar.year)

//---------------------constructor----------------------------
class Person {
    var name = " "
    var lname = " "
    var age = 0
}
var p1 = Person()
p1.name = "Joaquim"
p1.lname = "Rodrigues"
p1.age = 41

println(p1.name)
println(p1.lname)
println(p1.age)
}
*/
//-----------------------class-functions-----------------------------------
class Car(var brand:String, var model:String, var year:Int) {
    //Class function
    fun drive() {
        println("Wroom!")
    }
}
fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    c1.drive()
}



