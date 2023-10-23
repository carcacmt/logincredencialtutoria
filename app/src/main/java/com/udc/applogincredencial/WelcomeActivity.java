package com.udc.applogincredencial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.udc.applogincredencial.modelo.Usuario;

public class WelcomeActivity extends AppCompatActivity {
    private TextView welcometext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcometext = findViewById(R.id.welcometext);
        initWelcome();
    }
    public void initWelcome(){
        final String MENSAJE_BIENVENIDO = "Bienvenido ";
        final String MENSAJE_USUARIO = "Usuario:";
        Bundle bundle = getIntent().getBundleExtra("bundle");
        Usuario usuario = (Usuario) bundle.getSerializable("usuario");
        if(usuario!=null){
            welcometext.setText(MENSAJE_USUARIO+usuario.getUser());
            Toast.makeText(this,
                    MENSAJE_BIENVENIDO+usuario.getNombre(),
                    Toast.LENGTH_LONG).show();
        }
    }
}