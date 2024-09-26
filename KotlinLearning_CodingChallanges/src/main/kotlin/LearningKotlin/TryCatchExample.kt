package org.example.LearningKotlin

class TryCatchExample {
    fun dividedbyZero(){
        try {
            println(10/0)
        }catch (error: Throwable){
            println(error)
        }
    }
}