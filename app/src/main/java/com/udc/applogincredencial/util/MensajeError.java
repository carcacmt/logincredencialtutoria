package com.udc.applogincredencial.util;

import java.util.ArrayList;
import java.util.List;

public class MensajeError {

    private static List<String> validarEntrada(String user, String password){
        List<String> mensajes = new ArrayList<>();
        if(user.isEmpty()){
            mensajes.add("* Campo Usuario Vacio");
        }
        if(password.isEmpty()){
            mensajes.add("* Campo Password Vacio");
        }
        return mensajes;
    }
    public  static String mostrarMensajeError(String user,String password){
        List<String> mensajes = validarEntrada(user,password);
        String errores="";
        for(String mensaje:mensajes){
            errores +=mensaje+"\n";
        }
        return errores.trim();
    }
}
