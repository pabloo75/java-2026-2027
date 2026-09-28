package U1;

import java.util.Scanner;

public class U1T5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

    /*1,2,3)    for (int i = 0; i <= 100; i++) {
            int numero = i * 5;
            System.out.println(numero);
        }
        int cont = 100;
        while (cont >= 0) {
            System.out.println(cont * 5);
            cont--;
        }
        int contador = 100;
        do {
            System.out.println(contador * 5);
            contador--;
        } while (contador >= 0);
    }
}*/

    /*4)    for (int i = 360; i >= 160; i -= 20) {
            System.out.println(i);
        }
    }
}*/
    /*5)    int oportunidades = 4;
        Random rnd = new Random();
        while (oportunidades != 0) {
            int numero = rnd.nextInt(1000, 9999);
            System.out.println("Dame la combinación");
            int numero2 = kb.nextInt();
            if (numero == numero2) {
                System.out.println("Combinación correcta: ");
            } else {
                oportunidades--;
                System.out.println("Fallaste, te quedan: " + oportunidades + " oportunidades");
            }
        }
    }
}*/

    /* 6)    int numero = kb.nextInt();
        for (int i = 0; i <= 10 ;i++){
            System.out.println( numero + " * " + i + " = " + numero * i);
        }
    }
}*/
        int cont = 0;
        double total = 0;
        System.out.println("Dame números ");
        System.out.println("primer numero: ");
        double numero = kb.nextInt();
        while (numero >= 0) {
            total = total + numero;
            cont++;
            System.out.println("perfecto dame otro");
            numero = kb.nextInt();
        }
        double media = total / cont;
        if (cont == 0) {
            System.out.println("No hay numeros para hacer la media");
        } else {
            System.out.println("La media es: " + media);
        }
    }
}




