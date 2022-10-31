// 코틀린은 가변 인자를 지원한다.
// 사용하려면 인자 앞에 vararg를 붙이면 된다.

fun main(args:Array<String>){
    normalVarargs(1,2,3,4) //4개의 인자 구성
    normalVarargs(4,5,6)
}

fun normalVarargs(vararg counts:Int){ //vararg배열아님
    for (num in counts)
    {
        println("$num")
    }
    print("\n") //줄바꿈
}