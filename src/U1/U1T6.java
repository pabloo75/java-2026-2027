/*import java.util.Random;

public class U1T6 {

    // Constantes
    static final int SENSIBILIDAD = 5000;
    static final int LECTURAS_ANOMALAS = 3;
    static final int TMIN = 15, TMAX = 30;
    static final int HMIN = 30, HMAX = 70;
    static final int AUSENCIA = 0, PRESENCIA = 1;

    public static void main(String[] args) throws InterruptedException {
        Random aleatorios = new Random();


        int tMax = Integer.MIN_VALUE, tMin = Integer.MAX_VALUE;
        long tSuma = 0;
        int tAnomalas = 0, tAlarmas = 0;


        int hMax = Integer.MIN_VALUE, hMin = Integer.MAX_VALUE;
        long hSuma = 0;
        int hAnomalas = 0, hAlarmas = 0;


        int pAnomalas = 0, pAlarmas = 0;

        int lecturas = 0;

        while (true) {

            int temperatura = aleatorios.nextInt(10, 41);
            int humedad = aleatorios.nextInt(20, 91);
            int presencia = aleatorios.nextInt(0, 2);
            lecturas++;


            tMax = Math.max(tMax, temperatura);
            tMin = Math.min(tMin, temperatura);
            tSuma += temperatura;

            hMax = Math.max(hMax, humedad);
            hMin = Math.min(hMin, humedad);
            hSuma += humedad;


            boolean alarmaTemp = false, alarmaHum = false, alarmaPres = false;

            if (temperatura < TMIN || temperatura > TMAX) {
                tAnomalas++;
            } else {
                tAnomalas = 0;
            }
            if (tAnomalas >= LECTURAS_ANOMALAS) {
                tAlarmas++;
                tAnomalas = 0;
                alarmaTemp = true;
            }

            if (humedad < HMIN || humedad > HMAX) {
                hAnomalas++;
            } else {
                hAnomalas = 0;
            }
            if (hAnomalas >= LECTURAS_ANOMALAS) {
                hAlarmas++;
                hAnomalas = 0;
                alarmaHum = true;
            }

            if (presencia == PRESENCIA) {
                pAnomalas++;
            } else {
                pAnomalas = 0;
            }
            if (pAnomalas >= LECTURAS_ANOMALAS) {
                pAlarmas++;
                pAnomalas = 0;
                alarmaPres = true;
            }

            // Salida
            System.out.println("\n Sistema de monitoreo de sensores y alarmas");
            System.out.println("\n\tLecturas Actuales");
            System.out.println("\t\t- Temperatura: " + temperatura + "°C");
            System.out.println("\t\t- Humedad: " + humedad + "%");
            System.out.println("\t\t- Presencia: " + (presencia == PRESENCIA ? "SI" : "NO"));

            System.out.println("\n\tEstadísticas");
            System.out.printf("\t\t- Temperatura: Máximo = %d°C, Mínimo = %d°C, Promedio = %.0f°C%n",
                    tMax, tMin, (double) tSuma / lecturas);
            System.out.printf("\t\t- Humedad: Máximo = %d%%, Mínimo = %d%%, Promedio = %.0f%%%n",
                    hMax, hMin, (double) hSuma / lecturas);

            System.out.println("\n\tTotal Alarmas Generadas:");
            System.out.println("\t\t- Temperatura: " + tAlarmas);
            System.out.println("\t\t- Humedad: " + hAlarmas);
            System.out.println("\t\t- Presencia: " + pAlarmas);

            if (alarmaTemp) {
                System.out.println("\n¡Alarma! Sensor de temperatura fuera de rango");
            }
            if (alarmaHum) {
                System.out.println("\n¡Alarma! Sensor de humedad fuera de rango");
            }
            if (alarmaPres) {
                System.out.println("\n¡Alarma! Sensor de presencia activado");
            }

            Thread.sleep(SENSIBILIDAD);
        }
    }
}*/
