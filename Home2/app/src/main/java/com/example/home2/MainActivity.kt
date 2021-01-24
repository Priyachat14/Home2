package com.example.home2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editname: EditText = findViewById(R.id.User1)
        var editpass: EditText = findViewById(R.id.Pass1)
        var editcpass: EditText = findViewById(R.id.Confirm1)
        var ok: Button = findViewById(R.id.button)
        var clear: Button = findViewById(R.id.button2)

        clear.setOnClickListener() {
            editname.setText("")
            editpass.setText("")
            editcpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editname.text.toString()
            var pass1 = editpass.text.toString()
            var Confirm1 = editcpass.text.toString()
            if(user == ""  ||pass1 == ""  ||Confirm1 == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == pass1 && user == Confirm1) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(pass1 != Confirm1){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "สำเร็จ", Toast.LENGTH_LONG).show()
        }
        }


    }
}