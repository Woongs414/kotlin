fun main(){
    var map = mapOf<String,String>(Pair("one","hello"), "two" to "world")
    //Map객체의 키와 같은 Pair객체 이용가능
    //키 to 값 형태도 이용가능
    println(
        """
            map size: ${map.size}
            map data : ${map.get("one")}, ${map.get("two")}
        """.trimIndent()
    )
}