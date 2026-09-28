package U1;

/*import java.util.Scanner;


public class U1T2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


    /* 1)    int contador = 200;
        while (contador != 0) {
            System.out.println(contador);
            contador--;
        }
    }
}*/
    /*  2)  int numero = kb.nextInt();
        int numero2 = 1;
        while (numero != 0) {
            System.out.println(numero2);
            {
                numero2++;
                numero--;
            }
        }
    }
}*/

    /*   3) int numero = 2;
        int contador = 100;
        System.out.println("mostrando pares entre 1 y 200");
        while (contador != 0) {
            System.out.println(numero);
            numero = numero + 2;
            contador--;
        }
    }
}*/

    /*   4) int numero = kb.nextInt();
        long factorial = 1;
        while (numero != 1) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El resultado es: " + factorial);
    }
}*/
    /*5)    boolean negativo = false ;
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduzca el numero " + i + ": ");
            int numero = kb.nextInt();
            if (numero < 0) {
                 negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Hay negativo");
        } else {
            System.out.println("No hay negativo");
        }
    }
}   */
    /* 6)    int contPositivos = 0;
        int contNegativos = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduzca el numero " + i + ": ");
            int numero = kb.nextInt();
            if (numero < 0) {
                contNegativos++;
            } else {
                contPositivos++;
            }
        }
        System.out.println("Hay: " + contPositivos + " positivos y " + contNegativos + " negativos");
    }
}*/

    /*7)    System.out.println("dame notas");
        int valor = kb.nextInt();
        boolean haydiez = false;
        while (valor != -1) {
            if (valor == 10) {
                haydiez = true;
            }
            valor = kb.nextInt();
        }
            if (haydiez == true) {
                System.out.println("Hay algún 10");
            } else {
                System.out.println("No hay ningún 10");
            }

    }
}*/


    /* 8)   int sumaPares = (100+198) * 50 / 2;
        int sumaImpares = (101+199) * 50 / 2;

        System.out.println("La suma de los pares es: " + sumaPares + " y la de los impares: " + sumaImpares);
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 100; i<200; i++){
            if(i%2 == 0){
                sumaPar = sumaPar + i;
            }
            else{
                sumaImpar = sumaImpar + i;
            }
        }
        System.out.println("La suma de los pares es: " + sumaPar + " y la de los impares: " + sumaImpar);
    }
}*/

     /*9)   Random numero1 = new Random();
        int n = numero1.nextInt(10);
        System.out.println("Dame el primero");
        boolean encontrado = false;
        while (!encontrado) {
            int numero2 = kb.nextInt();
            if (numero2 == n) {
                System.out.println("Acertaste");
                encontrado = true;
            } else if (numero2 > n) {
                System.out.println("Mi numero es menor");
            } else {
                System.out.println("Mi numero es mayor");
            }
        }
    }
}*/







