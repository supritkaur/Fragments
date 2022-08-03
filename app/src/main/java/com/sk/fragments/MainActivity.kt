package com.sk.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    lateinit var btnAlertDialog: Button
    lateinit var frag :FragmentContainerView
    lateinit var ActivityInterface:ActivityInterface
    var s=0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlertDialog=findViewById(R.id.btnAlertDialog)
        frag=findViewById(R.id.frag)
        btnAlertDialog.setOnClickListener {
            s++
            ActivityInterface.ActivityInterface()
            var alertDialog=AlertDialog.Builder(this)
            alertDialog.setTitle("color")
            alertDialog.setMessage("choose color")
            alertDialog.setPositiveButton("Red"){_,_->
                frag.setBackgroundResource(R.color.Red)
                Toast.makeText(this,"Red clicked",Toast.LENGTH_SHORT).show()}
            alertDialog.setNegativeButton("Green"){_,_->
                frag.setBackgroundResource(R.color.Green)
                Toast.makeText(this,"Green clicked",Toast.LENGTH_SHORT).show()}
            alertDialog.setNeutralButton("Purple"){_,_->
                frag.setBackgroundResource(R.color.Purple)
            Toast.makeText(this,"Purple clicked",Toast.LENGTH_SHORT).show()}

            alertDialog.show()

            }

        }
    }