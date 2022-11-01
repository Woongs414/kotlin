internal class InternalClass{
    //고정변수 var 사용해서 i값은 바꿔서 대입할수 없다.
    internal var i = 1
    internal fun icFunc(){
        i + 1 //접근허용
    }
    fun access(){
        icFunc() //접근허용
    }
}
class Other {
    //가변변수 val을 사용해서 선언한후 값 바꿔 대입할수있다
    internal val ic = InternalClass()

    // 프로퍼티 지정시 internal로 맞춰야한다.
    fun test() {
        ic.i //접근허용
        ic.icFunc() // 접근허용용    }
    }
}