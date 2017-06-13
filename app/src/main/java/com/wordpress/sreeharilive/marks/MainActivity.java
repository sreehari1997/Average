package com.wordpress.sreeharilive.marks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText daa,ic,ss,cn,se,unix;
    Button btn;
    double a,b,c,d,e,f,sum;

    String s,ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daa=(EditText)findViewById(R.id.editText);
        ic=(EditText)findViewById(R.id.editText2);
        ss=(EditText)findViewById(R.id.editText3);
        cn=(EditText)findViewById(R.id.editText4);
        se=(EditText)findViewById(R.id.editText5);
        unix=(EditText)findViewById(R.id.editText6);
        btn=(Button)findViewById(R.id.button);
    }
   public void calculate(View v){
       a = Double.parseDouble(daa.getText().toString());
       b = Double.parseDouble(ic.getText().toString());
       c = Double.parseDouble(ss.getText().toString());
       d = Double.parseDouble(cn.getText().toString());
       e = Double.parseDouble(se.getText().toString());
       f = Double.parseDouble(unix.getText().toString());
       sum =a+b+c+d+e+f;
       Toast.makeText(this,"sum="+sum,Toast.LENGTH_SHORT).show();
       sum=((sum/360)*100);
       ad=String.valueOf(sum);
       Intent i = new Intent(this,AvgActivity.class);
       i.putExtra("value",ad);
       startActivity(i);
       finish();
   }
}
