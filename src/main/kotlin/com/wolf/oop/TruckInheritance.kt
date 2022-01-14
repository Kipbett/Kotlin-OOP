package com.wolf.oop

class TruckInheritance:CarConstructor {
    var subType:String? = null
    constructor(type:String, model:Int, price:Double, miles:Int, owner:String, subType:String):super(
        type, model, price, miles, owner){
        this.subType = subType
    }

    constructor(type:String, model:Int, price:Double, miles:Int, subType:String):super(
        type, model, price, miles){
        this.subType = subType
    }

    override fun getCarPrice(): Double {
        return this.getPrice()-(this.miles!!*20)
    }
}

fun main(){
    var truck1 = TruckInheritance("Isuzu", 2033, 230000.0, 100, "Brian", "Gubbage Truck")
    println("Truck Type: ${truck1.type}")
    println("Truck Model: ${truck1.model}")
    println("Truck Price: ${truck1.getPrice()}")
    println("Truck Oner: ${truck1.owner}")
    println("Truck Sub-Type: ${truck1.subType}")

    var truck2 = TruckInheritance("Hyundai", 234, 23000.0, 10, "Luggage Truck")
    println("Truck Type: ${truck2.type}")
    println("Truck Model: ${truck2.model}")
    println("Truck Price: ${truck2.getPrice()}")
    println("Truck Sub-Type: ${truck2.subType}")
}