package ee_t02_pilas01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Ee_t02_pilas01 pila = new Ee_t02_pilas01();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cadenas que desea verificar");
        int num= sc.nextInt();
        
        for(int i=0; i<num; i++){
            System.out.println("Ingrese una cadena con los agrupadores [] () {}");
            String cadena= sc.next();
            pila.verificar(cadena);
        }
    }
}