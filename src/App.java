import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double mes, yas, tip, nt;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden girin :");
        mes = input.nextDouble();

        System.out.print("Yasinizi girin :");
        yas = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek yon , 2 => Gidis donus) :");
        tip = input.nextDouble();

        double mesafeUcret = 0.10;
        nt = mes * mesafeUcret;
        
        if(yas <= 0 && mes <= 0){
            System.out.println("Hatali veri girdiniz.");
        }else if((tip != 1 && tip != 2)){
            System.out.println("Hatali veri girdiniz.");
        }
        
        if(yas < 12){
            nt *= 0.50;
        }else if(yas > 12 && yas < 24){
            nt *= 0.90;
        }else if(yas > 65){
            nt *= 0.70;
        }


        if(tip == 2){
             nt *= 0.80 * 2;
        }

        System.out.println("Toplam :" + nt);
    }
}
