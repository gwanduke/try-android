package com.gwanduke.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private var tvSelectedDate: TextView? = null;
    private var tvAgeInMinutes: TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDatePicker: Button = findViewById(R.id.buttonDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)

        buttonDatePicker.setOnClickListener {
            clickDatePicker(it, 2021, 1)
        }


    }

    private fun clickDatePicker(view: View, year: Int, month: Int) {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                Toast.makeText(this, "Datepicker works", Toast.LENGTH_LONG).show()

                val selectedDate = "$year-${month + 1}-$dayOfMonth"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.KOREAN)
                val theDate = sdf.parse(selectedDate)
                theDate?.let {
                    val selectedDateInMinutes = theDate.time / 60_000
                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                    currentDate?.let {
                        val currentDateInMinutes = currentDate.time / 60_000
                        val result = currentDateInMinutes - selectedDateInMinutes

                        tvAgeInMinutes?.text = result.toString()
                    }
                }
            },
            year,
            month,
            day
        )

        dpd.datePicker.maxDate = System.currentTimeMillis() - 86_400_000
        dpd.show();

        Toast.makeText(this, "buttonDatePicker Clicked", Toast.LENGTH_LONG).show();
    }
}