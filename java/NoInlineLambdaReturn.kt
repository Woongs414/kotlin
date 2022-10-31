fun main(){
    retFunc1()
}

fun inlineLambda1(a:Int,b:Int,out:(Int,Int)-> Unit){
    //inline이 제거됨(InlineLambdaReturn.kt참고)
    out(a,b)
}

fun retFunc1() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> // ① 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // ② 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // ③
    println("end of retFunc") // ④ 이 부분이 실행됨
}