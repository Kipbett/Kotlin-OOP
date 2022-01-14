package com.wolf.oop

fun main(args:Array<String>){

    var t1 = MyThread("Thread 1")
    t1.start()

    var t2 = MyThread("Thread 2")
    t2.start()

    var t3 = MyThread("Thread 3")
    t3.start()

    var t4 = MyThread("Thread 4")
    t4.start()
}

class MyThread(): Thread() {

    var threadName:String = ""
    constructor(threadName:String):this(){
        this.threadName = threadName
        println(this.threadName+" is Started")
    }
    override fun run(){
        var count = 0
        while (count < 10){
            println(this.threadName+" Count $count")
            count++

            try{
                Thread.sleep(1000)
            } catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}