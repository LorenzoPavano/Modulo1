import java.util.Arrays;
import java.util.Scanner;

public class MinimoMassimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        System.out.println(Arrays.toString(values));
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {

        String[] sSplit= s.split(",");
        int[] values = new int[sSplit.length];
        for (int i = 0; i < sSplit.length; i++) {
            values[i] = Integer.parseInt(sSplit[i]);
        }
        return values;
    }

    static void computeMinAndMax(int[] values) {
        //inserite qui il vostro codice
        int maxValue= Integer.MAX_VALUE;
        int minValue= Integer.MIN_VALUE;
        int minimo= maxValue;
        int massimo = minValue;

        for (int i = 0; i < values.length; i++) {
            if(values[i] < minimo)
               minimo = values[i];
        }

        for (int i = 0; i < values.length; i++) {
            if(values[i] > massimo)
                massimo = values[i];
        }
        System.out.println(minimo + "," + massimo);
    }
}


