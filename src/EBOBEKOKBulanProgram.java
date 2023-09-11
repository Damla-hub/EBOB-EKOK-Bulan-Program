import java.util.Scanner;
public class EBOBEKOKBulanProgram {
    public static void main(String[] args) {
        int sayi=0,sayi1=0,ebob=1;
        boolean isPossibility=true;
        while(isPossibility) {
            Scanner input = new Scanner(System.in);
            System.out.print("1. sayıyı giriniz: ");
            sayi = input.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            sayi1 = input.nextInt();
            if((sayi>0)&&(sayi1>0)){
                if(sayi<=sayi1) {
                    for(int i=sayi; i>=1;i--){
                       if((sayi%i==0 && sayi1%i==0)){
                           ebob=i;
                           break;
                       }
                    }
                }else{
                    for (int i = sayi1; i >= 1; i--) {
                        if ((sayi % i == 0 && sayi1 % i == 0)) {
                            ebob = i;
                            break;
                        }
                    }
                }
                isPossibility=false;

            }else{
                System.out.println("Pozitif sayı giriniz!");
            }
        }
        int ekok=(sayi*sayi1)/ebob;
        System.out.print("EBOB("+sayi+","+sayi1+")="+ebob+"\nEKOK("+sayi+","+sayi1+")="+ekok);
    }
}

