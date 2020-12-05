package home.ejercicio2;

public class ejercicio2 {
    public static void main (String [] args){
        multioperacion(captar2());
    }


    public static int[] captar2(){
        
        System.out.println("Ingrese dos numeros: ");
        var nro1 = Integer.parseInt(System.console().readLine());
        var nro2 = Integer.parseInt(System.console().readLine());
        int[] numeros ={nro1,nro2};
        return numeros;
    }
    public static void multioperacion(int[] numeros){
        String [] signo = {"+","-","*","/","%"};
        int[] oper = {numeros[0] + numeros[1],numeros[0] - numeros[1],numeros[0] * numeros[1],numeros[0] / numeros[1],numeros[0] % numeros[1]};
        for (var i=0; i<oper.length;i++){
            System.out.println(numeros[0]+" "+ signo[i] +" "+ numeros[1]+" = "+oper[i]);
        }
        
    }

}