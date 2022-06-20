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
    public static int contador;
    
    public static void init(){
        
        nivel = new Cola[3];
        for(int i = 0; i<3; i++)
            nivel[i] = new Cola();
        
        mejora = new Cola();
        
    }
     
    
    
    
}
