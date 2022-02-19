package imparoupar;

import java.util.Scanner;

public class Jogador {
    private int escolha;
    private int jogada;
    private String nome;
    Scanner input = new Scanner(System.in);

    public int getEscolha() {
        return escolha;
    }

    public String getNome() {
        return nome;
    }

    public int getJogada() {
        return jogada;
    }

    public void setEscolha() {
       do{
           System.out.println("Escreva '0' para par e '1' para ímpar.");
           this.escolha = input.nextInt();
       }while (0 != this.escolha && 1 != this.escolha);
    
       if(0 == this.escolha){
        System.out.println(this.nome+" escolheu PAR.");
       } else{
           System.out.println(this.nome+" escolheu ÍMPAR.");
       }
    }
    public void setEscolha(int escolha) {
        
        if (1 == escolha){
            this.escolha = 0;
        } else{
            this.escolha = 1;
        }
                
        if(0 == this.escolha){
            System.out.println(this.nome+" escolheu PAR.");
        } else{
            System.out.println(this.nome+" escolheu ÍMPAR.");
        }
    }
        
    public void setNome() {
        System.out.println("Digite o seu nome.");
        this.nome = input.next();
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogada() {
        System.out.println("Digite um número.");
        this.jogada = input.nextInt();
    }
    
    public void setJogada(int jogada) {
        this.jogada = jogada;
        System.out.println("Digite um número. "+this.jogada);
    }
    
    public void infoGanhador(String nome, int jogada){
        
        if (0 == (this.jogada + jogada) % 2){
            System.out.println("***** PAR *****");
        } else{
            System.out.println("***** ÍMPAR *****");
        }
        
        if (this.escolha == (this.jogada + jogada) % 2){
            System.out.println(this.nome+" Ganhou!");
        } else{
            System.out.println(nome+ " Ganhou!");
        }
    }
}
