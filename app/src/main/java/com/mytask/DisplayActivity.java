package com.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent=new Intent(DisplayActivity.this,Text2Activity.class);
        startActivity(intent);
        textView1 = findViewById(R.id.tvtxt1);
        textView4 = findViewById(R.id.tvtxt4);
        textView5 = findViewById(R.id.tvtxt5);
        textView6 = findViewById(R.id.tvtxt6);
        textView7 = findViewById(R.id.tvtxt7);
        textView8 = findViewById(R.id.tvtxt8);
        textView9 = findViewById(R.id.tvtxt9);
        textView10 = findViewById(R.id.tvtxt10);
        textView11 = findViewById(R.id.tvtxt11);
        textView12 = findViewById(R.id.tvtxt12);
        textView13 = findViewById(R.id.tvtxt13);
        textView14 = findViewById(R.id.tvtxt14);
        textView15 = findViewById(R.id.tvtxt15);
        textView16 = findViewById(R.id.tvtxt16);
        Button blogin = findViewById(R.id.bLogin);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplayActivity.this, Textpage.class);
                startActivity(intent);
            }
        });
        Button bNext = findViewById(R.id.bNext);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisplayActivity.this, ShowActivity.class));
            }
        });

        OnClickToast();


}
        private void OnClickToast() {
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text1", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text4", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text5", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text6", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text7", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text8", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text9", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text10", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text11", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text12", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text13", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text14", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text15", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DisplayActivity.this, "This is Text16", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
    }


