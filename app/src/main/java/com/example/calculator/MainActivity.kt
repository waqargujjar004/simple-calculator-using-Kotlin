package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var firstedittxt:EditText
    lateinit var secondedittxt:EditText
    lateinit var plusButton:Button
    lateinit var minusButton:Button
    lateinit var multiplyButton:Button
    lateinit var divideButton:Button
    lateinit var resulttv:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connector()
    }

    private fun connector()
    {
        try {
            firstedittxt = findViewById(R.id.firstet)
            secondedittxt = findViewById(R.id.secondet)
            plusButton = findViewById(R.id.plusbt)
            minusButton = findViewById(R.id.minusbt)
            multiplyButton = findViewById(R.id.multiplybt)
            divideButton = findViewById(R.id.dividebt)
            resulttv = findViewById(R.id.resulttV)
            plusButton.setOnClickListener()
            {
                add()
            }
            minusButton.setOnClickListener{
                minus()
            }

            multiplyButton.setOnClickListener{
                multiply()
            }
            divideButton.setOnClickListener{
                divide()
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(MainActivity@this,"Exception is ${ex.message}" ,Toast.LENGTH_SHORT).show()
        }

    }

private fun add()
{
    if (firstedittxt.text.toString().isBlank())
    {
        Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
        firstedittxt.requestFocus()
    }
    if (secondedittxt.text.toString().isBlank())
    {
        Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
        secondedittxt.requestFocus()
    }

    var value1 = firstedittxt.text.toString().toInt()
    var value2 = secondedittxt.text.toString().toInt()

    var result= value1+value2
    resulttv.text= "$result"
}

    private fun minus()
    {
        if (firstedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            firstedittxt.requestFocus()
        }
        if (secondedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            secondedittxt.requestFocus()
        }

        var value1 = firstedittxt.text.toString().toInt()
        var value2 = secondedittxt.text.toString().toInt()

        var result= value1-value2
        resulttv.text= "$result"
    }
    private fun multiply()
    {
        if (firstedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            firstedittxt.requestFocus()
        }
        if (secondedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            secondedittxt.requestFocus()
        }

        var value1 = firstedittxt.text.toString().toInt()
        var value2 = secondedittxt.text.toString().toInt()

        var result= value1*value2
        resulttv.text= "$result"
    }

    private fun divide()
    {
        if (firstedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            firstedittxt.requestFocus()
        }
        if (secondedittxt.text.toString().isBlank())
        {
            Toast.makeText(MainActivity@this,"Plese Enter some value",Toast.LENGTH_SHORT).show()
            secondedittxt.requestFocus()
        }

        var value1 = firstedittxt.text.toString().toInt()
        var value2 = secondedittxt.text.toString().toInt()

        var result= value1/value2
        resulttv.text= "$result"
    }
}

