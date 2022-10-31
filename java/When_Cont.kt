fun main() {
    var x =15
    when (x) {
       in 1..10 -> print("x는 1이상 10 이하")
        !in 10..20 -> print("10이상 20이하의 범위밖에 있음")
        else -> print("x는 어떤 범위에도 없다.")
    }
}