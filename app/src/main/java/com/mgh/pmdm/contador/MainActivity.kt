package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mgh.pmdm.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var contador=0
    //Comentario de prueba

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Referencia al TextView
        /*val textViewContador=findViewById<TextView>(R.id.texto)

        // Inicializamos el TextView con el contador a 0
        textViewContador.setText(contador.toString())

        // Referencia al botón
        val btAdd=findViewById<Button>(R.id.btAdd)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón*/
        binding.btAdd.setOnClickListener {
            contador++
            binding.texto.setText(contador.toString())
        }

        //val btMenos = findViewById<Button>(R.id.btMenos)

        binding.btMenos.setOnClickListener {
            contador--
            binding.texto.setText(contador.toString())
        }

        binding.bReinicio.setOnClickListener {
            contador = 0
            binding.texto.setText(contador.toString())
        }

    }
}