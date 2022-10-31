fun main(){
    for(i in 1..5){
        if(i==3)break
        print(i)
        //break는 가장 가까운 반복분 탈출(조건문X)
    }
    println()
    println("outside")
}