package com.iamsm.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Switch switch1;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 =findViewById(R.id.switch1);
        img=findViewById(R.id.imageView);
        radioGroup =findViewById(R.id.radioGroup);
        switch1.setClickable(FALSE);
        checkBox =findViewById(R.id.checkBox);
        switch1.setVisibility(View.INVISIBLE);
        img.setVisibility(View.INVISIBLE);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibilityImgView(v);
                toggleVisibilitySwitch(v);
                toggleCheckBox(v);
            }
        });
    }

    public void toggleVisibilityImgView(View v)
    {
        if(!switch1.isChecked())
            img.setVisibility(View.INVISIBLE);
        else
            img.setVisibility(View.VISIBLE);
    }

    public void toggleVisibilitySwitch(View v)
    {
        int id= radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(id);
        if(radioButton ==findViewById(R.id.radioButton1)) {
            switch1.setClickable(TRUE);
        }
        else {
            switch1.setClickable(FALSE);
        }

    }

    public void toggleCheckBox(View v)
    {
        if(checkBox.isChecked())
            switch1.setVisibility(View.VISIBLE);
        else
            switch1.setVisibility(View.INVISIBLE);
    }
}
