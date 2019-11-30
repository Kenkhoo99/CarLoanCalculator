package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.buttonCalculate).setOnClickListener {
                calculateTotal()
        }
    }

    private fun calculateTotal() {
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice).text.toString().toInt()
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment).text.toString().toInt()
        val loanPeriod = findViewById<EditText>(R.id.editTextLoanPeriod).text.toString().toInt()
        val interest = findViewById<EditText>(R.id.editTextInterestRate).text.toString().toInt()


        val txtLoan = findViewById<TextView>(R.id.textViewLoan)
        val txtInterest = findViewById<TextView>(R.id.textViewInterest)
        val txtMonth = findViewById<TextView>(R.id.textViewMonthlyRepayment)


        txtLoan.text = (carPrice - downPayment).toString()
        txtInterest.text = ((carPrice - downPayment) * interest * loanPeriod).toString()
        txtMonth.text = ((carPrice - downPayment + interest)/loanPeriod/12).toString()

    }
}
