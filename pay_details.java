package com.example.wildlife;  // Replace with your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pay_details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_details);  // Make sure pay_details.xml exists in your layout folder

        Button payButton = findViewById(R.id.Pay);  // Rename the variable to payButton

        // Set click listeners
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(pay_details.this, bunglow_booking.class);
                startActivity(intent);
            }
        });
    }
}
