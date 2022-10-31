fun main(){
    val a = 6
    val b = 0
    val c : Int

    try{
        c = a/b
    } catch(e: Exception){ //e라는객체에 Exception내용 넣음
        println("Exception is handled")
    } finally{
        println("finally 블록은 반드시 항상 실행됨")
    }
}