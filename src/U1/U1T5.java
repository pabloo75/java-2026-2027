/*package U1;
import java.util.Scanner;
import java.util.Random;

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
    /*5    int oportunidades = 4;
        Random rnd = new Random();
        int numero = rnd.nextInt(0, 9998);
        System.out.println(numero);
        boolean acierto = false
        while (oportunidades != 0 || acierto == true) {
            System.out.println("Dame la combinación");
            int numero2 = kb.nextInt();
            if (numero == numero2) {
                System.out.println("Combinación correcta: ");
                acierto = true;
            } else {
                oportunidades--;
                System.out.println("Fallaste, te quedan: " + oportunidades + " oportunidades");
            }
        }
        System.out.println("El resultado era: " + numero );
    }
}*/

    /* 6)    int numero = kb.nextInt();
        for (int i = 0; i <= 10 ;i++){
            System.out.println( numero + " * " + i + " = " + numero * i);
        }
    }
}*/
    /* 7)    int cont = 0;
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
}*/

    /*8)    System.out.println("Dame 10 números ");
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ". ");
            int numero = kb.nextInt();
            if (numero >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("El número de positivos es " + positivos + " y el de negativos: " + negativos);
    }
}*/

    /* 9)   System.out.println("Dime un número ");
        int numero = kb.nextInt();
        int cont = 0;
        if (numero <= 1) {
            System.out.println("No es primo");
        } else if (numero == 2) {
            System.out.println("Es primo");
        } else if (numero % 2 == 0) {
            System.out.println("No es primo");
        }
        else {
            for (int i = 3; i < numero; i++) {
                if (numero % i == 0) {
                    cont++;
                }
            }
            if (cont != 0) {
                System.out.println("No es primo ");
            } else {
                System.out.println("Es primo");
            }
        }
    }
}*/

    /*10    System.out.println("Dame un numero : ");
        int numero = kb.nextInt();
        int total = numero;
        if (numero < 0) {
            System.out.println("El numero introducido no es valido");
        } else {
            for (int i = 1; i <= 100; i++) {
                total += numero + i;
            }
            System.out.println(total);
        }
    }
}*/

    /* 11    System.out.println("Dame el primer número ");
        int numero = kb.nextInt();
        float mediaImpares = 0;
        int mayor = 0;
        int total = 0;
        int sumaImpares = 0;
        int totalImpares = 0;
        while (numero >= 0) {
            int menor = numero ;
            if (numero % 2 != 0) {
                sumaImpares += numero;
                totalImpares++;
                total ++;
            } else {
                total ++;
            }
            if (numero % 2 == 0) {
                if (mayor < menor) {
                    mayor = numero;
                }
            }
            System.out.println("Dame otro número: ");
            numero = kb.nextInt();
        }
        mediaImpares = sumaImpares / totalImpares ;
        System.out.println("El número total de número es: " + total +  "\nLa media de los impares es: " + mediaImpares + "\nEl mayor de los pares es: " + mayor  );
    }
}*/


    /*12    System.out.println("La lista de los primos entre el 2 y el 100 es:\n ");
        int numero = 100;
        while (numero != 1) {
            int cont = 0;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    cont++;
                }
            }
            if (cont == 0){
                System.out.println(numero +"\n");
            }
            numero--;
        }
    }
}*/

    /* 13    int tope = 10000;
        int totalnumeros = 0;
        int suma = 0;
        double media = 0;
        int numero = 0;
        while (suma <= 10000) {
            System.out.println("Dame un número: ");
            numero = kb.nextInt();
            suma = suma + numero;
            totalnumeros++;
        }
        totalnumeros--;
        suma = suma - numero;
        media = (double) suma / totalnumeros ;
        System.out.println("El total es: " + totalnumeros + "\nLa suma es: " + suma + "\ny la media es: " + media);
    }
}*/

      /*14  int suma = 0;
        int cont = 0;
        System.out.println("Dame un numero");
        int numero = kb.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                cont++;
                suma = suma + i;
            }
        }
        System.out.println("El numero total es:  " + cont + " numeros" + " y la suma es: " + suma);
    }
}*/

    /*15    int dia1 = 0;
        int dia2 = 0;
        do{
            System.out.println("Introduce el primer dia (0-7):\n ");
            dia1 = kb.nextInt();
            System.out.println("Introduce el segundo dia: (0-7):\n");
            dia2 = kb.nextInt();
        }
            while (dia2 < dia1 );
        System.out.println("Introduce la primera hora:\n ");
        int hora1 =kb.nextInt();
        System.out.println("Introduce la segunda hora:\n ");
        int hora2 = kb.nextInt();
        int dias = 0;
        int horas = 0;
        horas = hora2 - hora1;
        dias = dia2 - dia1;
        int total = 0;
        total = dias * 24 + horas;
        System.out.println(total);
    }
}*/
    /* 16   System.out.println("Dame un numero entero positivo: ");
        int numero = kb.nextInt();
        int siguientes = 5;
        int cont = 0;
        while (siguientes != 0){
            for(int i = 2 ; i<numero; i++){
                if(numero % i == 0){
                    cont++;
                }
            }
            if(cont != 0){
                System.out.println("El numero " + numero + " no es primo");
            }
            else {
                System.out.println("El numero " + numero + " es primo");
            }
            cont = 0;
            numero++;
            siguientes--;
        }
    }
}*/

















