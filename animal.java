// AnimalActivity.java
package com.example.wildlife;  // Replace with your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class animal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal);  // Make sure animal.xml exists in your layout folder

        TextView txt = findViewById(R.id.txt);
        // Set click listeners
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Guide Booking page
                Intent intent = new Intent(animal.this, elephant.class);
                startActivity(intent);
            }
        });
    }
}
