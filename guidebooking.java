// BungalowBookingActivity.java
package com.example.wildlife;  // Use your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class guidebooking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidebooking);  // This should match the name of your XML layout

        Button select = findViewById(R.id.select);
        // Set click listeners
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(guidebooking.this, guide.class);
                startActivity(intent);
            }
        });
    }
}
