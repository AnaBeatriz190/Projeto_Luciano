
package com.mycompany.projetojogo_adivinha;
import com.mycompany.advinha.Sorte;
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
    public void selecionarDificuldade(int escolha){
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
        }
    }
    public void continuarJogo(){
        switch(getDificuldade()){
            case 1:
                setNumeroSorteado(sorte.criarNumeroFacil());
            case 2:
                setNumeroSorteado(sorte.criarNumeroNormal());
            case 3:
                setNumeroSorteado(sorte.criarNumeroDificil());
        }
        
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
