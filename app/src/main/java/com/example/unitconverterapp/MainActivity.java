package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.unitconverterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    /* TextView welcome_text, result_text;
     Button btn;
     EditText editText;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //   setContentView(R.layout.activity_main);

       /* welcome_text = findViewById(R.id.welcome_textView);
        result_text  = findViewById(R.id.result_textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);
*/

        mainBinding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double kilos_entered = Double.parseDouble(mainBinding.editText.getText().toString());


                mainBinding.resultTextView.setText("" + convertToPounds(kilos_entered) + " lb");

            }
        });
    }


    public double convertToPounds(double kilos) {

        double pounds_result = kilos * 2.20462;
        return pounds_result;
    }

}