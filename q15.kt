//Program to generate the Fibonacci series upto N terms using loops
fun main() {
    var a=0
    var b=1
    var n=10
    for(i in 1..n){
        print("$a")
        val next=a+b
        a=b
        b=next
    }
}
