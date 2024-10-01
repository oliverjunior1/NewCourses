/*fun main() {
    val x = 20
    val y = 18

    if (x < y) {
        println("X is greater than Y")
    }
    else {
        println("Y is greater than X")
    }
}
-------------------------------------------------
    */
fun main() {
    val hour = 22
    if (hour>=0 && hour<12) {
        println("Good morning!")
    }else if (hour>= 12 && hour<18) {
        println("Good afternoon!")
    }else if (hour>18 && hour<24) {
        println("Good evening!")
    }else {
        println("Invalid number")
    }
}
