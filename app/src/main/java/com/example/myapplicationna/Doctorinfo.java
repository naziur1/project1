package com.example.myapplicationna;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Doctorinfo extends AppCompatActivity {

    private TextView doctorName, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorinfo);


        doctorName = findViewById(R.id.doctor_name);
        phoneNumber = findViewById(R.id.phone_number);


        doctorName.setText("Dr. John Doe");
        phoneNumber.setText("+880 123-456-789");
    }
}
