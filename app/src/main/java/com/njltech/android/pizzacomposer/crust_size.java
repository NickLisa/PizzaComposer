package com.njltech.android.pizzacomposer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class crust_size extends AppCompatActivity {

    static String crust = "Neapolitan";
    static String size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crust_size);

        //Button to go to Toppings
        Button btn = (Button) findViewById(R.id.btnToppings);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(crust_size.this, toppings.class);
                startActivity(intent);
                finish();
            }
        });
        //End Button

        //Take spinner input and save it to a variable to be used later in SUMMARY
        Spinner size = (Spinner) findViewById(R.id.spinner_size);
        size.setOnItemSelectedListener(new crust_size.ItemSelectedListener());
    }



    //Class to determine which radio button is selected to save it to a variable for later use in SUMMARY
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioNeo:
                if (checked)
                    crust = "Neapolitan";
                break;
            case R.id.radioNY:
                if (checked)
                    crust = "New York Style";
                break;
            case R.id.radioPan:
                if (checked)
                    crust = "Pan";
                break;
            case R.id.radioDeep:
                if (checked)
                    crust = "Deep Dish";
                break;
        }
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            size = parent.getItemAtPosition(pos).toString();
        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }
    }

    public static String getCrust(){
        return crust;
    }

    public static String getSize(){
        return size;
    }
}