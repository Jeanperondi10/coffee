package com.example.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int n=0;
    int preco=3;
    int total=0;
    TextView textView;
    TextView totalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.texto);
        totalView= findViewById(R.id.textTotal);
    }




    public void reduz(View view){
        if(n>0) {
            n--;
            textView.setText("" + n);
            calculo();
        }
    }
    public void aumenta(View view){
        n++;
        textView.setText("" + n);
        calculo();
    }
    public void calculo(){
        total=3*n;
        totalView.setText("Preco Total: "+total);
    }
}
