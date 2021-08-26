package com.ecommerce.android.ourecom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class LanguageScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_screen);
        Button button = findViewById(R.id.button);
        CheckBox checkBox = findViewById(R.id.checkbox1);
        CheckBox checkBox1 = findViewById(R.id.checkbox2);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox1.setChecked(false);
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox.setChecked(false);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()){

                    Intent intent  = new Intent(    LanguageScreen.this,Registration.class);
                    startActivity(intent);


                }
                else if (checkBox1.isChecked()){

                    Intent intent = new Intent(LanguageScreen.this,Registration.class);
                    startActivity(intent);


                }
                else {
                    Toast.makeText(LanguageScreen.this, "Please Select One Language", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}