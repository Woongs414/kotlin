fun main(){
    print("Enter the lines:")
    val n = readLine()!!.toInt() //콘솔로 부터 입력받음
/*
	[설 명]
	1. readLine : 코틀린에서 입력을 할때 사용합니다
	(기본 string 형태로 반환)
	2. readLine()!!.toInt() : 기본 string 형태로 입력되는 것을
	int 형으로 변환시켜줍니다
	*/
    for(line in 1..n){
        for(space in 1..(n-line)) print(" ")//공백출력
        for(stat in 1..(2* line -1)) print("*") //별표 출력
        println()
    }
}