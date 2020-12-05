package home.ejercicio7;

import home.ejercicio1.ejercicio1;

public class ejercicio7 {
    public static void main (String [] args){
        mostrar();
    }

    public static void mostrar(){
        System.out.print("Ingrese una palabra: ");
        mayusculas(ejercicio1.captarpalabra());
    }
    public static void mayusculas(String palabra) {
        char [] lista = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] lista1={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};       
        String palabra_salida ="";
        for( int i=0; i< palabra.length();i++){
            for (int x=0;x<lista.length;x++){
                if(palabra.charAt(i)== lista[x]){
                palabra_salida=palabra_salida+lista1[x]; 
                }
                }
            if(palabra_salida.length() == i ){
                palabra_salida=palabra_salida+palabra.substring(i, i+1);
            }
        }
        System.out.println(palabra_salida);
    }
}