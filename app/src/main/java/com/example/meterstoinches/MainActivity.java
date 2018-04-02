package com.example.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Double CONVERSION = 39.3701; //1m = 39.3701 inches
    private Button convertButton;
    private EditText editMeters;
    private TextView showMeters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertButton = findViewById(R.id.convertButton);
        editMeters = findViewById(R.id.editMeters);
        showMeters = findViewById(R.id.showMeters);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = 0.0; //holder
                if(editMeters.getText().toString().equals("")) {
                    showMeters.setText(R.string.error_message);
                    showMeters.setTextColor(Color.RED);
                } else {
                    double meters =Double.parseDouble(editMeters.getText().toString());
                    result = meters * CONVERSION;
                    showMeters.setTextColor(Color.DKGRAY);
                    showMeters.setText(String.format("%.2f", result) + " inches");
                }
            }
        });
    }



   /* public void convertMetersToInches(View view) {
        double result = 0.0; //holder
        double meters =Double.parseDouble(editMeters.getText().toString());

        if(editMeters.getText().toString().equals("")) {
            showMeters.setText(R.string.error_message);
            showMeters.setTextColor(Color.RED);
        } else {
            result = meters * CONVERSION;
            showMeters.setTextColor(Color.DKGRAY);
            showMeters.setText(String.format("%.2f", result) + " inches");
        }*/

}
