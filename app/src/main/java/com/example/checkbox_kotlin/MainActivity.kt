package com.example.checkbox_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Single checkbox selected

        // Single checked box
        cb_single.setOnClickListener(View.OnClickListener {
            if (cb_single.isChecked) {
                message(cb_single.text.toString() + " Checked")
            } else {
                message(cb_single.text.toString() + " UnChecked")
            }
        })
    }
    // multiple checkbox click method

    fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox

        if (cb_addida == checked) {
            message(cb_addida.text.toString() + if (cb_addida.isChecked) " Checked " else " UnChecked ")
        }
        if (cb_nike == checked) {
            message(cb_nike.text.toString() + if (cb_nike.isChecked) " Checked " else " UnChecked ")
        }


        if (cb_reebok == checked) {
            message(cb_reebok.text.toString() + if (cb_reebok.isChecked) " Checked " else " UnChecked ")
        }
    }

    fun message(s: String) {

        Toast.makeText(this, s, Toast.LENGTH_LONG).show()
    }

}