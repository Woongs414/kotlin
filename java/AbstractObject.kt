//추상클래스의 선언
abstract class Printer{
    abstract fun print() //추상 메서드(재정의 필요)
}

val myPrinter = object: Printer(){
//object표현식으로 객체 인스턴스 생성

    override fun print(){ //추상 메서드의 구현
        println("출력합니다.")
    }

}

fun main() {
    myPrinter.print()
}