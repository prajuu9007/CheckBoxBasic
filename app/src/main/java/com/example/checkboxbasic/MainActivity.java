package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        CheckBox ch1,ch2,ch3,ch4,ch5;
        TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1=findViewById(R.id.andriodCheckBox);
        ch1.setOnClickListener(this);
        ch2=findViewById(R.id.javacheckBox);
        ch2.setOnClickListener(this);
        ch3=findViewById(R.id.phpcheckBox);
        ch3.setOnClickListener(this);
        ch4=findViewById(R.id.pythoncheckBox);
        ch4.setOnClickListener(this);
        ch5=findViewById(R.id.unity3dcheckBox);
        ch5.setOnClickListener(this);
        tv=findViewById(R.id.textview);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.andriodCheckBox:
                if (ch1.isChecked())
                    Toast.makeText(this, "Andriod", Toast.LENGTH_SHORT).show();
                break;
            case R.id.javacheckBox:
                if (ch2.isChecked())
                    Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;
                case R.id.phpcheckBox:
                if (ch3.isChecked())
                Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();
            break;
            case R.id.pythoncheckBox:
                if (ch4.isChecked())
                Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();
            break;
            case R.id.unity3dcheckBox:
                if (ch5.isChecked())
                Toast.makeText(this, "Unity 3D", Toast.LENGTH_SHORT).show();
            break;

        }
    }
}
