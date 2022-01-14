package com.wolf.oop

interface CreditCard{
    var cardNumber:Double
    fun score(scores:Int)
}

class MasterCard(override var cardNumber: Double) :CreditCard{
    override fun score(scores: Int) {
        if(scores <=100){
            println("Negative Score")
        }else{
            println("Positive Score")
        }
    }

}

class VisaCard(override var cardNumber: Double) :CreditCard{
    override fun score(scores: Int) {
        if(scores <=50){
            println("Negative Score")
        }else{
            println("Positive Score")
        }
    }

}

fun main(){
    val visa = VisaCard(23456.0)
    visa.score(300)

    val master = MasterCard(23456.0)
    visa.score(300)
}