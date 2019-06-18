package com.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Text2Activity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    Button bbutton1,bbutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);
         textView1=findViewById(R.id.tvtxt1);
         textView2=findViewById(R.id.tvtxt2);
         textView3=findViewById(R.id.tvtxt3);
         textView4=findViewById(R.id.tvtxt4);
         textView5=findViewById(R.id.tvtxt5);
         textView6=findViewById(R.id.tvtxt6);
         textView7=findViewById(R.id.tvtxt7);
         textView8=findViewById(R.id.tvtxt8);
         textView9=findViewById(R.id.tvtxt9);
        textView10=findViewById(R.id.tvtxt10);
        textView11=findViewById(R.id.tvtxt11);
        OnClickToast();
        bbutton1 = findViewById(R.id.bbutton1);
        bbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Text2Activity.this ,Textpage.class);
                startActivity(intent);
            }
        });
        bbutton2 = findViewById(R.id.bbutton2);
        bbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Text2Activity.this ,ShowActivity.class);
                startActivity(intent);
            }
        });


    }

    private void OnClickToast() {
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this,"This is Text1",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text2", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text3", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text4", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text5", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text6", Toast.LENGTH_LONG);
                toast.show();
            }
        }); textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text7", Toast.LENGTH_LONG);
                toast.show();
            }
        }); textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text8", Toast.LENGTH_LONG);
                toast.show();
            }
        }); textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text9", Toast.LENGTH_LONG);
                toast.show();
            }
        }); textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text10", Toast.LENGTH_LONG);
                toast.show();
            }
        }); textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Text2Activity.this, "This is Text11", Toast.LENGTH_LONG);
                toast.show();
            }
        });



    }
}
