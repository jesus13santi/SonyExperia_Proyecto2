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
    public void Encolar(Telefonos data){
        Telefonos newNode= data;
        if (isEmpty()) {
            pFirst=newNode;
            pLast=newNode;
        }else{
            Telefonos aux=pLast;
            aux.setpNext(newNode);
            pLast=newNode;
        }
        size ++;
    }
//    public void EncolarNormal(int data, int data1){
//        Node newNode= new Node(data,data1);
//        if (isEmpty()) {
//            pFirst=newNode;
//            pLast=newNode;
//        }else{
//            Node aux=pLast;
//            aux.setpNext(newNode);
//            pLast=newNode;
//        }
//        size ++;
//    }
    
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
    public void Desencolar2(){
        if (!isEmpty()) {
            pFirst=pFirst.getpNext();
            if(pFirst==null){
                pLast=null;
            }
            size --;
        }
        
        
    }
    
    public Object LeerPrimer(){
        return pFirst;
    }
    public String PrintColaRecursiva(){
        String data="";
        data=AuxiliarPrint(data);
        this.reverse();
        
        System.out.println(data);
        return data;
    }
    public String AuxiliarPrint(String data){
        if (!isEmpty()) {
            int nodeData=this.pFirst.getId();
//            System.out.println(nodeData);
            data+=nodeData + "\n";
            Telefonos aux =Desencolar();
            
            data= AuxiliarPrint(data);
            EncolarNode(aux);
        }
        return data;
    }
    public void reverse(){
        if (!isEmpty()) {
            int nodeData =this.pFirst.getId();
            Telefonos aux =Desencolar();
            reverse();
            EncolarNode(aux);
        }
    }
}