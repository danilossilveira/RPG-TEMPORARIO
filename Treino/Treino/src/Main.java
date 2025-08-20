import Personagens.Arqueiro;
import Personagens.GolenDeElixir;
import Personagens.Guerreiro;
import Personagens.MegaCavaleiro;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Arqueiro arqueiro = new Arqueiro();
        Guerreiro guerreiro = new Guerreiro();
        MegaCavaleiro mega = new MegaCavaleiro();
        GolenDeElixir golen = new GolenDeElixir();
        arqueiro.setNome("Arqueiro");
        arqueiro.setIdade(30);
        arqueiro.setAtaque(15);
        arqueiro.setVida(50);

        guerreiro.setNome("Guerreiro");
        guerreiro.setIdade(35);
        guerreiro.setVida(70);
        guerreiro.setAtaque(12);

        golen.setNome("Golen");
        golen.setIdade(100);
        golen.setVida(80);
        golen.setAtaque(10);

        mega.setNome("Mega Cavaleiro");
        mega.setIdade(27);
        mega.setVida(75);
        mega.setAtaque(12);


        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao RPG");
        System.out.println("Você tem " + guerreiro.getVida() + " de vida");
        System.out.println("O " + arqueiro.getNome() + " tem " + arqueiro.getVida() + " de vida");
        System.out.println("1- Atacar");
        System.out.println("2- Ver stats");

        int dano;
        int ataque;
        while (arqueiro.getVida() > 0) {
            ataque = scan.nextInt();
            if (ataque == 1) {
                arqueiro.setVida(arqueiro.getVida() - guerreiro.getAtaque());
                System.out.println("ataque feito, o Arqueiro ficou com " + arqueiro.getVida() + " de vida");

            } else if (ataque == 2) {
                System.out.println("Nome: " + guerreiro.getNome());
                System.out.println("Idade: " + guerreiro.getIdade());
                System.out.println("Ataque: " + guerreiro.getAtaque());
                System.out.println("Vida: " + guerreiro.getVida());
            } else {
                System.out.println("Esse comando não existe");
            }
        }
    }
}
