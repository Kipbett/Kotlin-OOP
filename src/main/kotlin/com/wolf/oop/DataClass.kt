package com.wolf.oop

data class  Person(var name:String, var age:Int, var gender:String)

fun main(){
    var person = Person("Brian", 26, "Male")
    println(person.name)
    println(person.age)
    println(person.gender)
}