package com.example.myapplicationna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonClinicInfo, buttonDoctorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonClinicInfo = findViewById(R.id.button_Div);
        buttonDoctorInfo = findViewById(R.id.button_Border);

        buttonClinicInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ClinicInfoActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Clinic Info Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDoctorInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Doctorinfo.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Doctor Info Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
