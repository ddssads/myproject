package com.sc

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    var h = Human()
    h.hello()
    val age = 19//val不能改變;kotlin自動推斷變數資料型態
    //age = 20 val不能改變 報錯
    var weight = 66.5f//var可以改變
    var height : Int;
    height = 177;
    val adult = true;
    var name : String
    name = "Kotlin"
    println("name:" + name + "age:" + age + "weight:" + weight + "height:" + height + "adult:" + adult)
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}