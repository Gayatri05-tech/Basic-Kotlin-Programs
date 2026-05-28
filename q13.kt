//Function to calculate Simple Interest
fun calculateSI(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}
fun main() {
    val si = calculateSI(1000.0, 5.0, 2.0)
    println("Simple Interest = $si")
}
