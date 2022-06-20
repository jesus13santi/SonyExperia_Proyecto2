package sonyexperia_proyecto2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus13santi
 */
public class Telefonos {
    public int idTelefono;
    public int nivel;
    public boolean ready;
    public int contador;
    private Telefonos pNext;
  
    
    public Telefonos(int idTelefono, int nivel) {
        this.idTelefono = idTelefono;
        this.nivel = nivel;
        ready = false;
        
    }
    public int getIdTelefono() {
        return idTelefono;
    }

    public boolean isReady() {
        return ready;
    }

    public void setIdTelefono(int id) {
        this.idTelefono = id;
    }
    

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public int getContador(){
        return contador;
    }
    public void setContador(int contador){
        this.contador = contador;
    }
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Telefonos getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Telefonos pNext) {
        this.pNext = pNext;
    }
    
    
}
