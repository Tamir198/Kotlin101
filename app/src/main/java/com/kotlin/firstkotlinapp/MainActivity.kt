package com.kotlin.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.util.logging.Logger
import android.R
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

    fun printsAndFun() { //making fun with print

        /**var stands for variable like java - you can change it
         * val stands for value - it got one value that cannot be changed (like final variable in java)**/

        val value = "look mom I cannot change again"
        println("this is value $value") //$ and after the variable name to print it

        var canChange = 4
        println("can Change value is    $canChange")
        canChange = 5;
        println("can Change value is now    $canChange")

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        val num1: Double = 1.111111
        val num2: Double = 2.222222
        println("num1 and num2 sum is    + ${num1 + num2}") //${} is for arithmetic calculations inside the print


        val multiLineString = """
           |First line
           |Another line
           |one more
           |and stop
           """.trimMargin()


        println("In kotlin you can make multyLine string but you will need ot log it (Log.v)   $multiLineString")
        Log.v(" text wont with print", "" + multiLineString)
        Log.wtf(" text wont with print", "" + multiLineString)


    }


    fun typeChecking() {
        if (true is Boolean) {
            println("You can check is a is double or any other  type using is inside if")
        }

        val doubleValueCheck = 4.0
        if (doubleValueCheck is Double) {
            println("doubleValueCheck is sure a double")
        }

        val stringForCheck = "Hummus"
        if (stringForCheck is String) {
            println("stringForCheck is made of Hummus? wait... its a string not a hummus")
        }
    }

    fun casting() {
        var someChar: Char = 'a' //"a" will not compile because if you want a single char you need to wrap it with a single '
        println("Is a a char tho?  ${someChar is Char}")//How cool is that, this "${someChar is Char}" can go inside a print

        println("Lets make 3.14  Int ${3.14.toInt()}")//It will get rounded
        println("Lets make A to Int ${'A'.toInt()}") //Value it taken from ascii table
        println("Lets make 65 to Char ${65.toChar()}") //Value is taken from ascii table



    }
    
    fun stringManipulations(){
    val firstString = "hey bob"
    val secondString = "how are you doing"
    
    println("$firstString  $secondString" )//concatinate strings together
    println("1+2 is ${1+2}")
    println("first name length is ${firstString.length}")
    
    println("firstString is the same as secondString? ${firstString.equals(secondString)}")
    
    println(" ${'A'.compareTo('b')}")
    println(" ${'A'.equals('b')}")
        
    println("${firstString.get(2)}") //get string at the second index   or just "string[index]"
    
   
}
    
  fun collections(){
    
      var array = Array(5,{x -> x * x})//the array got 5 indexes  and every index multiply itself by his value (index 2 will be 2*2=4)
      println(array[3])
 
      //This is range in kotlin, you can create range of numebr or letters using this syntax:
  
      val oneTo10 = 1..10
      val TenTo1 = 10.downTo(1)
      val upTo10 = 10.downTo(1)
      val fiveTo20 = 5.rangeTo(20)
      val oneTo10Step3 = oneTo10.step(3)//this will be exactly like 1..10 but with steps of 3 (1,4,7,10)
      val alphabet = "A".."Z"
     println("Is 5 inside oneTo10?  ${ 5 in oneTo10 } ")
     println("Is B inside the alphabet?  ${ "B" in alphabet } ")
 
 
 for(x:Int in oneTo10Step3)println("oneTo10Step3 is $x")// iterating over range/array
 for(x in oneTo10.reversed())print("$x ") //This will print 10 9 8 7 6 5 4 3 2 1 because I have used reversed()
    
}
    
    fun switchCase(){
        val x =2
        when (x) {//equivalent for the switch case in android
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
}


}
