fun main(){
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length?: -1}")
    //세이프 콜과 엘비스 연산자 활용

    var str2 : String? = "Hello Kotlin"
    str2 = null
    // 조건식을 통해 null 상태 검사
    var len = if(str2 != null) str2.length else -1
    println("str1: $str2 length: ${len}")
}
