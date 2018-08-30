package com.android.kunal.hvsustudentteachersapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private TextView AboutHvsu;
    private TextView knowMoreHvsu;
    private TextView GetBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        AboutHvsu = (TextView)findViewById(R.id.about_HVSU);
        knowMoreHvsu= (TextView)findViewById(R.id.knowMore);
        GetBack=(TextView)findViewById(R.id.goBack);
        AboutHvsu.setText("Haryana Vishwakarma Skill University (HVSU) is a university established by the Government of Haryana at Dudhola village of Palwal district of India." +
                " It is currently running from a temporary campus in Gurugram." +
                " It has MoU with several industries and entities to impart skills training.");

        knowMoreHvsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutHVSU();

            }
        });


        GetBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(About.this,ViewUploadsActivity.class));
            }
        });



    }

    public void aboutHVSU(){


        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.hvsu.ac.in/"));
        startActivity(intent);
    }
}
