package org.example

import org.example.LearningKotlin.ControlFlow
import org.example.LearningKotlin.DataTypes
import org.example.LearningKotlin.FunctionStuff
import org.example.LearningKotlin.TryCatchExample

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
val minus: (Int, Int) -> Int = { a, b -> a - b }

fun main() {
   var datatype: DataTypes  = DataTypes() // this is call an instance
    println("------------------print my datatype------------------------")
    datatype.printdatatype();

    println("------------printing my nullable datatype-------------------")
    datatype.myNullable()


    println("------------print my function stuff-------------------")
    var funtionstuff: FunctionStuff = FunctionStuff()
    println(funtionstuff.sayhello())

    val resultfunction = funtionstuff.addition(5, 5)
    println("$resultfunction this is the anwer of addition(5,5)")

    println("or we can do lamda it like this example")
    println("val lambdaName: (InputType) -> ReturnType = { parameter: InputType -> body }")
    println( minus.invoke(9,4) )

    println("this just showing higherorder function pass to another function should show as 20")
    funtionstuff.higheorderfunctionaddition()

    var controlFlow:ControlFlow = ControlFlow()
    controlFlow.ifexample(10,30)
    controlFlow.whenExample(4)
    controlFlow.whileExample(1)
    val mylist:List<Int> = listOf(1,2,3,4)
    controlFlow.forloopExample(mylist)
    controlFlow.forloopuntil(mylist)
    println("try catch block --------------------------------------------")
    var mytry:TryCatchExample = TryCatchExample()
    mytry.dividedbyZero()

}