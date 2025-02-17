package com.example.wildlife;  // Replace with your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);  // Make sure loginpage.xml exists in your layout folder

        // Initialize the EditTexts for username and password
        EditText usernameEditText = findViewById(R.id.emailaccount);  // Assuming your EditText for username has id "username"
        EditText passwordEditText = findViewById(R.id.passwordlogin);  // Assuming your EditText for password has id "password"

        // Initialize the login button
        Button loginButton = findViewById(R.id.login1);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text entered in the username and password fields
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Hardcoded correct username and password
                String correctUsername = "pasinduthambugala@gmail.com";  // Replace with your desired username
                String correctPassword = "1234";  // Replace with your desired password

                // Check if username and password are correct
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    // If correct, navigate to the payment page
                    Intent intent = new Intent(loginpage.this, payment.class);
                    startActivity(intent);
                } else {
                    // If incorrect, show a toast message
                    Toast.makeText(loginpage.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
