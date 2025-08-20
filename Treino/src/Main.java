import Personagens.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        Arqueiro arqueiro = new Arqueiro();
        Pirotecnica pirotecnica = new Pirotecnica();
        MegaCavaleiro mega = new MegaCavaleiro();
        GolenDeElixir golen = new GolenDeElixir();
        PersoEscolhido escolhido = new PersoEscolhido();
        arqueiro.setNome("Arqueiro magico");
        arqueiro.setIdade(30);
        arqueiro.setAtaque(15);
        arqueiro.setVida(50);

        pirotecnica.setNome("Pirotecnica");
        pirotecnica.setIdade(35);
        pirotecnica.setVida(70);
        pirotecnica.setAtaque(12);

        golen.setNome("Golen");
        golen.setIdade(100);
        golen.setVida(80);
        golen.setAtaque(10);

        mega.setNome("Mega Cavaleiro");
        mega.setIdade(27);
        mega.setVida(75);
        mega.setAtaque(12);

        escolhido.setNome("1");
        escolhido.setIdade(1);
        escolhido.setVida(1);
        escolhido.setAtaque(1);


        System.out.println("Bem vindo ao RPG");
        System.out.println("ESCOLHA SUA CLASSE");
        System.out.println("1- "+ arqueiro.getNome());
        System.out.println("2- "+ pirotecnica.getNome());
        System.out.println("3- "+ mega.getNome());
        System.out.println("4- "+ golen.getNome());
        int escolha = scan.nextInt();





        if (escolha == 1) {
            escolhido.setNome(arqueiro.getNome());
            escolhido.setIdade(arqueiro.getIdade());
            escolhido.setAtaque(arqueiro.getAtaque());
            escolhido.setVida(arqueiro.getVida());
            System.out.println("Você escolheu o " + arqueiro.getNome());
            System.out.println("1- Atacar");
            System.out.println("2- Ver stats");
        } else if (escolha == 2) {
            escolhido.setNome(pirotecnica.getNome());
            escolhido.setIdade(pirotecnica.getIdade());
            escolhido.setAtaque(pirotecnica.getAtaque());
            escolhido.setVida(pirotecnica.getVida());
            System.out.println("Você escolheu a " + pirotecnica.getNome());
            System.out.println("1- Atacar");
            System.out.println("2- Ver stats");
        } else if (escolha == 3) {
            escolhido.setNome(mega.getNome());
            escolhido.setIdade(mega.getIdade());
            escolhido.setAtaque(mega.getAtaque());
            escolhido.setVida(mega.getVida());
            System.out.println("Você escolheu o " + mega.getNome());
            System.out.println("1- Atacar");
            System.out.println("2- Ver stats");
        } else if (escolha == 4) {
            escolhido.setNome(golen.getNome());
            escolhido.setIdade(golen.getIdade());
            escolhido.setAtaque(golen.getAtaque());
            escolhido.setVida(golen.getVida());
            System.out.println("Você escolheu o " + golen.getNome());
            System.out.println("1- Atacar");
            System.out.println("2- Ver stats");
        } else {
            System.out.println("essa classe não existe");
        }

         int acao;
        while (mega.getVida() > 0) {
            acao = scan.nextInt();
            if (acao == 1) {
                mega.setVida(mega.getVida() - escolhido.getAtaque());
                System.out.println("ataque feito, o inimigo " + mega.getNome() + " ficou com " + mega.getVida() + " de vida");
                if (mega.getVida()<0){
                    System.out.println("Você ganhou do inimigo");
                    break;
                }

            } else if (acao == 2) {
                System.out.println("Nome: " + escolhido.getNome());
                System.out.println("Idade: " + escolhido.getIdade());
                System.out.println("Ataque: " + escolhido.getAtaque());
                System.out.println("Vida: " + escolhido.getVida());
            }
            else {
                System.out.println("Esse comando não existe");
            }
        }
    }
}