package com.example.user.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Firstnum;
    private EditText Secnum;
    private Button Btn;
    private TextView Res;

    double fnum, snum, sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firstnum = (EditText) findViewById(R.id.firstNum);
        Secnum = (EditText) findViewById(R.id.secNum);
        Res = (TextView) findViewById(R.id.res);

    }
    public void add (View view) {
        try {
            fnum = Double.parseDouble(Firstnum.getText().toString());
            snum = Double.parseDouble(Secnum.getText().toString());
            sum = fnum + snum;
            Res.setText(Double.toString(sum));
        } catch (Exception e) {

        }
    }
}
