import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diziUzunlugu = scanner.nextInt();
        int dizi[] = new int[diziUzunlugu];
        dizi[0] = 1;
        dizi[1] = 1;
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        for (int i = 2; i < dizi.length; i++) {
            dizi[i] = dizi[i - 1] + dizi[i - 2];
            System.out.println(dizi[i]);

        }


    }
}