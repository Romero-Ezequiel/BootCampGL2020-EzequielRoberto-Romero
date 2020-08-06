package com.globallogic.bootcampgl.junitTest;


public class App 
{ 
    public boolean Condicion(int valorMaximo) {

        boolean max = false;
        for(int i = 0; i < valorMaximo;i++ ) {  			
           if( i == 3){
                max = true;
                break;
           }
        }
        return max;
    }
}


