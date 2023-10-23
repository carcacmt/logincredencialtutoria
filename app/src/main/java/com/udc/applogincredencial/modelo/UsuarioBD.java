package com.udc.applogincredencial.modelo;

import android.icu.lang.UScript;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBD {
    private List<Usuario> usuarios = new ArrayList<>();
    public UsuarioBD(){
        bdUsuario();
    }
    private List<Usuario> bdUsuario(){
        usuarios.add(new Usuario("1","juan01","123456","juan perez"));
        usuarios.add(new Usuario("2","maria01","123456","Maria Lopez"));
        return usuarios;
    }

    public Usuario login(String user,String password){
        Usuario usuarioEncontrado = null;
        for(Usuario usuario:usuarios){
            if(usuario.getUser().equals(user)  && usuario.getPassword().equals(password)){
                usuarioEncontrado = usuario;
                break;
            }
        }
        return usuarioEncontrado;
    }
}
