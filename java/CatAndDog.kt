interface Pet2 {
    var category: String //추상 프로퍼티
    val msgTags: String // val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"
    fun feeding() //추상 메서드
    fun patting() { //일반 메서드
        println("Keep patting!")
    }
}
open class Animal(val name: String)
// ① feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet2 {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat7(name: String, override var category: String) : Animal(name), Pet2 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
class Master {
    fun playWithPet(dog: Dog) { // ② 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat7) { // ③ 고양이를 위한 메서드
        println("Enjoy with my cat.")
    } }
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat7("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat) }

/* 아래의 방법도 가능하다.
class Master {
    fun playWithPet(dog: Dog) { // ② 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my ${dog.name}.")
    }
    fun playWithPet(cat: Cat7) { // ③ 고양이를 위한 메서드
        println("Enjoy with my ${cat.name}.")
    } }
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat7("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat) }*/
