package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etDob:EditText
    lateinit var etIdNumber:EditText
    lateinit var etNationality : EditText
    lateinit var etPhone :EditText
    lateinit var etEmail : EditText
    lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         Register()
        activities()




        }
        fun Register(){
            etName = findViewById(R.id.etname)
            etDob = findViewById(R.id.etDate)
            etIdNumber = findViewById(R.id.etIDnumber)
            etNationality = findViewById(R.id.etnationality)
            etPhone = findViewById(R.id.etphonenumber)
            etEmail = findViewById(R.id.etemail)
            btnRegister =findViewById(R.id.btnregister)

        }
        fun activities(){
            btnRegister.setOnClickListener{
                var name = etName.text.toString()
                var dob = etDob.text.toString()
                var idNo = etIdNumber.text.toString()
                var nationality = etNationality.text.toString()
                var phone = etPhone.text.toString()
                var email = etEmail.text.toString()
                var student = Student(name, dob,idNo, nationality, phone, email)
                Toast.makeText(baseContext, student.toString(), Toast.LENGTH_LONG).show()
                val intent = Intent(baseContext, coursesactivity::class.java)
                startActivity(intent)
        }

    }
}

data class Student(var name:String, var dob:String, var idNo:String, var nationality:String, var phone:String, var email:String)