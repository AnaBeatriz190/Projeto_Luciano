package com.mycompany.projetojogo_adivinha;
import java.util.Random;

public class Sorte {
    private int numeroSecreto;
    private Random aleatorio = new Random();
    public int criarNumeroFacil(){
        this.numeroSecreto = aleatorio.nextInt(10);
        return this.numeroSecreto;
    }
    public int criarNumeroNormal(){
        this.numeroSecreto = aleatorio.nextInt(50);
        return this.numeroSecreto;
    }
    public int criarNumeroDificil(){
        this.numeroSecreto = aleatorio.nextInt(100);
        return this.numeroSecreto;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
    
}
