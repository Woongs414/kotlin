class User(_id:Int, _name:String , _age:Int){
    //위 처럼 매개변수는 필드
    //아래 선언은 프로퍼티
    val id:Int = _id //val은 초기화후 값변경불가 즉 set사용불가
    get() = field //필드는 id를 지칭해주는 용어

    var name: String = _name
    get() = field // 필드는 name을 지칭해주는 용어
    set(value){
        field = value
    }

    var age:Int = _age
    get() = field // 필드는 age를 지칭해주는 용어
    set(value){
        field = value
    }
}

fun main(){
    val user1 = User(1,"kildong",30)
    //user1.id = 2 //에러 val 프로퍼티는 값 변경 불가
    user1.age = 35 //세터동작
    println("user1.id = ${user1.id}")//게터동작
    println("user1.name = ${user1.name}")//게터동작
    println("user1.age = ${user1.age}")//게터동작
}