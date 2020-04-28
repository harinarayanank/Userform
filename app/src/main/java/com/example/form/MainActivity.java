package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView username,userage,usercourse;
    EditText name,age,course;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(TextView)findViewById(R.id.username);
        userage=(TextView)findViewById(R.id.userage);
        usercourse=(TextView)findViewById(R.id.usercourse);

        name=(EditText)findViewById(R.id.name);
        age=(EditText)findViewById(R.id.age);
        course=(EditText)findViewById(R.id.course);



        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getApplicationContext(),result.class);

                Bundle b =new Bundle();

                b.putString("name",name.getText().toString());
                b.putString("age",age.getText().toString());
                b.putString("course",course.getText().toString());

                intent.putExtras(b);

                startActivity(intent);


            }
        });

    }
}
