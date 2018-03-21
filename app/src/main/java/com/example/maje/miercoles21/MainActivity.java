package com.example.maje.miercoles21;

import android.app.Activity;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{


    public static final int REQUEST_CODE_A=10;
    public static final int REQUEST_CODE_B=20;
    public static final int REQUEST_CODE_X=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.A_button).setOnClickListener(this);
        findViewById(R.id.B_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        int requestCode=0;

        switch (view.getId()){
            case R.id.A_button:

                intent=new Intent(this,A_Activity.class);
                requestCode= MainActivity.REQUEST_CODE_A;
                break;

            case R.id.B_button:
                intent=new Intent(this,B_Activity.class);
                requestCode= MainActivity.REQUEST_CODE_B;
                break;
            case R.id.X_button:
                intent=new Intent(this,A_Activity.class);
                requestCode= MainActivity.REQUEST_CODE_X;
                break;
        }

        this.startActivityForResult(intent,requestCode);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast toast=null;
        switch (requestCode){
            case MainActivity.REQUEST_CODE_A:
                if(resultCode==RESULT_OK) {
                    toast = Toast.makeText(this, "respuesta OK de A", Toast.LENGTH_LONG);
                }else if(resultCode==RESULT_CANCELED){
                    toast = Toast.makeText(this, "respuesta cancel de A", Toast.LENGTH_LONG);
                }
                break;
            case  MainActivity.REQUEST_CODE_B:
                toast=Toast.makeText(this,"respuesta de B",Toast.LENGTH_LONG);
                break;
        }

        if(toast!=null){
            toast.show();
        }
    }
}
