class User2(_id:Int, _name:String, _age:Int) {
    val id: Int = _id //val은 set못한다 초기화후 값 변경불가기때문
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
            //변수뒤에 ?:는 삼항연사자를 뜻한다
            //(tempName 값 존재 : tempName값대입 , 값 존재X 뒤에 에러)
        }
    var age: Int = _age
}

    fun main(){
        val user2 = User2(1,"kildong",35)
        user2.name=""
        println("user2.name =  ${user2.name}")
    }
