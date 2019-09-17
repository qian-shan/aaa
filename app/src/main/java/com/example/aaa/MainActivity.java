package com.example.aaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText e;
    TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        a=findViewById(R.id.a);

        e=findViewById(R.id.e);


        Button b=findViewById(R.id.b);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String str=e.getText().toString();
     a.setText(str);
    }
}
