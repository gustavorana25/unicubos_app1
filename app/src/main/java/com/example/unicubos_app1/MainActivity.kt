package com.example.unicubos_app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Picasso
            .get()
            .load("https://vignette.wikia.nocookie.net/fanintendo/images/6/69/544px-Main_%287%29_%2813%29.png/revision/latest")
            .into(imageView)
    }

    override fun onStart() {
        super.onStart();
        toastMessage("Hi people", 40000);

    }

    fun toastMessage(text:String, duration:Int) = Toast.makeText(this, text, duration).show()
}
