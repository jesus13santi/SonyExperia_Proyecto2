package sonyexperia_proyecto2;

import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus13santi
 */
public class InteligenciaArtificial {
    public static boolean check( Telefonos telefono ) throws InterruptedException{

        if(telefono == null)
            return false;
        
        sleep(Simulador.dia*1000);
        
        int prob = (int)(Math.random() * (101) );
        
        if( prob<=40 ){
            telefono.setReady(true);
            return true;
        }else if( prob<=65 ){
            Administrador.encolar(telefono);
        }else{
            Administrador.encolarMejora(telefono);
        }
        return false;
    }
}
