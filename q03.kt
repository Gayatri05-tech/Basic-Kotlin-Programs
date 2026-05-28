fun sum(n:Int):Int {
    var total=0
    for(x in 1..n) {
        total+=x
    }
    return total
    }
    fun main() {
    println(sum(5))
}
