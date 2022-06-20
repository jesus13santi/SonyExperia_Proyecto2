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
public class Cola {
    private Telefonos pFirst;
    private Telefonos pLast;
    private int size;
    public Cola(){
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
    }

    /**
     * @return the pFirst
     */
    public Telefonos getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Telefonos pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Telefonos getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Telefonos pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty(){
         return pFirst==null;
    }
    public void EncolarNode(Telefonos node) {
        Telefonos node2 = node;
        if (this.isEmpty()) {
            this.pFirst = this.pLast = node;
        } else {
            Telefonos aux = pLast;
            pLast= node2;
            aux.setpNext(node2);
            node2.setpNext(null);
//            node
            
            
//            this.pLast.setpNext(node);
//            this.pLast = node;
        }
        size++;
    }
    public Telefonos Desencolar(){
        Telefonos aux = null;
        if (!isEmpty()) {
            aux = pFirst;
            
            pFirst=pFirst.getpNext();
            if(pFirst==null){
                pLast=null;
            }
            size --;
            aux.setpNext(null);
        }
        
        return aux;
        
    }
   
   
 
    public Object LeerPrimer(){
        return pFirst;
    }

    
    
    
}
