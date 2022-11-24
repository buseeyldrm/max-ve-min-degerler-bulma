import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz? :");
        int sayi= klavye.nextInt();
        int min=0;
        int max=0;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(i+".Sayıyı Gir: ");
            int a= klavye.nextInt();

        if (i==1){
            max=a;
            min=a;

        }
        else {
            if (a>max){
                max=a;

            } else if (a<min) {
                min=a;

            }
        }



        }
        System.out.println("En Buyuk Sayı: " +max);
        System.out.println("En Kucuk Sayı: " +min);
    }
}