package com.example.calculator2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv;
    Button b1;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        et1=(EditText) findViewById(R.id.num1);
        et2=(EditText) findViewById(R.id.num2);
        tv=(TextView)findViewById(R.id.restodisplay);
        b1=(Button) findViewById(R.id.addbtn);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               getNum1=et1.getText().toString();
               getNum2=et2.getText().toString();
               num1=Integer.parseInt(getNum1);
               num2=Integer.parseInt(getNum2);
               sum=num1+num2;
               result=String.valueOf(sum);

               tv.setText(result);

               Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();

           }
       });




    }
}