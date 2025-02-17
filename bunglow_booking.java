// BungalowBookingActivity.java
package com.example.wildlife;  // Use your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bunglow_booking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bunglow_booking);  // This should match the name of your XML layout

        TextView kokmote = findViewById(R.id.kokmote);
        // Set click listeners
        kokmote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(bunglow_booking.this, com.example.wildlife.kokmote.class);
                startActivity(intent);
            }
        });
    }
}
