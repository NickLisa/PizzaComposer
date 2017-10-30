package com.njltech.android.pizzacomposer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView textViewCrust = (TextView) findViewById(R.id.txtgetCrust);
        textViewCrust.setText(crust_size.getCrust());

        TextView textViewSize = (TextView) findViewById(R.id.txtgetSize);
        textViewSize.setText(crust_size.getSize());

        TextView textViewTop1 = (TextView) findViewById(R.id.txtgetTop1);
        textViewTop1.setText(toppings.getTopping1());

        TextView textViewTop2 = (TextView) findViewById(R.id.txtgetTop2);
        textViewTop2.setText(toppings.getTopping2());

        //Button to go to Toppings
        Button btn = (Button) findViewById(R.id.btnContact);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(summary.this, contact.class);
                startActivity(intent);
                finish();
            }
        });
        //End Button
    }
}
