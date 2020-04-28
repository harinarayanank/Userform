package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();

        TextView names=(TextView)findViewById(R.id.namedisp);
        TextView ages=(TextView)findViewById(R.id.agedisp);
        TextView courses=(TextView)findViewById(R.id.coursedisp);

        TextView name=(TextView)findViewById(R.id.name);
        TextView age=(TextView)findViewById(R.id.age);
        TextView course = (TextView)findViewById(R.id.course);

        names.setText(b.getCharSequence("name"));
        ages.setText(b.getCharSequence("age"));
        courses.setText(b.getCharSequence("course"));


    }
}
