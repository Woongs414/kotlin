fun main(){
    var score :Double = 85.0
    var grade :Char = 'F'
    if(score>=90){
        grade ='A'
    } else if(score in 80.0 .. 89.9){
        grade = 'B'
    }
    println("scroe : ${score}, ${grade}")
}