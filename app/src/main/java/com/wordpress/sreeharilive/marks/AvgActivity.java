package com.wordpress.sreeharilive.marks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AvgActivity extends AppCompatActivity {
    String sum;
    TextView avg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg);
        avg=(TextView)findViewById(R.id.avg);
        sum=getIntent().getExtras().getString("value");
        avg.setText(sum);

    }
}
