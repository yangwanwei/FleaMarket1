package com.example.dell.fleamarket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private Button sell;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sell = (Button) findViewById(R.id.sell);
        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        input3=(EditText) findViewById(R.id.input3);

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("name",input1.getText().toString().trim());
                intent.putExtra("value",input2.getText().toString().trim());
                intent.putExtra("tel",input3.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
