package com.globallogic.bootcampgl.junitTest;


public class App 
{
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public static int restar(int num1, int num2){
        return num1 - num2;
    }
    
    
    public static void main( String[] args )
    {
        int a = 3, b = 5;
        int res = sumar(a, b);
        int esperado = 5;
        if (res == esperado){
            System.out.println("Este resultado esta bien");
        }else{
            System.out.println("Este resultado está mal");
        }
    }
}
