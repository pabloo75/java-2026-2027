/*package U1;

public class U1T1 {
    public static void main(String[] args) {
     /*   Scanner kb = new Scanner(System.in);
     /* 7  int edad = kb.nextInt();
        if ( edad >= 18){
            System.out.println("mayor de edad");
        }
        else {
            System.out.println("menor de edad");
        }
    }
}*/
    /*  8  int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        if (n1 > n2) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n1) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("Ambos son iguales");
        }
    }
}*/

    /*   9 int n1 = kb.nextInt();
        if (n1 < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("numero positivo");
        }
    }
}*/

    /* 10   int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        if (n1 < n2) {
            System.out.println(  n1 + " " + n2);
        } else {
            System.out.println(  n2 + " " + n1);
        }
    }
}*/
    /*  11  int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        if (n1 > n2) {
            System.out.println("El mayor es " + n1);
        } else if (n1 < n2) {
            System.out.println("El mayor es " + n2);
        } else {
            System.out.println("Ambos son iguales");
        }
    }
}*/

        /*  12 int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int n3 = kb.nextInt();
        int mayor;
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else  {
            mayor = n3;
        }
        System.out.println("el mayor es: " + mayor);
    }
}*/

 /* 13  int cont = 100;
    int impar = 1 ;
    while (cont != 0){
        System.out.println( impar );
        impar = impar + 2;
        cont = cont -1 ;
    }
    }
    }*/

    /*    int cont = 100;
        int n = 100 ;
        while (n != 0){
            System.out.println( 2*n -1 );
            n = n-1;
        }
    }
}*/

    /* 14   int suma = 0;
        int producto = 1;

        for (int i = 1; i < 21; i++) {
            System.out.println("intoduzca el numero " + i + ": ");
            int numero = kb.nextInt();
            if (numero % 2 == 0) {
                suma = suma + numero;
            } else {
                producto = producto * numero;
            }
        }
        System.out.println("El resultado de la suma es: " + suma );
        System.out.println("El resultado del prducto es: " + producto);
    }
}*/


     /* 15   System.out.println("Escribe horas minutos y segundos: ");
        int hora = kb.nextInt();
        int minutos = kb.nextInt();
        int segundos = kb.nextInt();
        segundos = segundos + 1;
        if (segundos == 60) {
            segundos = 0;
            minutos = minutos + 1;
            if (minutos == 60) {
                minutos = 0;
                hora = hora + 1;
            }
        }
        System.out.println("Transcurrido un segundo la hora es: " + hora + " horas " + minutos + " minutos " + segundos + " segundos ");
    }
}   */

    /* 16   int calificacion = kb.nextInt();
        if (calificacion < 3) {
            System.out.println("Muy deficiente");
        } else if (calificacion < 5) {
            System.out.println("Insuficiente");
        } else if (calificacion < 6) {
            System.out.println("suficiente");
        } else if (calificacion < 7) {
            System.out.println("bien");
        } else if (calificacion < 9) {
            System.out.println("notable");
        } else {
            System.out.println("sobresaliente");
        }
    }
    }
    }
     */

        /*17
        System.out.println("Nombre: ");
        String nombre = kb.next();
        System.out.println("horas: ");
        int horas = kb.nextInt();
        System.out.println("tarifa: ");
        int tarifa = kb.nextInt();
        double salarioBruto = 0;
        if (horas <= 35) {
            salarioBruto = horas * tarifa;
        } else {
            int horasExtra = horas - 35;
            double dineroExtra = horasExtra * tarifa * 1.5;
            salarioBruto = (35 * tarifa) + (horasExtra * tarifa * 1.5);
        }
        double impuestos = 0;
        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + (salarioBruto - 900) * 0.45;
        }


        double salarioNeto = salarioBruto - impuestos;
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario Neto: " + salarioNeto);
        System.out.println("Impuestos: " + impuestos);

    }
}*/




