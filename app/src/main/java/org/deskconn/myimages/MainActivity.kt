package org.deskconn.myimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.ViewFlipper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   /* lateinit var viewFlipper: ViewFlipper
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var next: Button
    lateinit var previous: Button*/
    var flag: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*image1 = findViewById(R.id.image1)
        image2 = findViewById(R.id.image2)
        previous = findViewById(R.id.button1)
        next = findViewById(R.id.button2)*/
       button1.setOnClickListener {
           if (!flag){
               flipperView.showPrevious()
               flag = true
           }

       }
        button2.setOnClickListener {
            if (flag){
                flipperView.showNext()
                flag = false
            }
        }

    }

    /*fun clickListener(view: View){
        if (view == next){
            viewFlipper.showNext()
        }else if (view == previous){
            viewFlipper.showPrevious()
        }
    }*/
}