package com.tim.com.tim.score

class Student(var name:String,var eng:Int,var math:Int){
    init {
        println("Test")
    }
    fun pprint(){
        println("$name\t$eng\t$math${getAverage()}")
    }
    fun print(){
        println(name + "\t" + eng + "\t" + math)
    }
    fun getAverage():Int{
        return (eng+math)/2
    }
}
fun main(){
    val stu = Student("Jack",55,60)
    println(stu.eng)
    stu.print()
    stu.pprint()
}