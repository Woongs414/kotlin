class GenericNull<T>{
    //기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1:T, arg2:T){
        println(arg1?.equals(arg2))
    }
}

fun main(args:Array<String>){
    val obj = GenericNull<String>() //non-null로 선언됨
    obj.EqualityFunc("Hello","World")
    //null허용하지않음

    val obj2 = GenericNull<Int?>()// null가능한 형식으로 선언
    obj2.EqualityFunc(null,10)
    //원래결과는 false인데 null허용으로 null나옴
}