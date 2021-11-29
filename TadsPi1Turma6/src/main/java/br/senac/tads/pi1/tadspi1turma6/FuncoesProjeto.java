/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.tadspi1turma6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class FuncoesProjeto {

    public static int cenario() {

        int min = 1;
        int max = 3;

        Random input = new Random();

        int value = input.nextInt(max + min) + min;

        return value;

    }

    public static int puzzleCemiterio() {

        int x = 4;
        int y = 10;
        int z = 13;
        int w = 0;

        w = x + y + z;

        return w;

    }

    static boolean PuzzelIgreja() {
        //ac = ações
        int n1, ac;
        ac = 4;

        System.out.println("o monstro começa a se aproximar para onde voce vai?");
        System.out.println("(1)esquerda");
        System.out.println("(2)direita");
        n1 = Entrada();
        ac = ac - 1;
        switch (n1) {
            case 1:
                System.out.println("voce ve uma serie de janelas quebradas e um pôsso mais ao fundo");
                System.out.println("(1)janelas (2)pôsso (3)fundo da igreja");
                n1 = Entrada();
                while (n1 != 3) {
                    if (n1 == 1) {
                        JanelasIgreja();
                        ac = ac - 2;
                        if (ac <= 0) {
                            return false;
                        }
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        PossoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        };
                        n1 = Entrada();
                    }

                }
                if (n1 == 3) {
                    FundoDaIgreja();
                    ac = ac - 1;
                    if (ac <= 0) {
                        return false;
                    }
                }
                break;

            case 2:
                System.out.println("voce ve uma serie de janelas quebradas e um pôsso mais ao fundo");
                System.out.println("(1)janelas (2)alsapão (3)fundo da igreja");
                n1 = Entrada();
                while (n1 != 3) {
                    if (n1 == 1) {
                        JanelasIgreja();
                        ac = ac - 2;
                        if (ac <= 0) {
                            return false;
                        }
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        AlsapaoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        };
                        n1 = Entrada();
                    }

                }
                if (n1 == 3) {
                    FundoDaIgreja();
                    ac = ac - 1;
                    if (ac <= 0) {
                        return false;
                    }
                }
                break;
        }
        return true;
    }
    static void posto(){
        System.out.println("Assim que voce passa pela porta percebe que nao ha nada naquele local");
        
    }

    static void JanelasIgreja() {
        System.out.println("voce tenta atravessar as janelas mas se corta e cai no processo");
    }

    static void PossoDaIgreja() {
        System.out.println("voce olha o posso da igreja porem infelizmente não tem nada ali q possa te ajudar");
    }

    static void AlsapaoDaIgreja() {
        System.out.println("o alsapão esta trancado para o seu azar");
    }

    static void FundoDaIgreja() {
        System.out.println("voce corre ate o fundo da igreja e ve uma porta aberta para entrar na igreja");
    }

    //pequeno puzzle para entrar em uma porta
    public static int PuzzlePorta() {

        int min = 1;
        int max = 9;

        Random input = new Random();

        int value = input.nextInt(max + min) + min;

        return value;

    }

    static int Entrada() {
        int n1;
        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        return n1;
    }

    static int PlayerAC(int n1) {
        //PlayerAC = Ações do player
        //ope = onde o player esta //opi = oque o player investigou
        //os

        int n2, ope, opi, os;
        boolean lanterna = false;

        ope = n1;

        System.out.println("---ações---");
        System.out.println("(1)andar");
        System.out.println("(2)investigar");
        System.out.println("(3)inventario");
        System.out.println("oque voce ira fazer?:");
        n2 = Entrada();
        if (n2 <= 0 || n2 >= 5) {
            do {
                System.out.println("resposta invalida");
                System.out.println("responda novamente");
                n2 = Entrada();
            } while (n2 <= 0 || n2 >= 4);
        }

        switch (n2) {
            case 1:
                ope = POI(n1);
                break;

            case 2:
                opi = OSPV(n1);
                if (opi == 1) {
                    MesaMarcada();
                }

        }

        return ope;
    }

    static int POI(int n1) {
        //poi = para onde ir
        //ops = onde player esta

        int ops = 0;

        if (n1 == 1) {
            System.out.println("voce anda ate a velha cabana e entra");
            ops = 2;
        }

        return ops;
    }

    static int PlayerL(int n1) {
        //playerl = luta do player
        int ac;
        System.out.println("voce se depara com essa criatura oque voce faz?");
        System.out.println("(1)bloquear");
        System.out.println("(2)esquivar");
        System.out.println("(3)contra atacar");
        ac = Entrada();
        if (ac <= 0 || ac >= 4) {
            do {
                System.out.println("numero invalido");
                ac = Entrada();
            } while (ac <= 0 || ac >= 4);
        }
        if (ac == 1) {
            System.out.println("voce bloquea");
        }
        if (ac == 2) {
            System.out.println("voce esquiva");
        }
        if (ac == 3) {
            System.out.println("voce ve uma brecha e ataca ele");
        }

        return ac;
    }

    static int OSPV(int n1) {
        //OSPV = oque player esta vendo
        //opp = oque player investigou//mesa = 1

        int opi = 0;

        if (n1 == 2) {
            opi = 1;
        }

        return opi;
    }

    static boolean Lanterna() {
        System.out.println("voce usa a lanterna");
        return true;
    }

    static void MesaMarcada() {
        System.out.println("voces ve uma mesa e emcima dela o numero 9 marcado");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c1 = 0;
        while (c1 != 4 && c1 != 4) {
            System.out.println("=============================================================================");
            System.out.println("         _  _ _      _   _                          _                  \n"
                    + "        | \\| (_)__ _| |_| |_ _ __  __ _ _ _ ___    | |   ___  ___ _ __ \n"
                    + "        | .` | / _` | ' \\  _| '  \\/ _` | '_/ -_)   | |__/ _ \\/ _ \\ '_ \\\n"
                    + "        |_|\\_|_\\__, |_||_\\__|_|_|_\\__,_|_| \\___|   |____\\___/\\___/ .__/\n"
                    + "               |___/                                             |_|   \n"
                    + "                     _____ _             ___                \n"
                    + "                    |_   _| |_  ___     / __|__ _ _ __  ___ \n"
                    + "                      | | | ' \\/ -_)   | (_ / _` | '  \\/ -_)\n"
                    + "                      |_| |_||_\\___|    \\___\\__,_|_|_|_\\___| ");
            System.out.println("==============================================================================");
            System.out.println("                     *--Bem vindos ao menu principal--* \nSelecione uma das opções a seguir.");
            System.out.println("[1] Iniciar jogo");
            System.out.println("[2] Créditos");
            System.out.println("[3] Instruções");
            System.out.println("[4] Sair do jogo");
            c1 = input.nextInt();

            switch (c1) {
                case 1:
                    System.out.println("Iniciando o jogo");
                    System.out.println("==========================================================================================================================================================");
                    //introduçao a o enredo
                    System.out.println("Inicio do Jogo \n\n"
                            + " ...Acordo de um sono profundo em meu carro com uma leve dor na lateral da minha cabeça, tento identificar o local que estou,mas está escuro demais para ver qualquer coisa.\n "
                            + "A dor é quase como se eu tivesse sido atingido por algo, ainda não sei ao certo o que pode ter acontecido, mas com certeza poderia ter sido pior, afinal,ainda estou consciente.\n "
                            + "Olho em minha volta e não vejo nenhum sinal de vida, tão pouco a estrada a qual me levou até onde estou agora.\n"
                            + " Ao reparar no capô do meu carro, noto que está saindo fumaça e, apesar dos pesares, isso não me preocupa,  a única coisa que consigo pensar é em como e porque eu fui parar ali.\n"
                            + " Em minha volta há apenas pinheiros e em frente ao meu carro há uma construção abandonada.\n "
                            + "Resolvo descer do carro e explorar o local afim de encontrar algo que possa me ajudar a entender o que aconteceu até então.\n"
                            + " Mas antes, preciso pegar meus cigarros e meu canivete no porta luvas... e, claro, não posso esquecer do meu isqueiro.\n"
                            + " Desço do carro e sigo caminhando em direção a construção abandonada.\n");
                    System.out.println("==========================================================================================================================");
                    int b,
                     c,
                     a,
                     d,
                     e,
                     f;
                    boolean g;

                    b = cenario();

                    switch (b) {//puzzle posto abandonado
                        case 1:
                            System.out.println(" Ao me aproximar até o local me deparo com oque parece ser um velho posto abandonado,\n "
                                    + "sem muitas opçoes resolvo entrar no local, entao percebo que o a uma velha porta em sua lateral, achei aquilo um pouco estranho entao resolvi ir ate la,\n"
                                    + " quando me aproximo percebo que a um velho painel com um codigo bloqueando a porta, talvez eu posso decifrar esse codigo !");
                            int Pp1,
                             Pp2,
                             Pp3;
                            int Pp4; // puzzle porta 1,2,3

                            System.out.println("==========================================================================================================================");
                            System.out.println(" Neste painel estão os numeros de 1 a 9,talvez se eu acertar um desses números a porta irá se abrir !");
                            Pp2 = PuzzlePorta();

                            int cont = 2;

                            for (int i = 0; i <= 2; i++) {
                                System.out.println("\n Número:");
                                Pp1 = input.nextInt();

                                if (Pp1 == b) {
                                    System.out.println("Resposta correta \nA porta começa a se abrir lentamente. e então você entra no local");
                                    
                                    break;
                                } else {
                                    System.out.println("Resposta incorreta, Tente novamente...");
                                    System.out.println("Voce tem " + cont-- + " chances");
                                }
                                if (cont == -1) {
                                    System.out.println("\ninfelizmente não consegui descobrir a senha, Parece que terei que achar outra maneira de entrar !\n");
                                    System.out.println("==========================================================================================================================");
                                }
                            }

                            break;

                        case 2://puzzle cemiterio
                            System.out.println(" Ao me aproximar até o local me deparo com oque parece ser um cemiterio abandonado, na hora fiquei em choque,"
                                    + "mais sem muitas opcões resolvi entrar no local.");
                            System.out.println(" Ao entrar no cemiterio me deparei com uma grande sepultura, quando me aproximei do portão da sepultura, escutei vozes de criaças pedindo socorro, "
                                    + "\n assutado com a situação decidi me aproximar do local para investigar melhor oque estava acontecendo.");
                            System.out.println(" Então percebo que o portao esta trancada, com um cadeado. Logo acima do cadeado esta um pequena nota com a seguinte frase,\n"
                                    + " 'O INDIVIDUO QUE ESTA NESTE TÚMULO, DEVERA PAGAR POR TODOS OS PECADOS DOS DEMAIS' ");
                            System.out.println("==========================================================================================================================");
                            System.out.println("Você então decide explorar o cemiterio, e encontra os seguintes túmulos");
                            System.out.println("Túmulo 1, Alfred Morto no dia XIII");
                            System.out.println("Túmulo 2, Jason Morto no dia IV");
                            System.out.println("Túmulo 3, Ronald Morto no dia XIII");
                            System.out.println("==========================================================================================================================");
                            System.out.println("Para abrir o cadeado voce deve fazer a soma dos numeros.");
                            //puzzle porta 2 cemiterio
                            int Pc1,
                             Pc2;
                            System.out.println("Digite a resposta");
                            Pc1 = input.nextInt();
                            Pc2 = puzzleCemiterio();

                            if (Pc1 == Pc2) {
                                System.out.println("Certa resposta, o cadeado se destranca e o portão se abre!");
                                break;
                            } else {
                                System.out.println("A porta não se abre, terei que achar outra forma de entrar");
                            }

                            break;

                        case 3:
                            System.out.println(" Ao me aproximar até o local me deparo com oque parece ser uma casa completamente derubada,"
                                    + " sem muitas opcoes decido entrar em uma floresta ao lado. ");
                           
                            break;
                        case 4:
                            System.out.println("Cenario 1 igreja ");
                            System.out.println("voce anda ate a construção abandonada e percebe que é uma especie de igreja.\n "
                                    + "ao se aproximar da porta percebo que ela esta trancada, ouso um estralo de um galho atras de min \n"
                                    + "me deparo com uma fidura estranha... é um homen alto com um terno cinza claro e um chapeu bem formal \n"
                                    + "eu nem sentiria medo se n fosse pelo seu par de xifres transpassando o chapeu e sua faca vermelho escuro\n"
                                    + "ELE COMEÇA A SE APROXIMAR, e com certeza isso não era bom... droga tenho que dar um geito de correr daqui");

                            g = PuzzelIgreja();
                            if (g == false) {
                                System.out.println("enquanto voce corria algo te atinge e voce sente a faca fria entrando nas suas costas");
                                break;
                            }

                    }

                case 2:
                    System.out.println("Desenvolvedores: Bruno Goncalves Pinheiro \n"
                            + "Renato Souza de Carvalho\n"
                            + "Eric Augusto de Jesus Silva\n"
                            + "Victor Levenetz Mariano \n\nCentro Universitário Senac\n"
                            + "Tecnologia em Analise e desenvolvimento de sistemas\n"
                            + "Projeto Integrador I\n"
                            + "Prof. Fernando Tsuda");
                    break;

                case 3:
                    System.out.println("Neste RPG textual você deverá seguir uma série de desafios para descobrir os mistérios que cercam a floresta.\n"
                            + "Você devera explorar o mapa para lidar com alguns inimigos.\n"
                            + "Por se tratar de um RPG textual todas as suas ações serão feitas com alguns comandos no seu teclado, que envolvem alguns desafios.\n"
                            + "Esperamos que se divirta e descubra todos os segredos de Nightmare Loop the game.");
                    break;
                default:
                    System.out.println("Saindo do jogo...");
            }
        }
    }

}

