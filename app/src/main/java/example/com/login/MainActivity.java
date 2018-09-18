package example.com.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText etname,etpass;
Button blog, bsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.name);
        etpass=findViewById(R.id.password);
        blog=findViewById(R.id.Login);
        bsign=findViewById(R.id.sign);
        etname.setOnClickListener(this);
        blog.setOnClickListener(this);
        bsign.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==etname){
            etname.setText("");
        }
        else if (view==bsign){
            Toast.makeText(getApplicationContext(),"sign",Toast.LENGTH_SHORT).show();
            Intent in=new Intent(MainActivity.this,SignUp.class);
            startActivity(in);
        }
        else if (view==blog){
            Toast.makeText(getApplicationContext(),"login",Toast.LENGTH_SHORT).show();


        }
    }
}
