import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //girilen sayı armstron sayı mı(armstrong sayı:0,1,2,3,4,5,6,7,8,9,153,,370,371,407,...)
        /*
        System.out.print("Sayı gir: ");
        int sayi = input.nextInt(), basamak = 1;
        int basamaktakiSayi = 0, altBasamaktakiSayi, toplam = 0;
        //basamak sayısı bulma
        for (int i = 0; Math.pow(10, i) <= sayi; ++i) {
            basamak = i + 1;
        }
        System.out.println("Basamak sayısı: "+basamak);
        //basmaktaki sayıyı bulma
        for (int i = 1; i <= basamak; i++) {
            altBasamaktakiSayi = basamaktakiSayi;
            basamaktakiSayi = (sayi % (int) Math.pow(10, i) - altBasamaktakiSayi) / (int) Math.pow(10, i - 1);
            System.out.print(i + ". basamak: "+basamaktakiSayi+", ");
            toplam += (int) Math.pow(basamaktakiSayi, basamak);
        }
        //armstrong sayı bulma
        System.out.println("\nToplam:"+toplam);
        if (sayi==toplam){
            System.out.println(sayi+" sayısı armstrong sayıdır");
        }else {
            System.out.println(sayi+" sayısı armstrong sayı değildir");
        }
        */
        //2.yöntem
        //2056/10=205
        //205/10=20
        //20/10=2
        //2/10=0
        //2056%10=6
        //205%10=5
        //20%10=0
        //2%10=2
        System.out.print("Sayı gir: ");
        int num, tempNum, basNum = 0, basValue, basPow, total = 0;
        num = input.nextInt();
        tempNum = num;
        while (tempNum != 0) {
            tempNum /= 10;
            basNum++;
        }
        //System.out.println(basNum);
        tempNum = num;
        while (tempNum != 0) {
            basValue = tempNum % 10;
            tempNum /= 10;
            //System.out.println(basValue);
            basPow=1;
            for (int kuvvet = 1; kuvvet <= basNum; kuvvet++) {
                basPow *= basValue;
            }
            total += basPow;
        }
        //System.out.println(total);
        if (total==num){
            System.out.println(num+" sayısı armstrong sayıdır");
        }else {
            System.out.println(num+" sayısı armstrong sayı değildir");
        }
    }
}
