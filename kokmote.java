package com.example.wildlife;  // Use your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class kokmote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kokmote); // Ensure this is your XML file's correct name

        // Find the Book Now button
        Button bookNowButton = findViewById(R.id.bookNowButton);

        // Set click listener to navigate to LoginActivity
        bookNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kokmote.this, login.class);
                startActivity(intent);
            }
        });
    }
}
