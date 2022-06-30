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

    private int id;
    private int copas;
    private boolean ready;
    private int contadorEncolado;
    private Telefonos pNext;
   
    
    public Telefonos(int id, int copas) {
        this.id = id;
        this.copas = copas;
        ready = false;
    }

    public void setContadorEncolado(int momentoEncolado) {
        this.contadorEncolado = momentoEncolado;
    }

    public int getContadorEncolado() {
        return contadorEncolado;
    }
    
    public void setCopas(int copas) {
        this.copas = copas;
    }

    public int getCopas() {
        return copas;
    }

    public int getId() {
        return id;
    }

    public boolean isReady() {
        return ready;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public Telefonos getpNext() {
        return pNext;
    }

    public void setpNext(Telefonos pNext) {
        this.pNext = pNext;
    }
    
}
