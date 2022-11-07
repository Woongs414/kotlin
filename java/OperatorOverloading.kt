class Point(var x:Int = 0, var y: Int = 10){
    // plus함수의 연산자 오버로딩
    operator fun plus(p:Point) : Point{
        return Point(x + p.x, y + p.y)
    }
}

fun main() {
    val p1 = Point(3,-8)
    val p2 = Point(2,9)

    var point = Point()
    point = p1 + p2 //Point객체의 + 연산이 가능하게됨
    // plus메소드로인해 x와 y에는 p1의값
    // p.x와 p.y에는 p2의 값이 들어간다.

    println("point = (${point.x},${point.y})")

}