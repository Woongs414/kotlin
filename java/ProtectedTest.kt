//상속가능하게 open사용
open class Base{
    protected var i = 1
    protected fun protectedFunc(){
        println(i)
        i +=1 //접근허용
        println(i)
    }
    fun access(){
        protectedFunc() // 접근허용
    }
}
class Derived : Base(){
    fun test(base: Base): Int{
        protectedFunc() //Base클래스의 메서드 접근 가능
        return i //Base 클래스의 프로퍼티 접근 가능
    }
}
fun main() {
    val base = Base() //생성가능
/*    base.i // 접근 불가
    base.protectedFunc() //접근불가*/
    base.access() //접근가능
}