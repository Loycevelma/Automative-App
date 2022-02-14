package Buyer

import Buyer.ActivityBuyerLocation
import Seller.ActivitySellerSignUp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.example.automotiveapp.databinding.ActivityBuyerLocationBinding
import com.example.automotiveapp.databinding.ActivityBuyerStartBinding

class BuyerStartActivity : AppCompatActivity() {
    lateinit var binding: ActivityBuyerStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuyerStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBoxSeller.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerSignUp::class.java)
            startActivity(intent)
        }
        binding.checkBoxBuyer.setOnClickListener {
            val intent=Intent(baseContext, ActivityCategories::class.java)
            startActivity(intent)
        }
    }

}