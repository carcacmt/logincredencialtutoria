package com.udc.applogincredencial.modelo;

import java.io.Serializable;

/**clase dto**/
public class Usuario implements Serializable {
    private String id;
    private String user;
    private String password;
    private String nombre;

    public Usuario(String id, String user, String password, String nombre) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
