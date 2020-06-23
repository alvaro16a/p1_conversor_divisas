package com.alvaromena.p1_conversor_divisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val COP = arrayOf(1.0, 0.00027, 0.00024, 0.0019, 0.00021, 0.00036)
        val USD = arrayOf(3731.0, 1.0, 0.89, 7.06, 0.8, 1.35)
        val EUR = arrayOf(4200.0, 1.13, 1.0, 7.95, 0.9, 1.52)
        val CNY = arrayOf(528.0, 0.14, 0.13, 1.0, 0.11, 0.19)
        val GBP = arrayOf(4649.0, 1.25, 1.11, 8.82, 1.0, 1.69)
        val CAD = arrayOf(2757.0, 0.74, 0.66, 5.23, 0.59, 1.0)
        var vsalida = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
        var vauxiliar = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var auxiliar: Double
        var valor: String
        var salida: Double

        bt_conversion.setOnClickListener {

            valor = et_valor_a_convertir.text.toString()

            if (!(valor.isEmpty())) {
                auxiliar = valor.toDouble()

                if (rb_usd.isChecked) {
                    vauxiliar = USD
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }
                if (rb_eur.isChecked) {
                    vauxiliar = EUR
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }
                if (rb_cny.isChecked) {
                    vauxiliar = CNY
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }
                if (rb_vef.isChecked) {
                    vauxiliar = GBP
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }
                if (rb_cad.isChecked) {
                    vauxiliar = CAD
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }
                if (rb_cop.isChecked) {
                    vauxiliar = COP
                    for (num in 0..5) {
                        salida = vauxiliar[num]
                        vsalida[num] = auxiliar * salida
                    }
                }

                salida = vsalida[0];tv_cop.text = salida.toString()
                salida = vsalida[1];tv_usd.text = salida.toString()
                salida = vsalida[2];tv_eur.text = salida.toString()
                salida = vsalida[3];tv_cny.text = salida.toString()
                salida = vsalida[4];tv_gbp.text = salida.toString()
                salida = vsalida[5];tv_cad.text = salida.toString()
            }
        }
    }
}


