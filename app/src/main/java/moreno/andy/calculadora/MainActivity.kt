package moreno.andy.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var digito:String = ""
        //btnNum1.setOnClickListener{botonPresionado(digito:"1")}
        //btnNum2.setOnClickListener{botonPresionado(digito:"2")}

        val resultado: TextView = findViewById(R.id.tvNum2) as TextView
        val ingrsNum: TextView = findViewById(R.id.tvNum1) as TextView

        val botonUno: Button = findViewById(R.id.btnNum1) as Button
        val botonDos: Button = findViewById(R.id.btnNum2) as Button
        val botonTres: Button = findViewById(R.id.btnNum3) as Button
        val botonCuatro: Button = findViewById(R.id.btnNum4) as Button
        val botonCinco: Button = findViewById(R.id.btnNum5) as Button
        val botonSeis: Button = findViewById(R.id.btnNum6) as Button
        val botonSiete: Button = findViewById(R.id.btnNum7) as Button
        val botonOcho: Button = findViewById(R.id.btnNum8) as Button
        val botonNueve: Button = findViewById(R.id.btnNum9) as Button

        val botonSuma: Button = findViewById(R.id.btnSuma) as Button
        val botonResta: Button = findViewById(R.id.btnResta) as Button
        val botonMul: Button = findViewById(R.id.btnMul) as Button
        val botonDiv: Button = findViewById(R.id.btnDiv) as Button

        val botonBorrar: Button = findViewById(R.id.btnBorrar) as Button
        val botonResultado: Button = findViewById(R.id.btnResult) as Button

        fun botonPresionado(digito: String){
            ingrsNum.text = "${ingrsNum.text}$digito"
        }

        fun operacionPresionado(operador: String){

        }

        botonUno.setOnClickListener{
            botonPresionado(digito: "1")
        }


    }
}