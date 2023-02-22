import java.util.Scanner;

public class Cau3NhapDoDaiMangVaInRaBangForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int a = input.nextInt();
        int[] arrayNumber = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Nhap so" + i);
            arrayNumber[i] = input.nextInt();
        }
        for (int an:arrayNumber
        ) {
            System.out.println(an);

        }

        //for(int i=0; i< a; i++){
        //System.out.println(arrayNumber[i]);

        //}

    }
}
