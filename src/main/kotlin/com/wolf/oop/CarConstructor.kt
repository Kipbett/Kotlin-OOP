package com.wolf.oop

open class CarConstructor {
    var type:String? = null
    var model:Int? = null
    private var price:Double? = null
    var miles:Int? = null
    var owner:String? = null

    constructor(type:String, model:Int, price:Double, miles:Int, owner:String){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
        this.owner = owner
    }

    constructor(type:String, model:Int, price:Double, miles:Int){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
    }
    open fun getCarPrice():Double{
        return this.price!! -(this.miles!!.toDouble()*10)
    }

    fun getPrice():Double{
        return this.price!!
    }
}

fun main() {
    val car = CarConstructor("Range Rover", 2022, 25000.0, 10, "Brian Bett")
    println("Car Type: ${car.type}")
    println("Car Model: ${car.model}")
    println("Car Price: ${car.getPrice()}")
    println("Car Miles: ${car.miles}")
    println("Car Owner: ${car.owner}")
    println("Car new Price: ${car.getCarPrice()}")

    val car2 = CarConstructor("Evoque", 2012, 30000.0, 100)
    println("Car Type: ${car2.type}")
    println("Car Model: ${car2.model}")
    println("Car Price: ${car2.getPrice()}")
    println("Car Miles: ${car2.miles}")
    println("Car new Price: ${car2.getCarPrice()}")
}
