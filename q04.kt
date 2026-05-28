fun main() {
    var num=5394
    var reverse=0
    while(num!=0) 
    {
        val digit=num % 10
        reverse=reverse*10+digit
        num/=10
    }
    println(reverse)
}
