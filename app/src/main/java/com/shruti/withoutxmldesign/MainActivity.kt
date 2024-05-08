package com.shruti.withoutxmldesign

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.shruti.withoutxmldesign.marraigeTemplet.MarriageBioDataClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create the main linear layout to hold all views
        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.setBackgroundColor(Color.WHITE) // Set background color

        // Set the main linear layout as the content view
        setContentView(linearLayout)

        // Create EditText for username
        val usernameEditText = EditText(this)
        usernameEditText.hint = "Username"
        usernameEditText.setTextColor(Color.BLUE)
        linearLayout.addView(usernameEditText)

        // Create EditText for password
        val passwordEditText = EditText(this)
        passwordEditText.hint = "Password"
        passwordEditText.inputType = android.text.InputType.TYPE_CLASS_TEXT or
                android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
        passwordEditText.setTextColor(Color.BLUE)// Set text color
        linearLayout.addView(passwordEditText)

        // Create Button for submission
        val submitButton = Button(this)
        submitButton.text = "Submit"
        submitButton.setBackgroundColor(Color.GREEN)
        submitButton.setTextColor(Color.BLACK) // Set text color

        // Set layout params with gravity set to center and margins
        val params = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        params.gravity = Gravity.CENTER
        params.setMargins(0, 20, 0, 0) // Set margins
        submitButton.layoutParams = params // Set the layout params for the submit button
        // Add click listener for the submit button
        submitButton.setOnClickListener {
            // Handle submission logic here
        }

        // Add the submit button to the main linear layout
        linearLayout.addView(submitButton)

        val marraigeData = MarriageBioDataClass()
        marraigeData.template1(this)
    }
}

