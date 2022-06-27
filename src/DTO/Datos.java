/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author hazae
 */
public class Datos {
    String nombre;
    String direccion;
    String fechaa;
    String fechal;
    int id;

    public Datos(String nombre, String direccion, String fechaa, String fechal, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaa = fechaa;
        this.fechal = fechal;
        this.id = id;
    }

    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaa() {
        return fechaa;
    }

    public void setFechaa(String fechaa) {
        this.fechaa = fechaa;
    }

    public String getFechal() {
        return fechal;
    }

    public void setFechal(String fechal) {
        this.fechal = fechal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
