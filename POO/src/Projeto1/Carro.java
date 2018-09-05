/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto1;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class Carro {

    String marca;
    String matricula;
    int combustivel;
    int velocidadeMax;
    int distanciaP;
    int consumo;
    int tempo;

    Random r = new Random();

    @Override
    public String toString() {
        return "Carro{" + "Marca=" + marca
                + ",Matricula=" + matricula
                + ",Combustivel=" + combustivel
                + ",Velocidade =" + velocidadeMax
                + ",Distancia =" + distanciaP
                + ",Tempo=" + tempo
                 + ",consumo=" + consumo
                + " R = " + r + '}';
    }

    public Carro() {
    }

    public Carro(String marca, String matrucula, int combustivel, int velocidadeMax, int tempo, int consumo) {
        this.marca = marca;
        this.matricula = matricula;
        this.combustivel = combustivel;
        this.velocidadeMax = velocidadeMax;
        this.tempo = tempo;
        this.consumo = consumo;
    }

    //MOVE AS POSICOES DOS CARROS
    void mover() {
        velocidadeMax += r.nextDouble() * 10;
    }

    //MODIFICAR OS TEMPOS DOS CARROS
    void tempo() {
        tempo += velocidadeMax + r.nextDouble() * 2;
    }
    void consumo(){
        consumo = consumo-10;
    }

    //GET E SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return matricula;
    }

    public void setPlaca(String placa) {
        this.matricula = placa;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getVelocidade() {
        return velocidadeMax;
    }

    public void setVelocidade(int velocidade) {
        this.velocidadeMax = velocidade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

}
