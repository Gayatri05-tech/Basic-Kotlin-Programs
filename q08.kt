//Program to count the number of digits in a given integer
fun main() {
    var num = 67891
    var count = 0

    while (num != 0) {
        num /= 10
        count++
    }
    println("Number of digits = $count")
}
