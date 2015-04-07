/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Omar
 */
public class Cuate {
    private String user;
    private String pwd;
    private String apellidos;
    private String nombres;
    private double cuotas;

    public Cuate() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getCuotas() {
        return cuotas;
    }

    public void setCuotas(double cuotas) {
        this.cuotas = cuotas;
    }
    
    

    public Cuate(String user, String pwd, String apellidos, String nombres, double cuotas) {
        this.user = user;
        this.pwd = pwd;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cuotas = cuotas;
    }

    

    
    
    
    
}
