package com.android.kunal.hvsustudentteachersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userRoll extends AppCompatActivity {

    private EditText userRoll;
    private Button userValidate;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_roll);


        userRoll= (EditText)findViewById(R.id.URoll);
        userValidate= (Button)findViewById(R.id.rollValidate);



        userValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Rollno = userRoll.getText().toString().trim();
                //Teachers roll call
                if (Rollno.matches("^([2018]+[8-9][-][A,D][-][b,c][-][1-9][-][s,S][-]00[1-5])|ajay844|kunal96")){

                    startActivity(new Intent(userRoll.this,MainActivity.class));

                }
                // Students rol no
                else if (Rollno.matches("^([2018]+[8-9][-][A,D][-][b,c][-][1-9][-](00[1-9]|0[1-2][1-9]|030))")){

                    startActivity(new Intent(userRoll.this,ViewUploadsActivity.class));

                }
                else{
                    Toast.makeText(userRoll.this, "Error :Invalid Roll no", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }


}
