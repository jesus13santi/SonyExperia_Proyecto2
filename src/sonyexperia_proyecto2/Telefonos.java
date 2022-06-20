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
    private int nivel;
    private boolean ready;
    private int momentoEncolado;
    private Telefonos pNext;
    private Object data;

    public void setMomentoEncolado(int momentoEncolado) {
        this.momentoEncolado = momentoEncolado;
    }

    public int getMomentoEncolado() {
        return momentoEncolado;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public Telefonos(int id, int prioridad) {
        this.id = id;
        nivel = prioridad;
        ready = false;
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

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Telefonos pNext) {
        this.pNext = pNext;
    }
    
}
