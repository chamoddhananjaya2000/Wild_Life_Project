package com.example.wildlife;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {

    private LinearLayout visaButton;
    private TextView visaText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment); // Ensure this matches your payment.xml file

        // Initialize the Visa button and TextView
        visaButton = findViewById(R.id.visaButton);
        visaText = findViewById(R.id.Visa1);

        // Set click listener to navigate to PaymentDetailsActivity when clicking Visa Button
        visaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToPaymentDetails();
            }
        });

        // Set click listener to navigate to PaymentDetailsActivity when clicking Visa TextView
        visaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToPaymentDetails();
            }
        });
    }

    // Method to navigate to PaymentDetailsActivity
    private void navigateToPaymentDetails() {
        Intent intent = new Intent(payment.this, pay_details.class);
        startActivity(intent);
    }
}
