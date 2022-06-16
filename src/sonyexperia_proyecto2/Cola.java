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
    private Node pFirst;
    private Node pLast;
    private int size;
    public Cola(){
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
    }

    /**
     * @return the pFirst
     */
    public Node getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Node getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Node pLast) {
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
    public void Encolar(Object data){
        Node newNode= new Node(data);
        if (isEmpty()) {
            pFirst=newNode;
            pLast=newNode;
        }else{
            Node aux=pLast;
            aux.setpNext(newNode);
            pLast=newNode;
        }
        size ++;
    }
    public void Desencolar(){
        if (!isEmpty()) {
            pFirst=pFirst.getpNext();
            if(pFirst==null){
                pLast=null;
            }
        }
        size --;
        
    }
    public Object LeerPrimer(){
        return pFirst;
    }
    public void PrintColaRecursiva(){
        String data="";
        data=AuxiliarPrint(data);
        this.reverse();
        System.out.println(data);
    }
    public String AuxiliarPrint(String data){
        if (!this.isEmpty()) {
            Object nodeData=this.pFirst.getData();
            data+=nodeData + ",";
            this.Desencolar();
            data= AuxiliarPrint(data);
            this.Encolar(nodeData);
        }
        return data;
    }
    public void reverse(){
        if (!this.isEmpty()) {
            Object nodeData =this.pFirst.getData();
            this.Desencolar();
            reverse();
            this.Encolar(nodeData);
        }
    }
    public void PrintColaRecursivaReverse(){
        String data="";
        data=AuxiliarPrintReverse(data);
        this.reverse();
        System.out.println(data);
    }
    public String AuxiliarPrintReverse(String data){
        if (!this.isEmpty()) {
            Object nodeData=this.pFirst.getData();
            
            this.Desencolar();
            data= AuxiliarPrintReverse(data);
            data+=nodeData + ",";
            this.Encolar(nodeData);
        }
        return data;
    }
    public void SortAscending(){
        if (!this.isEmpty()) {
            String mayor = (String) this.pFirst.getData();
        for (int i = 0; i < this.size; i++) {
            String actual= (String) this.pFirst.getData()  ;
            if (mayor.compareToIgnoreCase(actual)<0) {
                mayor= actual;
                
            }
            this.Desencolar();
            this.Encolar(actual);
        }
        while((String) this.pFirst.getData()!= mayor){
            String actual = (String) this.getpFirst().getData();
            this.Desencolar();
            this.Encolar(actual);
        }
        this.Desencolar();
        this.SortAscending();
        this.Encolar(mayor);
        
            
        }
        
    }
    
    
    
}
