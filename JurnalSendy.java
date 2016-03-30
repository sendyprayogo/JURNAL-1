package jurnal.sendy;

import java.util.Scanner;

public class JurnalSendy {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        System.out.print("Masukan angka : ");
        int angka = new Scanner(System.in).nextInt();
        System.out.println("\n\nAngka fibbonaci hanya sampai " + angka +" numbers : ");
        for(i=1; i<=angka; i++){
            System.out.print(pibo(i) +" ");
        }
        int yui=i+i;
        System.out.println("\n"+yui);
    }
    public static int pibo(int angka){
        if(angka == 1 || angka == 2){
            return 1;
        }
 
        return pibo(angka-1) + pibo(angka -2);
    }
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
    }     
}
