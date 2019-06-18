package com.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;


public class ShowActivity extends AppCompatActivity {


   String name="",email="",phone="",password="",Games="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView Name = findViewById(R.id.tvName);
        TextView Email = findViewById(R.id.tvEmail);
        TextView pas = findViewById(R.id.tvPassword);
        TextView phn = findViewById(R.id.tvPhoneNo);
        TextView game = findViewById(R.id.tvGames);
        Intent intent = getIntent();
        name = intent.getStringExtra("Name");
        email = intent.getStringExtra("Email");
        phone = intent.getStringExtra("phn");
        password = intent.getStringExtra("Pass");
        Games = intent.getStringExtra("Games");
        Name.setText("Name = " + name);
        Email.setText("Email = " + email);
        pas.setText("Password = " + password);
        phn.setText("Phone = " + phone);
        game.setText("Games = " + Games);


    }
}
