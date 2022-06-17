package com.tim.com.tim.score

class Student(var name:String,var eng:Int,var math:Int){
    init {
        println("Test")
    }
}
fun main(){
    val stu = Student("Jack",55,60)
    println(stu.eng)
}