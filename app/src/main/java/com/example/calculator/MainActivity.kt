package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNo1 = findViewById<EditText>(R.id.edtNo1)
        val edtNo2 = findViewById<EditText>(R.id.edtNo2)
        val btnAdd =  findViewById<Button>(R.id.btnAdd)
        val btnSub =  findViewById<Button>(R.id.btnSub)
        val btnMul =  findViewById<Button>(R.id.btnMul)
        val btnDiv =  findViewById<Button>(R.id.btnDiv)


        btnAdd.setOnClickListener {
           if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

               val no1 = edtNo1.text.toString().toInt()
               val no2 = edtNo2.text.toString().toInt()

               val sum = no1+no2

               Toast.makeText(this, "The Sum is $sum", Toast.LENGTH_LONG).show();

           }else{
               Toast.makeText(this, "Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
           }
        }


       btnSub.setOnClickListener {
           if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

               val no1 = edtNo1.text.toString().toInt()
               val no2 = edtNo2.text.toString().toInt()

               var sub : Int

               sub = if(no1>no2){
                   no1-no2

               }else{
                   no2-no1
               }

               Toast.makeText(this, "The Difference is $sub", Toast.LENGTH_LONG).show();

           }else{
               Toast.makeText(this, "Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
           }
       }

        btnMul.setOnClickListener {
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1*no2


                Toast.makeText(this, "The Product is $mul", Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }

        btnDiv.setOnClickListener {
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var div : Int

                if(no2==0){
                    div = 0;
                    Toast.makeText(this, "A number can't be divided by Zero.", Toast.LENGTH_LONG).show();
                }else{
                     div = no1/no2
                }

                Toast.makeText(this, "The Division is $div", Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }


    }
}