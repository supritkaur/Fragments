package com.sk.fragments

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    lateinit var btnAlertDialog: Button
    lateinit var frag :FragmentContainerView
    lateinit var ActivityInterface:ActivityInterface
    var s=0
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
                frag.setBackgroundColor(R.id.Red)}
            alertDialog.setNegativeButton("Blue"){_,_->
                frag.setBackgroundColor(R.id.Blue)}
            alertDialog.setNeutralButton("Purple"){_,_->
                frag.setBackgroundColor(R.id.Purple)}

            }

        }
    }