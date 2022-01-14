package com.wolf.oop

class Car(val type:String, val model:Int, val price:Double, var miles:Int, val owner:String) {

//    init{
//        println("Car object initiaised")
//    }

    fun getCarPrice():Double{
        return this.price-(this.miles.toDouble()*10)
    }
}

fun main(){
    val car = Car("Range Rover", 2022, 25000.0, 10, "Brian Bett")
    println("Car Type: ${car.type}")
    println("Car Model: ${car.model}")
    println("Car Price: ${car.price}")
    println("Car Miles: ${car.miles}")
    println("Car Owner: ${car.owner}")
    println("Car new Price: ${car.getCarPrice()}")

    var listOfCars = arrayListOf<Car>()
    listOfCars.add(Car("Range Rover", 2022, 25000.0, 10, "Brian Bett"))
    listOfCars.add(Car("Land Cruiser", 2022, 23000.0, 30, "Brian Bett"))
    listOfCars.add(Car("Toyota", 2022, 20000.0, 100, "Brian Bett"))
    listOfCars.add(Car("Nissan", 2022, 5000.0, 35, "Brian Bett"))

    for(car in listOfCars){
        println("------------------------")
        println("Car Owner: ${car.owner}")
        println("Car Price: ${car.getCarPrice()}")
    }
}