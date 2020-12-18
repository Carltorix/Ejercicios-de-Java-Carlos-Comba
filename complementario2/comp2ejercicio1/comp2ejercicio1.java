package complementario2.comp2ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class comp2ejercicio1 {
    public static void main (String[] args){
    captar_numeros();
    }


    public static void captar_numeros(){
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i=0;i<5;i++){
            numeros.add(i);
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño de lista: "+numeros.size());
        numeros.add(8);
        numeros.add(0,-1);
        for (int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño de lista: "+numeros.size());

    }

}