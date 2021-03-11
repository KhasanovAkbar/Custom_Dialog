package pdp.uz.a8_2androidlessons

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialog_view.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val create = builder.create()
            create.setCancelable(false)
            val customView = layoutInflater.inflate(R.layout.custom_dialog_view, null, false)
            create.setView(customView)
            create.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            customView.cancel_btn.setOnClickListener {
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
                create.dismiss()
            }
            customView.retry_btn.setOnClickListener {
                Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                create.dismiss()
            }
            create.show()
        }

    }
}