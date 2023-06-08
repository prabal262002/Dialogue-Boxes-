package com.example.dialogueboxes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialogueboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Suar?")
            builder1.setMessage("Do you want to close the app?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }

        binding.button.setOnClickListener {
            val options = arrayOf("GOT","The Witcher","Squid Games","Loki","Hawkeye","She-Hulk")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Choose your best web-series.")
            var temp = options[0]
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                temp = options[i]
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You Have Chosen $temp",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }


        binding.button1.setOnClickListener {
            val options = arrayOf("GOT","The Witcher","Squid Games","Loki","Hawkeye","She-Hulk")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Choose your best web-series.")
            var temp = "Nothing"
            builder2.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                temp = options[i]
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You Have Chosen $temp",Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }



    }
}