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
    
    public static int iteraciones;
    public static boolean running;
    private int telefonosListos;
    public static int dia;

    
    public Simulador(){   
        telefonosListos  = 0;
        running = false;
        dia = 1;
        Administrador.init();
        
    }
    
    @Override
    public void run(){
        
        running = true;
        Interfaz.disponibles.setText(""+telefonosListos);
        Interfaz.dias.setText(""+dia);

        
        Administrador.encolar( new Telefonos(0, ((int)(Math.random() * (4))*1000 ) ) );
        
        for(iteraciones = 1; running; iteraciones++){
            
            if( !nivel[0].isEmpty() )
                Interfaz.revision.setText( Integer.toString(nivel[0].getpFirst().getId()));
            
            else if( !nivel[1].isEmpty() )
                Interfaz.revision.setText( Integer.toString(nivel[1].getpFirst().getId()));
            
            else if( !nivel[2].isEmpty() )
                Interfaz.revision.setText( Integer.toString(nivel[2].getpFirst().getId()));
            
            else Interfaz.revision.setText("Ninguno");
            

            
            int prob = (int)(Math.random() * (101) );

            if( iteraciones%2==0 ){
               
                if ( prob <= 70 ) {
                    Administrador.encolar(new Telefonos(iteraciones/2, ((int)(Math.random() * (4))*1000 ) ) );
                }
                
            }
               
            
            try {
                if(InteligenciaArtificial.check( Administrador.obtenerSiguiente() ) ){
                    telefonosListos++;
                    Interfaz.disponibles.setText(""+telefonosListos);

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    
                Interfaz.nivel1.setText(""+Administrador.nivel[0].PrintColaRecursiva());
                Interfaz.nivel2.setText(""+Administrador.nivel[1].PrintColaRecursiva());
                Interfaz.nivel3.setText(""+Administrador.nivel[2].PrintColaRecursiva());
                Interfaz.mejora.setText(""+Administrador.mejora.PrintColaRecursiva());
            Administrador.actualizarMejora();
            Administrador.actualizarNiveles();
        
        }
    
    }
}