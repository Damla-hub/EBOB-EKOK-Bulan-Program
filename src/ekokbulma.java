import java.util.Scanner;
public class ekokbulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,sayi1,ekok=0;
        System.out.print("1. sayıyı giriniz: ");
        sayi=input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi1=input.nextInt();
        for(int i =1;i<=(sayi*sayi1);i++){
            if(i%sayi==0 && i%sayi1==0){
                 ekok=i;
                 break;
            }
        }
        System.out.print(ekok);
    }
}
