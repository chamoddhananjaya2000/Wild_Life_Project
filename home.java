package com.example.wildlife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Set the main loading page layout

        // Initialize buttons
        Button ticketbooking = findViewById(R.id.ticketbooking);
        Button bunglowbooking = findViewById(R.id.bunglowbooking);
        Button guidebooking = findViewById(R.id.guidebooking);
        Button attraction = findViewById(R.id.attraction);
        // Initialize the TextView for Animals
        TextView animalsTextView = findViewById(R.id.animals);

        // Set click listeners
        ticketbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Ticket Booking page
                Intent intent = new Intent(home.this, calender.class);
                startActivity(intent);
            }
        });

        bunglowbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Bunglow Booking page
                Intent intent = new Intent(home.this, bunglow_booking.class);
                startActivity(intent);
            }
        });

        guidebooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(home.this, guidebooking.class);
                startActivity(intent);
            }
        });

        // Set the onClickListener for the TextView
        animalsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the AnimalActivity
                Intent intent = new Intent(home.this, animal.class);
                startActivity(intent);  // Start the new activity
            }
        });
    }
}
