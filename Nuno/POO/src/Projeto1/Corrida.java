package Projeto1;

import java.io.IOException;
import java.util.Random;

public class Corrida {

    public static void main(String[] args) {
        Carro[] carros = new Carro[3];       

        carros = initCarros(carros);

        Random r = new Random();

        for (int i = 1; i < 3; i++) {

            for (int x = 0; x < 3; x++) {
                double a = r.nextDouble() * 10;
                System.out.println(a);
                carros[x].tempo += a * 2;
            }

            System.out.println("Etapa " + i + " Da Corrida ");

            for (int x = 0; x < 3; x++) {
                System.out.println(carros[x]);
            }

            System.out.println("*****************************");

            if (i == 1) {
                getWinnerFase1(carros);
            }

        }

    }

    public static void getWinnerFase1(Carro[] carros) {

        Carro winner = new Carro();
        winner.setTempo(99999);

        for (int x = 0; x < 3; x++) {
            if (carros[x].getTempo() < winner.getTempo()) {
                winner = carros[x];
            }
        }

        System.out.println("Vencedor: " + winner);
    }

    public static Carro[] initCarros(Carro[] carros) throws IOException {

        for (int i = 0; i < 3; i++) {
            byte[] d = null;
            System.in.read(d);
            carros[i] = new Carro();
        }

        return carros;
    }

}
