// invoke 호출 연산자(함수호출을 돕는다)
class Manager{
    operator  fun invoke(value:String){
        println(value)
    }
}

fun main(){
    val manager = Manager()
    manager("Do Somthing for me!")
    //manager.invoke("...")형태로 호출되며
    //invoke가 생략되었다.
}