package com.mycompany.mario; 

  

import java.util.Scanner; 

  

/** 

* 

* @author Usuario 

*/ 

public class Mario { 

  

    public static void main(String[] args) { 

         Heroe marioB = new Heroe("MarioB"); 

         

         Scanner lector  = new Scanner(System.in); 

         char tecla =' '; 

         boolean bandera=false; 

         System.out.println("Bienvenido a MarioB"); 

         System.out.println("Su jugador es: "+marioB.getNombre()+" tiene "+marioB.getVidas()+" vidas. "); 

          

         System.out.println("Su posicion es "+marioB.getPosicion()); 

         System.out.println("d-->avanza, w-->salta, z-->salir"); 

         while (bandera!=true){ 

             tecla = lector.next().charAt(0); 

            tecla = Character.toLowerCase(tecla); 

             

            

            switch (tecla) { 

                case 'd': 

                    marioB.avanzarUnPaso(); 

                    break; 

                case 'w': 

                    marioB.saltarObstaculo(); 

                    break; 

                case 'z': 

                    System.out.println("saliendo del juego"); 

                    bandera=true; 

                    break; 

                default: 

                    System.out.println("Tecla inválida"); 

            } 

             

             if(marioB.getPosicion()%10==0 && marioB.getPosicion()!=0 ){ 

                System.out.println("Hay un obstaculo, saltaaaaaaaa"); 

            } 

             

            if(marioB.getPosicion()%10==1 && (marioB.getSaltando()==false) && (marioB.getPosicion()!=1) ){ 

                if(marioB.getVidas()>1){ 

                    marioB.setVidas(marioB.getVidas()-1); 
                    

                }else{ 

                    System.out.println(marioB.getNombre()+" muere..."); 

                    bandera=true; 

                } 

            } 

          System.out.println("su vida es: "+marioB.getVidas());

         } 

          

          

    } 

} 