package com.example.imc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado2.*
import java.math.RoundingMode
import java.text.DecimalFormat

class ResultadoActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        val imc = intent.getParcelableExtra<IMC>("value")
        titleDensidadeCorporal.text = imc.nome.toString()
        textViewHeaderDensidadeCorporal.text = imc.calcular()

        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN

        textViewResultadoDensidadeCorporal.text = "Seu IMC ${df.format(imc.imc)}"
        textViewPeso.text = "Seu Peso ${imc.peso}"
        textViewAltura.text = "Sua Altura ${imc.altura}"


    }
}
