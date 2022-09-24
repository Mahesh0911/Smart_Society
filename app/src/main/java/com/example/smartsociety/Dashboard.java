package com.example.smartsociety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    public Button parking;
    public Button vehiclebtn;
    public Button alertbtn;
    public Button societybtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        parking=findViewById(R.id.parkingbtn);
        vehiclebtn=findViewById(R.id.vehiclebtn);
        alertbtn=findViewById(R.id.alertbtn);
        societybtn=findViewById(R.id.societybtn);
        vehiclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,parkingManagement.class);
                startActivity(intent);
            }
        });
        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,emergencyAlerts.class);
                startActivity(intent);
            }
        });

        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,parkingQuery.class);
                startActivity(intent);
            }
        });

        societybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dashboard.this,societyDashboard.class);
                startActivity(intent);
            }
        });
    }
}