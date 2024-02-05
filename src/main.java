import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingresa tus 6 números (entre 0 y 49):");
        int[] numerosUsuario = new int[6];
        for (int i = 0; i < 6; i++) {
            do {
                numerosUsuario[i] = scanner.nextInt();
                System.out.print("Número " + (i + 1) + ": ");
            }while(numerosUsuario)

            }
        }


        int[] numerosPrimitiva = generarNumerosPrimitiva();


        int aciertos = calcularAciertos(numerosUsuario, numerosPrimitiva);


        System.out.println("Tus números: " + Arrays.toString(numerosUsuario));
        System.out.println("Números de la Primitiva: " + Arrays.toString(numerosPrimitiva));
        System.out.println("Número de aciertos: " + aciertos);

        scanner.close();
    }

    public static int[] generarNumerosPrimitiva() {
        int[] numerosPrimitiva = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numerosPrimitiva[i] = random.nextInt(50);
        }

        return numerosPrimitiva;
    }

    public static int calcularAciertos(int[] numerosUsuario, int[] numerosPrimitiva) {
        int aciertos = 0;

        for (int numeroUsuario : numerosUsuario) {
            for (int numeroPrimitiva : numerosPrimitiva) {
                if (numeroUsuario == numeroPrimitiva) {
                    aciertos++;
                    break;
                }
            }


        }
        return aciertos;
    }
}
