package com.udc.applogincredencial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        iniciar();
    }
    public void iniciar()  {
      Thread time = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(InitActivity.this, MainActivity.class);
                    startActivity(intent);
                    this.interrupt();
                }
            }
        };
        time.start();
    }
}