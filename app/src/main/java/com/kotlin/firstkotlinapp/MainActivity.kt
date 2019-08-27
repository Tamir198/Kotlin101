package com.kotlin.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printsAndFun()


        /////


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

        
        val num1:Double = 1.111111
        val num2:Double = 2.222222
        println("num1 and num2 sum is    + ${num1 + num2}") //${} is for arithmetic calculations inside the print
    }
}
