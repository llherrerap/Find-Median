import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanio = scanner.nextInt();
        int[] arregloNum = new int[tamanio];
        int medio = (int) Math.ceil(tamanio / 2);
        for (int i = 0; i < tamanio; i++) {
            int num = scanner.nextInt();
            arregloNum[i] = num;
        }

        Arrays.sort(arregloNum);
        System.out.println(arregloNum[medio]);
    }
}