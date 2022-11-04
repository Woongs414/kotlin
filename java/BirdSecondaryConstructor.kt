class Bird3{
    // 프로퍼티들 - 선언
    var name : String
    var wing : Int
    var beak : String
    var color : String
    // 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name:String, wing:Int, beak:String, color:String){
        this.name = name
    // this.wing은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    //메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){
    val coco = Bird3("mybird", 2, "short", "blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}