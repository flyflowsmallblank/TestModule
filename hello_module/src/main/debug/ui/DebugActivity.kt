package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wssg.module.test.R

class DebugActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debug)






        print("hello")
    }
}