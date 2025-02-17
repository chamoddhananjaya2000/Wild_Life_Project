
package com.example.wildlife;  // Replace with your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);  // Make sure animal.xml exists in your layout folder

        Button txt = findViewById(R.id.googlelog);
        // Set click listeners
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(login.this, loginpage.class);
                startActivity(intent);
            }
        });
    }
}
