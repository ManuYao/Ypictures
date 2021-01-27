 package fr.Yao.ypictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.Yao.ypictures.fragement.HomeFragement

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter le fragement dans notre boite (fragement_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragement(this))
        transaction.addToBackStack(null)
        transaction.commit()
    }
}