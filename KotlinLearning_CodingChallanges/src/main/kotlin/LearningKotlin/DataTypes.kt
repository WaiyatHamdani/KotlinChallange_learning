package org.example.LearningKotlin

class DataTypes {
    fun printdatatype(){
        var name = "waiyat" // you dont need to put datatype it autamatically assign but you can!! Var is can be change
        val phonenumber:String = "2034999988" // mutable cannot be change
        var age: Int  = 30  // this one is assign the variable age into integer
        var isLookingJob: Boolean = true
        var mygpa: Double = 3.18
        var myfloat: Float = 4.44444444F

        println(name +" -> var name = \"waiyat\" // you dont need to put datatype it autamatically assign but you can!! Var is can be change") // not sting intoploation

        // after this point i will be using string interpolation
        println("answer: $phonenumber -> val phonenumber:String = \"2034999988\" // mutable cannot be change")
        println("answer : $isLookingJob  var isLookingJob: Boolean = true")
        println("answer : $mygpa -> var mygpa: Double = 3.18")
        println("$myfloat -> var myfloat: Float = 4.44444444F")

    }

    fun myNullable(){
        var nullablevariable: String? = null
        var length: Int? = nullablevariable?.length


        println("var nullablevariable: String? = null   answer: $nullablevariable")
        println("var length: Int? = nullablevariable?.length   answer: $length   --> If the length is null, it will simply return null without throwing a NullPointerException")
    }





}