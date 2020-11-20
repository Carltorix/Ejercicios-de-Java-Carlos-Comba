import java.util.Scanner;

public class ejercicio6 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar==1) {
            System.out.println("Ingrese un número: ");
            nro = scan.nextInt();
            System.out.println("El numero ingreado es: " + nro);
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar=scan.nextInt();
        }
        scan.close();
    }
}
