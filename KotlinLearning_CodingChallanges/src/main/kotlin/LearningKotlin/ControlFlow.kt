package org.example.LearningKotlin

class ControlFlow {
    fun ifexample(a: Int, b: Int){
        if(a>b){
            println("a is bigger")
        }else{
            println("b is bigger")
        }
    }

    fun whenExample(day: Int){
        when{
            day == 1 -> println("monday")
            day == 2 -> println("tuesday")
            day == 3 -> println("wednesday")
            day == 4 -> println("thursday")
            day == 5 -> println("friday")
            day == 6 -> println("saturday")
            day == 7 -> println("sunday")
        }

    }

    fun whileExample(num: Int) {
        var current = num
        val a: Int = 5
        while (current < a) {
            println(current)
            current++
        }
    }

    fun forloopExample(mylist:List<Int>){
        var current:List<Int> = mylist;
        for(x in current){
            println(x)
        }
    }

    fun forloopuntil(mylist: List<Int>){
        for (x in 0  until mylist.size){
            println(x)
        }
    }


}