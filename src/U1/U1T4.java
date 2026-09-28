package U1;/*
import java.util.Scanner ;
public class U1T4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


    /* 1)   System.out.println("Escribe un numero ");
        int numero = kb.nextInt();
        if (numero < 0){
            System.out.println(numero);
        }
    }
}*/

    /*  2)  System.out.println("Dame dos numeros ");
        int numero1 = kb.nextInt();
        int numero2 = kb.nextInt();
        if (numero1 < numero2) {
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
    }
}*/

    /* 3)    System.out.println("Dame un numero ");
        int numero = kb.nextInt();
        if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }
    }
} */

    /*4)    System.out.println("Dame un año ");
        int numero = kb.nextInt();
        if (numero % 4 == 0) {
            if (numero % 100 == 0) {
                if (numero % 400 == 0) {
                    System.out.println("año bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Año bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }
    }
}*/

    /* 5)    System.out.println("Dame un numero ");
        int numero = kb.nextInt();
        if (numero < 0) {
            System.out.println("Numero negativo");
        } else if (numero > 0){
            System.out.println("Numero positivo");
        }
        else {
            System.out.println("El numero es 0");
        }
    }
}*/


    /*6)    System.out.println("Dame un numeo entre 0 y 12:");
        int mes = kb.nextInt();
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("El mes es: " + nombresMeses[mes - 1]);


        int mes1 = kb.nextInt();
        if (mes1 == 12){
            System.out.println("El mes es diciembre");
        }
        else if (mes1 == 11){
            System.out.println("El mes es Noviembre");
        }
        else if (mes1 == 10){
            System.out.println("El mes es Octubre");
        }
        else if (mes1 == 9){
            System.out.println("El mes es Septiembre");
        }
        else if (mes1 == 8){
            System.out.println("El mes es Agosto");
        }
        else if (mes1 == 7){
            System.out.println("El mes es Julio");
        }
        else if (mes1 == 6){
            System.out.println("El mes es Junio");
        }
        else if (mes1 == 5){
            System.out.println("El mes es Mayo");
        }
        else if (mes1 == 4){
            System.out.println("El mes es Abril");
        }
        else if (mes1 == 3){
            System.out.println("El mes es Marzo ");
        }
        else if (mes1 == 2){
            System.out.println("El mes es Febrero");
        }
        else if (mes1 == 1){
            System.out.println("El mes es Enero ");
        }
    }
}*/

    /*8)    int producto = 1;
        int impar = 1;
        for (int i = 10; i != 0; i--) {
            producto = producto * impar;
            impar = impar + 2;
        }
        System.out.println("El resultado es: " + producto);
    }
}*/
    /*9    System.out.println("dime cuanta gente quieres medir ");
        int cantidad = kb.nextInt();
        int contador = cantidad;
        int suma = 0;
        while (contador != 0) {
            System.out.println("mete la altura en cm");
            int altura = kb.nextInt();
            suma = suma + altura;
            contador--;
        }
        int media = suma / cantidad;
        System.out.println("La media es: " + media);
    }
}*/

    /*10    System.out.println("Dime cuantos multiplos quieres");
        int numero = kb.nextInt();
        int cantidad = 1;
        numero++;

        do {
            int ocho = 8;
            System.out.print(ocho * cantidad );
            if (cantidad != numero -1){
                System.out.print(" - ");
            }
            cantidad++;
        }
        while (cantidad != numero);
    }
}*/

    /*11    System.out.println("dime un numero ");
        int numero = kb.nextInt();
        System.out.println("A que lo elevas? ");
        int numero2 = kb.nextInt();
        int resultado = 1;
        for (int i = numero; numero2 != 0; numero2--) {
            resultado = resultado * numero;
        }
        System.out.println("El resultado es: " + resultado);
    }
}*/

    /*12    System.out.println("Dime un numero ");
        int numero = kb.nextInt();
        for (int i = numero; i != 0; i--) {
            System.out.println("*");
        }
    }
}*/


    /*13    int filas, columnas;
        do {
            System.out.println("Dame un valor para las filas entre 2 y 10: ");
            filas = kb.nextInt();
            System.out.println("Dame un valor para las columnas entre 2 y 10: ");
            columnas = kb.nextInt();
        } while (filas < 2 || filas > 10 || columnas < 2 || columnas > 10);
        for (int i = filas; i != 0; i--) {
            for (int j = columnas; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

/*14        int filas;
        do {
            System.out.println("Dame un numero de filas entre 4 y 10:");
            filas = kb.nextInt();
        } while (filas < 4 || filas > 10);
        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < filas - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int t = 0; t < 2; t++) {
            for (int j = 0; j < filas - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("* * *");
        }
    }
}*/

