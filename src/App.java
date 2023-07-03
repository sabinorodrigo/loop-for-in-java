import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]?" );
            a[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            soma += a[i];
        }

        System.out.println("Soma = " + soma);
        sc.close();
    }
}
