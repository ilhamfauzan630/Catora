package capstone.catora.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import capstone.catora.R
import capstone.catora.databinding.ActivityLoginBinding
import capstone.catora.ui.home.HomeActivity
import capstone.catora.ui.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            //handling the login logic
        }

        //this button only for checking te registration, i would suggest to delete it and change to text "don't have an account? register"
        binding.testRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }
}