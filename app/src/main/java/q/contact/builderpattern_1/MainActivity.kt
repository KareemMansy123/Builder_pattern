package q.contact.builderpattern_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import q.contact.builderpattern_1.example1.LapTop
import q.contact.builderpattern_1.example2.UserBuilder
import q.contact.builderpattern_1.example2.UserInfo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setLapTopOptions()
        setUserInfo()
    }

    private fun setUserInfo() {
        val userinfo = UserBuilder("Mansy") // mandatory
            .setEmail("mansy@gmail.com")
            .setPhone("12345678")
            .setAddress("abcd")
            .create()
    }

    private fun setLapTopOptions() {
        val lapTop = LapTop.Builder("i7") // processor is compulsory
            .setRam("8GB")            // this is optional
            .setBattery("6000MAH")    // this is optional
            .create()
    }
}