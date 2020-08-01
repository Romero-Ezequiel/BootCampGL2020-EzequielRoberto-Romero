package com.globallogic.bootcampgl.junitTest;


public class App 
{
    
    public boolean Condicion(int valorMaximo) {

        int contador = 0;
        for(int valorInicial = 0; valorInicial < valorMaximo; valorInicial++ ) {  			
            contador++;
        }

        if(contador == 3){
            return true;
        }else{
            return false;
        }		
	
    }
}


