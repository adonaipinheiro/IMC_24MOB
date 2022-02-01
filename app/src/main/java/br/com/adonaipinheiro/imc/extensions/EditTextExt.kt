package br.com.adonaipinheiro.imc.extensions

import android.widget.EditText

fun EditText.valueDouble() = this.text.toString().toDouble()

fun EditText.value() = this.text.toString()