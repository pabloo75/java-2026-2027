/*package U1;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner ;
import java.util.*;
import java.util.Arrays;
public class U1T7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


    /*1,2    int[] numeros = new int[12];
        numeros[0] = 39;
        numeros[1] = -2;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;
        for(int n : numeros){
            System.out.println(n);
        }
        char[] simbolos = new char[10];

        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        for(char c : simbolos){
            System.out.println(c);
        }

    }
}
    Lo que pasa en el primer caso esq muestra 0 (porq es de tipo int/double/float...)
    y en el segundo caso sale con el caracter nulo (tipo char). Tambien podria salir
    false si fuese boolean o null si fuese estructura de datos primitiva */

        /*3    Stack<Integer> pila = new Stack<>();
        System.out.println("Dame 10 números:");
        for (int i= 0; i<10;i++) {
            int numero = kb.nextInt();
            pila.push(numero);
        }
        System.out.println("El resultado es: ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
    /* 3   System.out.println("Dame 10 números: ");
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length ; i++){
            System.out.println("Número " + (i +1) + ": ");
            numeros [i] = kb.nextInt();
        }
        for(int i = numeros.length -1; i >= 0 ; i-- ){
            System.out.println(numeros[i]);
        }

    }
}*/

    /*4    System.out.println("Dame 20 numeros: ");
        int[] numeros = new int[20];
        int positivos = 0, negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = kb.nextInt();
            if (numeros[i] < 0) {
                negativos = negativos + numeros[i];
            } else {
                positivos = positivos + numeros[i];
            }
        }
        System.out.println("positivos: " + positivos + "\nNegativos: " + negativos);
    }
}*/

    /*5    String[] diasSemana = new String[7];
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";
        System.out.println("Dame un número del 1 al 7\n");
        int numero = kb.nextInt();
        System.out.println("El día de la semana es: " + diasSemana[numero - 1]);
    }
}*/
    /*6    System.out.println("Dame 10 numeros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            int numero = kb.nextInt();
            numeros[i] = numero;
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor + "\nEl menor es: " + menor);
    }
}*/
    /*7    System.out.println("Dame dos valores\n");
        int m = kb.nextInt();
        int n = kb.nextInt();
        int[] numeros = new int[n];
        System.out.println("El array es: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
            System.out.println(numeros[i]);
        }
    }
}*/
    /*8    System.out.println("Dame dos numeros");
        int p = kb.nextInt();
        int q = kb.nextInt();
        int cont = 0;
        int[] numeros = new int[q - p -1];
        for (int i = p + 1; i != q; i++) {
            numeros[cont] = i;
            System.out.println(numeros[cont]);
            cont++;
        }
    }
}*/

    /*9    int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];
        Random rnd = new Random();
        for(int i = 0 ; i < numeros.length;i++){
            numeros[i]= rnd.nextInt(101);
        }
        for(int i = 0; i < numeros.length;i++){
            cuadrados[i] = numeros[i] * numeros[i];
            cubos[i] = numeros[i] * numeros[i] * numeros[i];
        }
        System.out.println("numeros cuadrados cubos" );
        for(int i= 0; i< numeros.length;i++){
            System.out.println(numeros[i] + "\t" +  cuadrados[i] + "\t" + cubos[i]);
        }
    }
}*/

    /*10    int[] numeros1 = new int[100];
        int[] numeros2 = new int[100];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = i + 1;
        }
        for (int i = 0; i < numeros1.length; i++) {
            numeros2[i] = numeros1[numeros1.length - 1 - i];
        }
        System.out.println("Array 1: " + Arrays.toString(numeros1));
        System.out.println("Array 2: " + Arrays.toString(numeros2));
    }
}*/
    /*11    int[] numeros = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(101);
            System.out.println(numeros[i]);
        }
        System.out.println("Dame dos numeros entre 0 y 20");
        int numero1 = kb.nextInt();
        int numero2 = kb.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero1) {
                numeros[i] = numero2;
                System.out.println(" \" " + numeros[i] + " \" " );
            }
            else{
                System.out.println(numeros[i]);
            }
        }
    }
}*/
    /*11    String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] temperaturas = new int[12];

        System.out.print("Introduce el año: ");
        int año = kb.nextInt();
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Temperatura media de " + meses[i] + ": ");
            temperaturas[i] = kb.nextInt();
        }
        System.out.println("\nTemperaturas medias del año " + año);
        System.out.println("-----------------------------------");

        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-11s |", meses[i]);

            if (temperaturas[i] >= 0) {
                for (int j = 0; j < temperaturas[i]; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < Math.abs(temperaturas[i]); j++) {
                    System.out.print("-");
                }
            }

            System.out.println(" " + temperaturas[i] + "º");
        }
    }
}*/


    /*    System.out.println("Dame el tamaño del array: ");
        int tamaño = kb.nextInt();
        System.out.println("En que numero quieres empezar: ");
        int numero = kb.nextInt();
        System.out.println("Dame el incremento: ");
        int incremento = kb.nextInt();
        int[] numeros = new int[tamaño];
        for ( int i = 0; i < numeros.length; i++){

        }*/






















