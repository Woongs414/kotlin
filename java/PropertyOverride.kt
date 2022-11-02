open class First{
    open val x: Int = 0 //오버라이딩 기능(open사용:상속가능)
    get() {
        println("First x")
        return field //x필드를 뜻함
    }
    val y:Int = 0 //open 키워드가 없으면 final 프로퍼티임
    //(val y:int 는 프로퍼티 , y:Int는 필드)
}
class Second : First() {//First상속
     override val x: Int = 0 //부모와 구현이 다름
        get(){
            println("Second x")
            return field + 3
        }
//override val y:Int = 0 에러! 오버라이딩 불가
}
fun main(){
    val second =Second()
    println(second.x) // 오버라이딩된 두번째 클래스 객체의 x
    println(second.y) //부모로 상속받은 값
        }