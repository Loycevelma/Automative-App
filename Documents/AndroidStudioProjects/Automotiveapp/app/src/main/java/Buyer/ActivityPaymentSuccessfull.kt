package Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.automotiveapp.R
import com.example.automotiveapp.databinding.ActivityPaymentMethodBinding

class ActivityPaymentSuccessfull : AppCompatActivity() {
    lateinit var binding:ActivityPaymentMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}