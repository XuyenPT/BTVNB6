import java.util.Scanner;
public class main {
    Scanner scan = new Scanner(System.in);
    public static void main (String[] agrs){
        int n= scan.nextInt();
        System.out.printf("Nhập n = ");
        int i = 2;
        int dem = 0;
        System.out.printf("Dãy số nguyên tố đầu tiên của %d là:", n);
        while (dem < n){
            if(ktnguyento.nguyento(i)){
                System.out.println(i+ " \t");
                dem++;
            }
            i++;
        }
    }
}
