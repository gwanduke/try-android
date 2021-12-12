package com.gwanduke.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.ArithmeticException

class MainActivity : AppCompatActivity() {
    private var tvInput: TextView? = null;
    var lastNumeric: Boolean = false;
    var lastDot: Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
    }

    fun onDigit(view: View) {
        tvInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }


    fun onClear(view: View) {
        tvInput?.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onOperator(view: View) {
        tvInput?.text?.let {
            if (lastNumeric && !isOperatorAdded(it.toString())) {
                tvInput?.append((view as Button).text)
                lastNumeric = false
                lastDot = false
            }
        }
    }

    // TODO: 단순 반복작업이라 아직 구현하지 않았는데, 문자열 파싱해서 예외처리 하고 계산결과 내면 됨
    fun calc(view: View) {
        if (lastNumeric) {
            var tvValue = tvInput?.text.toString()

            try {
                val splitValue = tvValue.split("-", "*", "+", "/")
                var result = splitValue[0].toDouble() - splitValue[1].toDouble()

                tvInput?.text = result.toString()


            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") || value.contains("*") || value.contains("+") || value.contains("-")
        }
    }
}