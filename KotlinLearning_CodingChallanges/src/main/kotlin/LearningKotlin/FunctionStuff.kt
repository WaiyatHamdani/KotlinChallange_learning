package org.example.LearningKotlin

class FunctionStuff {
    fun sayhello():String{
        return "hello from kotlin function  -> fun sayhello():String"
    }

    fun addition(a:Int ,b: Int):Int{
        return a+b;
    }

    fun higheorderfunctionaddition(){
        println("addition(a:Int ,b: Int):Int ->has been passed-> to highorderfunction addition  answer:  ${addition(10 , 10)}")
    }

}