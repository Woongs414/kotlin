interface Pet{
    //abstract 키워드가 없어도 기본은 추상 프로퍼티
    var category:String
    fun feeding() // 마찬가지로 추상 메서드
    fun patting() {
    //일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") //구현부

    }    
}
class Cat(override var category:String):Pet{

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main(){
    val obj = Cat("small")
    println("Pet Catagory:${obj.category}")
    //$값은 내가 가지고있는값
    //${n.값}은 다른 객체가 가지고있는 값을 호출
    obj.feeding()// 구현된 메서드
    obj.patting()//기본 메서드
}