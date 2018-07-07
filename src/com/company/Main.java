package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner klavetura = new Scanner(System.in);

        double dienosKwh;
        double naktiesKwh;
        double bendrasKwh;
        double dienosEur = 0.13;
        double naktiesEur = 0.08;
        double abonementas = 3;
        double sumaDienos;
        double sumaNakties;
        double sumaBendra;
        System.out.println("Iveskite dienos Kwh: ");
        dienosKwh = klavetura.nextDouble();
        System.out.println("Iveskite nakties Kwh: ");
        naktiesKwh = klavetura.nextDouble();

        bendrasKwh = dienosKwh + naktiesKwh;
        System.out.println("Dienos ir nakties sunaudota "+bendrasKwh+" Kwh.");
        sumaDienos = dienosKwh * dienosEur;
        sumaNakties = naktiesKwh * naktiesEur;
        sumaBendra = sumaDienos + sumaNakties + abonementas;
        System.out.println("Sunaudota diena "+dienosKwh+" Kwh "+sumaDienos+" Eur. ");
        System.out.println("Sunaudota nakti "+naktiesKwh+ " Kwh "+sumaNakties+" Eur. ");
        System.out.println("Suma yra "+sumaBendra+" Eur.");

    }
}
