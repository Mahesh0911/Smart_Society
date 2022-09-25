package com.example.smartsociety.Java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.smartsociety.R;

public class societyDashboard extends AppCompatActivity {
    RecyclerView members;
    public String list[]={"MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000","MH AD 2000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_society_dashboard);
        members=findViewById(R.id.membrs);
        members.setLayoutManager(new LinearLayoutManager(this));
        societyMembersList ad= (societyMembersList) new societyMembersList(list);
        members.setAdapter(ad);
    }

    public static class emergencyAlerts extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_emergency_alerts);
        }
    }
}