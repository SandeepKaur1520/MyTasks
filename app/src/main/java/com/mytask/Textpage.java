package com.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



public class Textpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textpage);
        Button bDone =findViewById(R.id.bDone);
        final EditText Name = findViewById(R.id.etname);
        final EditText EMail = findViewById(R.id.etEmail);
        final EditText Pass = (EditText) findViewById(R.id.etPassword);
        final EditText CnPass = findViewById(R.id.etconfirm_Password);
        final EditText Phone = findViewById(R.id.etPhone);
        final CheckBox vollyball =findViewById(R.id.cbVball);
        final CheckBox football =findViewById(R.id.cbfoot);
        final CheckBox basket =findViewById(R.id.cbbasket);


        bDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Pass.getText().toString().equals(CnPass.getText().toString())) {
                /*ShowActivity.name = name;
                ShowActivity.email = EMail.getText().toString();
                ShowActivity.password = Pass.getText().toString();
                ShowActivity.phone = Phone.getText().toString();*/
                    String games = "";
                    if (vollyball.isChecked()) {
                        games = " ".concat("Vollyball");
                    }
                    if (basket.isChecked()) {
                        games = " ".concat("Basket Ball");
                    }
                    if (football.isChecked()) {
                        games = " ".concat("Football");
                    }
                    //ShowActivity.Games = games;

                    Intent intent = new Intent(Textpage.this, ShowActivity.class);
                    intent.putExtra("Name", Name.getText().toString());
                    intent.putExtra("Email", EMail.getText().toString());
                    intent.putExtra("Pass", Pass.getText().toString());
                    intent.putExtra("phn", Phone.getText().toString());
                    intent.putExtra("Games", games);

                    Toast toast = Toast.makeText(Textpage.this, "Your data is saved", Toast.LENGTH_LONG);
                    toast.show();
                    startActivity(intent);
                }
                else{
                    Toast toast = Toast.makeText(Textpage.this, "Password MisMatch", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

}
