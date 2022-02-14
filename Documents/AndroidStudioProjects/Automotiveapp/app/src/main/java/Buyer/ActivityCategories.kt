package Buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.automotiveapp.Products
import com.example.automotiveapp.RvCategoriesActivity
import com.example.automotiveapp.databinding.ActivityCategoriesBinding

class ActivityCategories : AppCompatActivity() {
    lateinit var binding:ActivityCategoriesBinding
    lateinit var rvproducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayProducts()
    }

        fun displayProducts() {
            val products = listOf(
                Products(
                    "Automotive Body Parts",
                    "https://1stnews.com/wp-content/uploads/2020/07/benefits-of-orange.jpg"
                ),
                Products(
                    "Automotive Electronics",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.bisinfotech.com%2Fwp-content%2Fuploads%2F2018%2F12%2FAutomotive-Electronics.jpg&imgrefurl=https%3A%2F%2Fwww.bisinfotech.com%2Ftech-trends-for-automotive-electronics-in-2019%2F&tbnid=K43B3taVLpoTXM&vet=12ahUKEwiyvu3ei-v1AhXPzyoKHdBvBPwQMygnegUIARCnAg..i&docid=7ymycRhZSkIOQM&w=500&h=281&q=automotive%20electronics&ved=2ahUKEwiyvu3ei-v1AhXPzyoKHdBvBPwQMygnegUIARCnAg"
                ),
                Products(
                    "Automotive Suppliers",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.simon-kucher.com%2Fsites%2Fdefault%2Ffiles%2F2018-10%2FAutomotivesupplier_5.jpg&imgrefurl=https%3A%2F%2Fwww.simon-kucher.com%2Fnl%2Findustries%2Fautomotive%2Fautomotive-suppliers&tbnid=mo6uaXSKt3T2GM&vet=12ahUKEwi--qXRjOv1AhUM1uAKHRg9ApoQMygAegUIARC6AQ..i&docid=2wcLOJjgbNwlAM&w=1400&h=450&q=automotive%20suppliers&ved=2ahUKEwi--qXRjOv1AhUM1uAKHRg9ApoQMygAegUIARC6AQ"
                ),


                Products(
                    "Automotive Wheels",
                    "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.lesschwab.com%2Fon%2Fdemandware.static%2F-%2FLibrary-Sites-LesSchwabLibrary%2Fdefault%2Fdwc41bb93d%2Fimages%2FlearningCenter%2Farticle%2Fhero%2FHeroArticleWhatIsWheelOffsetDesktop_2048.jpg&imgrefurl=https%3A%2F%2Fwww.lesschwab.com%2Farticle%2Fwhat-is-wheel-offset.html&tbnid=Y052tUmdF-lKjM&vet=12ahUKEwifosD4mOv1AhWGCHcKHZ7UBnAQMygCegUIARDEAQ..i&docid=zRVs1UWKcm-XJM&w=2048&h=800&q=automotive%20wheels&ved=2ahUKEwifosD4mOv1AhWGCHcKHZ7UBnAQMygCegUIARDEAQ"
                )
            )

            var productAdapter = RvCategoriesActivity(products, baseContext)
            rvproducts.adapter = productAdapter
            rvproducts.layoutManager = LinearLayoutManager(baseContext)
            if (rvproducts.isNotEmpty()) {
                rvproducts.layoutManager = LinearLayoutManager(baseContext)
                rvproducts.adapter = productAdapter
            } else {
                Toast.makeText(baseContext, "", Toast.LENGTH_LONG).show()
            }
        }
}


