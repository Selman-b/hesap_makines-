package com.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var n1 : Double? = null
    var n2 : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


fun topla(view: View){

    n1 = binding.editText.text.toString().toDoubleOrNull()
    n2 = binding.editText2.text.toString().toDoubleOrNull()

    if(1 != null&&n2 != null) {
        sonuc=n1!!+n2!!
        binding.textView.text = "Sonuç: ${sonuc}"
    } else {
        binding.textView.text = "Sayilari giriniz"

    }

}


    fun cikar(view:View){

        n1 = binding.editText.text.toString().toDoubleOrNull()
        n2 = binding.editText2.text.toString().toDoubleOrNull()

        if(n1!= null&&n2 != null) {
            sonuc=n1!!- n2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Sayilari giriniz"

        }


    }

    fun carp (view : View){
        n1 = binding.editText.text.toString().toDoubleOrNull()
        n2 = binding.editText2.text.toString().toDoubleOrNull()

        if(n1!= null&&n2 != null) {
            sonuc=n1!!*n2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Sayilari giriniz"

        }

    }

    fun bol(view : View){

        n1 = binding.editText.text.toString().toDoubleOrNull()
        n2 = binding.editText2.text.toString().toDoubleOrNull()

        if(n1!= null&&n2 != null) {
            sonuc=n1!! / n2!!
            binding.textView.text = "Sonuç: ${sonuc}"
        } else {
            binding.textView.text = "Sayilari giriniz"

        }


    }































}