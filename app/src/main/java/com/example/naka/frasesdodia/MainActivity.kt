package com.example.naka.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    val frases = arrayOf("Esta é a frase de número 1, com toda a sua poesia",
                        "Esta é a frase de número 2, e ela representa muita coisa",
                        "Esta é a frase de número 3, ôloco bicho",
                        "Esta é a frase de número 4, não importa onde você esteja, você sempre estará lá")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = textViewFrase
        buttonNovaFrase.setOnClickListener {geraFrases() }
    }

    fun geraFrases() {
        val position = Random().nextInt(frases.size)
        textView.text = frases[position]
    }
}
