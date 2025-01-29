
package com.mycompany.advinha;
import java.util.Scanner;
public class Jogo {
    Sorte sorte = new Sorte();
    Scanner sc = new Scanner(System.in);
    int escolha;
    int dificuldade;
    int chuteDado;
    int numeroSorteado;
    int tentativas;
    int jogosGanhos;
    public void Comecar(){
        System.out.println("Olá eu sou o dealer, você gostaria de jogar um jogo"
                + " de advinhação de numeros comigo? \n Ele vai funcionar da "
                + "seguinte maneira \n Você tem que tentar advinhar um numéro o"
                + "mais rapido possivel e eu direi se ele é maior ou menor que"
                + "o numero que você chutou. \n Vamos começar? \n 1 para Sim \n"
                + "2 para Não. \n"
                + "3 para ver Estatisticas.");
        setEscolha()
        switch(getEscolha()){
            case 1:
                selecionarDificuldade();
                continuarJogo();
            case 2:
                fimDeJogo();
            case 3:
                estatisticas();
        }
    }
    public void selecionarDificuldade(){
        System.out.println("Ok, hora de selecionar a dificuldade \n 1 para fácil"
                + ". Advinhe um numero de 1 a 10"
                + "\n 2 para normal. Advinhe um numero de 1 a 50."
                + " \n 3 para dificil. Adivinhe um numero de 1 a 100.");
        escolha = sc.nextInt();
        switch(getEscolha()){
            case 1:
                setDificuldade(1);
                break;
            case 2:
                setDificuldade(2);
                break;
            case 3:
                setDificuldade(3);
                break;
            default:
                System.out.println("Temos um engraçadinho aqui não é? Digite "
                + "corretamente.");
                selecionarDificuldade();
                break;
        }
    public void continuarJogo(){
        System.out.println("Que o jogo comece!");
        switch(getDificuldade()){
            case 1:
                setNumeroSorteado(sorte.criarNumeroFacil());
            case 2:
                setNumeroSorteado(sorte.criarNumeroNormal());
            case 3:
                setNumeroSorteado(sorte.criarNumeroDificil());
        }
        ganhouOjogo();
    }
    public void chute(){
        this.tentativas += 1;
        setChuteDado(sc.nextInt());
        verificar(this.chuteDado);
    }
    public boolean verificar(int chuteDado){
        if(chuteDado == numeroSorteado){
            System.out.println("Pera aí.. você acertou!?!?");
            return true;
        }
        else if(chuteDado > numeroSorteado){
            System.out.println("O numero sorteado é menor.");
            return false;
        }
        else{
            System.out.println("O numero sorteado é maior.");
            return false;
        }
    }
    public void fimDejogo(){
        System.out.println("Você vazou antes de terminar"
                + "o joguinho que fiz, que covardia.");
    }
    public void ganhouOJogo(){
        System.out.println("Parece que você ganhou o jogo não é? Tá afim"
                + "de jogar comigo denovo? \n"
                + "1 Para sim. \n"
                + "2 para sair do jogo. \n"
                + "3 para mudar a dificuldade."
                + "4 para ver as estatisticas");
        setEscolha(sc.nextInt());
        switch(this.escolha){
            case 1:
                System.out.println("Muito bem, aqui vamos nós");
                continuarJogo();
                break;
            case 2:
                fimDeJogo();
                break;
            case 3:
                selecionarDificuldade();
            case 4:
                estatisticas();
                break; 
            }
               
        }
    public void estatisticas(){
        System.out.println("Olha só, essas são suas estatiaticas: \n"
                + "Chutes na ultima rodada" + getTentativas()
                + "Ultimo numero que foi sorteado" + getNumeroSorteado() );
        ganhouOJogo();
    }
    
    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public void setChuteDado(int chuteDado) {
        this.chuteDado = chuteDado;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public int getJogosGanhos() {
        return jogosGanhos;
    }

    public int getEscolha() {
        return escolha;
    }

    public int getDificuldade() {
        return dificuldade;
    }
    
}
