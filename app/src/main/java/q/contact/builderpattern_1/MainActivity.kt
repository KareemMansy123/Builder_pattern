package q.contact.builderpattern_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setLapTopOptions()
    }

    private fun setLapTopOptions() {
        LapTop.Builder("i7") // processor is compulsory
                .setRam("8GB")            // this is optional
                .setBattery("6000MAH")    // this is optional
                .create()
    }
}