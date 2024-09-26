package com.mycompany.mario; 

  
class Heroe { 

    private int vidas; 

    private int x;  

    private String nombre; 

    private boolean saltando; 

     

    public Heroe(String nombre){ 

        this.vidas=3; 

        this.x=0; 

        this.nombre=nombre; 

        this.saltando=false; 

    } 

  

    

  

    public int getVidas() { 

        return vidas; 

    } 

  

    public int getPosicion() { 

        return x; 

    } 

  

    public String getNombre() { 

        return nombre; 

    } 

  

    public boolean getSaltando() { 

        return saltando; 

    } 

  

     

     

  

    public void setVidas(int vidas) { 

        this.vidas = vidas; 

    } 

     

     

  

    /* 

        Metodos 

     

    */ 

  

  

     

    public void avanzarUnPaso(){ 

         

         

        this.x= this.x+1; 

        System.out.println("Avanza 1, su posicion es: "+this.x); 

        this.saltando = false; 

    } 

     

    public void saltarObstaculo(){ 

         

        this.x= this.x+1; 

         

        this.saltando=true; 

        System.out.println("Sus vidas son: "+this.vidas +" estado: "+this.saltando); 

    } 

     

} 

 

 