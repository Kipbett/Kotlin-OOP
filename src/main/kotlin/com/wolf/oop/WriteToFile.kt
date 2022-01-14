package com.wolf.oop

import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){

    writeToFole("Brian")
}

fun writeToFole(str:String){
    try {
        var fo = FileWriter("Test.txt", true)
        fo.write(str+"\n")
        fo.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun readFromFile(){
    try {
        var rf = FileReader("Test.txt")
        var c:Int?
        do {
            c = rf.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}