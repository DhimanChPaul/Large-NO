package com.example.largeno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color
import android.graphics.Color.*
import java.util.*

//import kotlin.random.Random as Random
//import java.util.Random

//import kotlinx.android.synthetic.main.activity_main.*
//to activate xml file id in kt files

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lbutton.setOnClickListener{
//            1. compare the numbers
            val leftBtn=Lbutton.text.toString().toInt();
            val rightBtn = Rbutton.text.toString().toInt()

            if (leftBtn>rightBtn){
//                corect answer
//                change background colour
//                background.setBackgroundColor(green(255));
                background.setBackgroundColor(getResources().getColor(R.color.green));
//                background.setBackgroundColor(color.green);

//                show a notification
                Toast.makeText(this,"correct!",Toast.LENGTH_SHORT).show()
            }
            else{
//                background.setBackgroundColor(color.RED)
                background.setBackgroundColor(getResources().getColor(R.color.red));
                Toast.makeText(this,"Wrong!",Toast.LENGTH_SHORT).show()



            }

//            2.generate new number
            assignNOToButton()
        }

        Rbutton.setOnClickListener(){
//            1. compare the numbers
            val leftBtn=Lbutton.text.toString().toInt();
            val rightBtn = Rbutton.text.toString().toInt()

            if (leftBtn<rightBtn){
//                corect answer
//                change background colour
//                background.setBackgroundColor(green(255));
                background.setBackgroundColor(getResources().getColor(R.color.green));
//                background.setBackgroundColor(color.green);

//                show a notification
                Toast.makeText(this,"correct!",Toast.LENGTH_SHORT).show()
            }
            else{
//                background.setBackgroundColor(color.RED)
                background.setBackgroundColor(getResources().getColor(R.color.red));
                Toast.makeText(this,"Wrong!",Toast.LENGTH_SHORT).show()

            }

//            2.generate new number
            assignNOToButton()

        }


    }

    private fun assignNOToButton() {
        val r= Random()
        val leftNo=r.nextInt(10)
        var rightNo=leftNo

        while (rightNo==leftNo){
            rightNo=r.nextInt(10)
        }

        Lbutton.text=leftNo.toString()
        Rbutton.text=rightNo.toString()
//        TODO("Not yet implemented")
    }
}