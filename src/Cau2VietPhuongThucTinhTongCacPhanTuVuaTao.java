import java.util.Scanner;

public class Cau2VietPhuongThucTinhTongCacPhanTuVuaTao {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int a = input.nextInt();
        int[] arrayNumber = new int[a];
        int sum=a;
        for (int i=0; i< a; i++){
            System.out.println("Nhap so" + i);
            arrayNumber[i]= input.nextInt();
        }

        for(int i=0; i< a; i++){
            System.out.println(arrayNumber[i]);

        }
        System.out.println(sum=sum+sum);
    }
}
