import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int sayi,toplam=0;
        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        sayi=oku.nextInt();

        for(int i=1;i<=sayi/2;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }

        if(sayi==toplam){
            System.out.println("Mukkemmel Sayidir.");
        } else {
            System.out.println("Mukkemmel sayi degildir.");
        }
    }
}