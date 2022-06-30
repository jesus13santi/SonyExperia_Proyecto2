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
    
    public static Telefonos obtenerSiguiente(){
        
        if( !nivel[0].isEmpty() )
            return nivel[0].Desencolar();
        
        if( !nivel[1].isEmpty() )
            return nivel[1].Desencolar();
        
        if( !nivel[2].isEmpty() )
            return nivel[2].Desencolar();
            
        return null;
        
    }
    
    public static void actualizarMejora(){
        
        int prob = (int)(Math.random() * (101) );
        
        if( !mejora.isEmpty() && prob <= 40)
            encolar(mejora.Desencolar());
        
    }
    
    public static void encolar(Telefonos escritorio){
        if(escritorio.getCopas() < 2000){
            escritorio.setContadorEncolado(Simulador.iteraciones );
            nivel[0].EncolarNode(escritorio);
        }else if(escritorio.getCopas() < 3000) {
            escritorio.setContadorEncolado(Simulador.iteraciones );
            nivel[1].EncolarNode(escritorio);
        }else{
            escritorio.setContadorEncolado(Simulador.iteraciones );
            nivel[2].EncolarNode(escritorio);  
        }
        
        
    }
    
    public static void encolarMejora(Telefonos escritorio){
        
        mejora.EncolarNode(escritorio);
        
    }
    
    public static void actualizarNiveles(){
        
        for(int i = 1; i<3; i++){
//            if(!nivel[i].isEmpty()){
//                System.out.println( "Telefono: " + nivel[i].getpFirst().getId() +" Contador Encolado: " + nivel[i].getpFirst().getContadorEncolado() + "== " + ( Simulador.iteraciones - nivel[i].getpFirst().getContadorEncolado()));
//            }
            
            while( !nivel[i].isEmpty() && ( Simulador.iteraciones - nivel[i].getpFirst().getContadorEncolado() >= 8 ) ){

                if(nivel[i].getpFirst().getCopas() == 0){
                    nivel[i].getpFirst().setCopas(nivel[i].getpFirst().getCopas()+2000);
                    encolar( nivel[i].Desencolar() );
                    
                }else{
                    nivel[i].getpFirst().setCopas(nivel[i].getpFirst().getCopas()+1000);
                    encolar( nivel[i].Desencolar() );
                }
                
            }
            
        }
            
                
        
    }
    
}
