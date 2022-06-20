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
public class Administrador {
    
    public static Cola[] nivel;
    public static Cola mejora;
    
    public static void init(){
        
        nivel = new Cola[3];
        for(int i = 0; i<3; i++)
            nivel[i] = new Cola();
        
        mejora = new Cola();
        
    }
    
//    public static String list2string(int i){
//        
//        String tmp = "";
//        
//        if(i<3)
//            tmp = nivel[i].stream().map(x -> ""+x.getId()+"\n").reduce(tmp, String::concat);
//        else
//            tmp = mejora.stream().map(x -> ""+x.getId()+"\n").reduce(tmp, String::concat);
//        
//        return tmp;
//                
//    }
    
    public static Telefonos getNext(){
        
        if( !nivel[0].isEmpty() )
            return nivel[0].Desencolar();
        
        if( !nivel[1].isEmpty() )
            return nivel[1].Desencolar();
        
        if( !nivel[2].isEmpty() )
            return nivel[2].Desencolar();
            
        return null;
        
    }
    
    public static void updateMejora(){
        
        int prob = (int)(Math.random() * (101) );
        
        if( !mejora.isEmpty() && prob <= 45)
            encolar(mejora.Desencolar());
        
    }
    
    public static void encolar(Telefonos escritorio){
        
        escritorio.setMomentoEncolado( Simulador.iterations );
        nivel[escritorio.getNivel()].EncolarNode(escritorio);
        
    }
    
    public static void encolarMejora(Telefonos escritorio){
        
        mejora.EncolarNode(escritorio);
        
    }
    
    public static void updateNiveles(){
        
        for(int i = 1; i<3; i++)
            while( !nivel[i].isEmpty() && ( Simulador.iterations - nivel[i].getpLast().getMomentoEncolado() >= 8 ) ){
                nivel[i].getpLast().setNivel(i-1);
                encolar( nivel[i].Desencolar() );
            }
                
        
    }
    
}
