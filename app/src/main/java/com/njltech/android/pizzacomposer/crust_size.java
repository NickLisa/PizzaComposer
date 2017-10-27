package com.njltech.android.pizzacomposer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class crust_size extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crust_size);

        //Take spinner input and save it to a variable to be used later in SUMMARY
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner_size);
        String size = mySpinner.getSelectedItem().toString();

        //Button to go to Toppings (Change NameofNextClass to your toppings activity name)
        Button btn = (Button) findViewById(R.id.btnToppings);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(crust_size.this, NameOfNextClass.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //Class to determine which radio button is selected to save it to a variable for later use in SUMMARY
    public void onRadioButtonClicked(View view) {
        //Variable that holds radio crust selection
        String crust;

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
}