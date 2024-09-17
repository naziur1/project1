package com.example.myapplicationna;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClinicInfoActivity extends AppCompatActivity {

    private ImageView clinicImage;
    private TextView clinicName, clinicAddress, clinicPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinicinfo);


        clinicImage = findViewById(R.id.clinic_image);
        clinicName = findViewById(R.id.clinic_name);
        clinicAddress = findViewById(R.id.clinic_address);
        clinicPhone = findViewById(R.id.clinic_phone);


        clinicName.setText("Sylhet Clinic");
        clinicAddress.setText("123 Sylhet Main Rd, Sylhet");
        clinicPhone.setText("+880 123-456-789");


        clinicImage.setImageResource(R.drawable.download);
    }
}
