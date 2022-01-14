package com.wolf.oop

import java.util.*
import kotlin.collections.ArrayList

class Persons(var name:String, var age:Int):Comparable<Persons>{
    override fun compareTo(other: Persons): Int {
        TODO("Not yet implemented")
        return this.age - other.age
    }

}
fun main(args:Array<String>){
    var listOfNames = ArrayList<Persons>()
    listOfNames.add(Persons("Brian", 26))
    listOfNames.add(Persons("Kip", 28))
    listOfNames.add(Persons("Bett", 30))

    println("Before Sorting")
    for(name in listOfNames){
        println(name)
    }

    println("After Sorting")
    listOfNames.sort()
    for(name in listOfNames){
        println(name)
    }
}