import java.util.Scanner;
public class TinhGiaiThua {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh giai thua cua: ");
        int x = scanner.nextInt();
        System.out.println("so vua nhap: " +x);
        System.out.println("Giai thua cua " +x+ " la: " +TinhGiaiThua.TingGiaiThuan(x));

    }

    public static int TingGiaiThuan(int n){
        int giai_thua = 1;
        if (n == 0 || n == 1){
            return giai_thua;
        }
        else{
            for(int i = 2 ; i <= n ; i++){
                giai_thua*=i;
            }
            return giai_thua;
        }
    }
}
