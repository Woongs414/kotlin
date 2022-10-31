fun main(){
    fun sum(no:Int):Int{
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return sum
    }

    val name: String = "kkang"
    println("name : $name, sum: ${sum(10)},plus: ${10+20}")
}

fun main1(){
    var a =1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}" //문자열에 표현식 사용

    println("str1: \"$str1\" , str2: \"$str2\"")
}