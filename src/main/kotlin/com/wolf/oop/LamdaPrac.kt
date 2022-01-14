package com.wolf.oop

var sum = {number1:Int, number2:Int -> number1+number2}

fun add(number1:Int, number2:Int):Int{
    return number1+number2
}

fun main() {
    println(sum(3,4))
    println(add(3,4))

    println("Using Lambda in list")

    var ages = listOf<Int>(10,34,32,34,32,12,34)

    println("Use for loop to display the ages")
    for (age in ages){
        println(age)
    }

    println("Use Lamda function to display ages")
    ages.forEach{age -> println(age) }
}