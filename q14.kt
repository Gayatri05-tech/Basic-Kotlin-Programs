//Program to print prime numbers from 1 to
fun main() {
    val n = 20
    for (i in 2..n) {
        var count = 0
        for (j in 1..i) {
            if (i % j == 0) {
                count++
            }
        }

        if (count == 2) {
            print("$i ")
        }
    }
}
