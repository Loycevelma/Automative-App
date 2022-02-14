package Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.R
import com.example.automotiveapp.databinding.ActivityBuyerProductsBinding

class ActivityBuyerProducts : AppCompatActivity() {
    lateinit var binding:ActivityBuyerProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBuyerProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnadd1.setOnClickListener {
          val  intent= Intent(baseContext,ActivityBuyerViewCart::class.java)
            startActivity(intent)
        }
        binding.btnadd2.setOnClickListener {
           val intent= Intent(baseContext,ActivityBuyerViewCart::class.java)
            startActivity(intent)
        }
        binding.btnAdd3.setOnClickListener {
         val   intent= Intent(baseContext,ActivityBuyerViewCart::class.java)
            startActivity(intent)
        }
        binding.btnAdd4.setOnClickListener {
          val  intent= Intent(baseContext,ActivityBuyerViewCart::class.java)
            startActivity(intent)
        }

    }
}