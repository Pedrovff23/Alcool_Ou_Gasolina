package com.example.alcoolougasolina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.alcoolougasolina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var botaoCalcular: Button
    private lateinit var textoAlcool: EditText
    private lateinit var textoGasolina: EditText
    private lateinit var textoMelhorOpcao: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inicializarComponente()

        botaoCalcular.setOnClickListener(View.OnClickListener {
            val valorUsuarioAlcool = textoAlcool.text.toString().toDouble()
            val valorUsuarioGasolina = textoGasolina.text.toString().toDouble()
            System.out.println(valorUsuarioAlcool + valorUsuarioGasolina)

//            if (valorUsuarioAlcool.toString().isEmpty() ||
//                valorUsuarioGasolina.toString().isEmpty()){
//
//                textoMelhorOpcao.setText("Digite os preços")
//            }else{
//                calculoFinal(valorUsuarioGasolina, valorUsuarioAlcool)
//            }
        })



    }

    @SuppressLint("SetTextI18n")
    fun calculoFinal(gasolina: Double, alcool: Double){
        val calculoGasolina:Double = (gasolina * 0.7)
        if (alcool<calculoGasolina){
            textoMelhorOpcao.setText("O Álcool é a melhor opção")
        }else{
            textoMelhorOpcao.setText("A Gasolina é a melhor opção")
        }
    }

    fun inicializarComponente(){
        botaoCalcular = binding.ButtonCalcular
        textoAlcool = binding.editTextAlcool
        textoGasolina = binding.editTextGasolina
        textoMelhorOpcao = binding.TextMelhorOpcao

    }
}