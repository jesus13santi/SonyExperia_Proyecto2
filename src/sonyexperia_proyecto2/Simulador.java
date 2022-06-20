/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonyexperia_proyecto2;

import java.util.logging.Level;
import java.util.logging.Logger;
import static sonyexperia_proyecto2.Administrador.nivel;

/**
 *
 * @author jesus13santi
 */
public class Simulador extends Thread {
    
    public static int iterations;
    public static boolean running;
    private int releases;
    
    public Simulador(){   
        releases  = 0;
        running = false;
        Administrador.init();
    }
    
    @Override
    public void run(){
        
        running = true;

        
        Administrador.encolar( new Telefonos(0, (int)(Math.random() * (3) ) ) );
        
        for(iterations = 1; running; iterations++){
            

            
            int prob = (int)(Math.random() * (101) );

            if( iterations%2==0 ){
                 System.out.println("ENTRAA");
                if ( prob <= 70 ) {
                Administrador.encolar( new Telefonos(iterations/2, (int)(Math.random() * (3) ) ) );
                }
                
            }
               
            
            try {
                if(InteligenciaArtificial.check( Administrador.getNext() ) ){
                    releases++;

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
            }
            

              System.out.println(Administrador.mejora.PrintColaRecursiva());
              System.out.println("############################################");
//            System.out.println(Administrador.nivel[0].getSize());
//            System.out.println(Administrador.nivel[1].getSize());
//            System.out.println(Administrador.nivel[2].getSize());
//            System.out.println(Administrador.mejora.getSize());
            Administrador.updateMejora();
            Administrador.updateNiveles();
        
        }
    
    }
}