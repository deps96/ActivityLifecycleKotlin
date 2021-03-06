package deps.practice.activitylifecyclekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    companion object{
        val log = Logger.getLogger(MainActivity::class.java.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log.info("OnCreate called")
    }

    override fun onStart() {
        super.onStart()
        log.info("onStart called")
    }
    override fun onRestart() {
        super.onRestart()
        log.info("OnRestart Called")
    }

    override fun onResume() {
        super.onResume()
        log.info("OnResume Called")
    }


    override fun onStop() {
        super.onStop()
        log.info("OnStop Called")
    }

    override fun onPause() {
        super.onPause()
        log.info("OnPause Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        log.info("OnDestroy Called")
    }
}
