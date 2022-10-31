fun main(){
//4.shl(bits) 4를 표현하는 비트를 bits만큼 왼쪽(shl)으로 이동(부호 있음)
// 7.shr(bits) 7을 표현하는 비트를 bits만큼 오른쪽(shr)으로 이동(부호 있음)
// 12.ushr(bits) 12를 표현하는 비트를 bits만큼 오른쪽 이동(부호 없음)
// 9.and(bits) 9를 표현하는 비트와 bits를 표현하는 비트로 논리곱 연산
// 4.or(bits) 4를 표현하는 비트와 bits를 표현하는 비트로 논리합 연산
// 24.xor(bits) 23를 표현하는 비트와 bits를 표현하는 비트의 배타적 연산
// 78.inv( ) 78을 표현하는 비트를 모두 뒤집음

    var x = 4
    var y = 0b0000_1010 //10진수 10
    var z = 0x0F // 10진수 15

    println("x shl 2 -> ${x shl 2}") // 16
    println("x.inv -> ${x.inv()}") // -5

    println("y shr 2 -> ${y/4}, ${y shr 2}" ) // 2, 2
    println("x shl 4 -> ${x*16}, ${x shl 4}") //64 , 64
    println("z shl 4 -> ${z*16}, ${z shl 4}") // 240, 240

    x = 64
    println("x shr 4 -> ${x/4}, ${x shr 2}") // 16,16
}