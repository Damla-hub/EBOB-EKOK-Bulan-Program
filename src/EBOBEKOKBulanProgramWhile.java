import java.util.Scanner;
public class EBOBEKOKBulanProgramWhile {
    public static void main(String[] args) {
        int sayi,sayi1,ebob=0;
        boolean isPossibility=true;
        Scanner input=new Scanner(System.in) ;
        while(isPossibility){
            System.out.print("1. Sayıyı giriniz:");
            sayi=input.nextInt();
            System.out.print("2. Sayıyı giriniz:");
            sayi1=input.nextInt();
            if((sayi>0 && sayi1>0)){

                if(sayi>=sayi1){
                    int i=sayi1;
                    while(i>=1){
                        if(sayi%i==0 && sayi1%i==0){
                            ebob=i;
                            break;
                        }
                        i--;
                    }
                }else{
                    int i=sayi;
                    while(i>=1){
                        if(sayi%i==0 && sayi1%i==0){
                            ebob=i;
                            break;
                        }
                        i--;
                    }
                }
                isPossibility=false;
                int ekok=(sayi*sayi1)/ebob;
                System.out.print("EBOB("+sayi+","+sayi1+")="+ebob+"\nEKOK("+sayi+","+sayi1+")="+ekok);

            }else{
                System.out.println("Pozitif sayı giriniz!");
            }
        }
    }
}
