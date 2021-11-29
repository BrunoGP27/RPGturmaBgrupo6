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
public class ProjetoFinal2 {

    static int Entrada() {
        int n1;
        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        return n1;
    }

    public static int puzzleCemiterio() {

        int x = 4;
        int y = 10;
        int z = 13;
        int w;

        w = x + y + z;

        return w;

    }

    public static int GameOver() {
        Scanner input = new Scanner(System.in);
        int gameOver;
        int continuar;
        int parar;
        System.out.println("=============================================================================");
        System.out.println("  ___   _   __  __ ___    _____   _____ ___ \n"
                + " / __| /_\\ |  \\/  | __|  / _ \\ \\ / / __| _ \\\n"
                + "| (_ |/ _ \\| |\\/| | _|  | (_) \\ V /| _||   /\n"
                + " \\___/_/ \\_\\_|  |_|___|  \\___/ \\_/ |___|_|_\\\n"
                + "                                            \nDeseja continuar? [1] Sim [2] Não");
        System.out.println("=============================================================================");
        gameOver = input.nextInt();
        switch (gameOver) {
            case 1:
                System.out.println(" Carregando... ");
                introducao();
                Fazes();
                break;
            case 2:
                System.out.println(" === Saindo === ");
                parar = retornoMenu();
                break;
            default:
                System.out.println(" Opção inválida ");

        }
        return gameOver;
    }

    public static int PuzzlePorta() {

        int min = 1;
        int max = 9;

        Random input = new Random();

        int valor = input.nextInt(max + min) + min;

        return valor;

    }

    public static int cenario() {

        int min = 1;
        int max = 3;

        Random input = new Random();

        int value = input.nextInt(max + min) + min;

        return value;

    }

    static boolean PuzzelIgreja() {
        //ac = ações
        int n1, ac;
        ac = 4;
                
        System.out.println("A criatura lentamente começa vir em minha direção, para onde devo correr?!\n ");
        System.out.println("[1] Para a direção que parece mais próxima, ESQUERDA!!!");
        System.out.println("[2] Com toda certeza, a DIREITA é a melhor opção!!!");
        n1 = Entrada();
        
        switch (n1) {
            case 1:
                System.out.println("==========================================================================================================================================================");
               System.out.println(" ...ao correr para o lado esquerdo encontramos uma porta entreaberta, e logicamente\n entrar não é apenas uma opção, é uma NECESSIDADE!...");
                System.out.println(" ...ao passar pela porta você trata de fecha-la o mais rápido possivel...\n");
                System.out.println(" - Mas que droga era aquilo!!! - exclamou. - Isso só pode ser um sonho, ou é isso ou estou delirando.\n");
                System.out.println(" ...Ao sair pela porta, dou de cara com um conjunto de janelas quebradas e um poço mais adiante...\n");
                System.out.println("\n[1]janelas \n[2]alçapão \n[3]fundo da igreja");
                n1 = Entrada();
                while (n1 != 3) {
                    if (n1 == 1) {
                        JanelasIgreja();
                        ac = ac - 2;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("O que você vai fazer agora?");                       
                        System.out.println("\n[2]alçapão \n[3]fundo da igreja");
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        PossoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("O que você fara agora?");
                        System.out.println("[1]janelas \n[2]alçapão \n[3]fundo da igreja");
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
                System.out.println("==========================================================================================================================================================");
                System.out.println(" ...ao correr para o lado esquerdo encontramos uma porta entreaberta, e logicamente\n entrar não é apenas uma opção, é uma NECESSIDADE!...");
                System.out.println(" ...ao passar pela porta você trata de fecha-la o mais rápido possivel...\n");
                System.out.println(" - Mas que droga era aquilo!!! - exclamou. - Isso só pode ser um sonho, ou é isso ou estou delirando.\n");
                System.out.println(" ...Ao sair pela porta, dou de cara com um conjunto de janelas quebradas e um poço mais adiante...\n");
                System.out.println("\n[1]janelas \n[2]alçapão \n[3]fundo da igreja");
                n1 = Entrada();
                while (n1 != 3) {
                    if (n1 == 1) {
                        JanelasIgreja();
                        ac = ac - 2;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("O que devo fazer agora?\n[2]alçapão \n[3]fundo da igreja");
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        AlsapaoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("O que devo fazer agora?\n \n[1]janelas \n[3]fundo da igreja");
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

    public static int retornoMenu() {//funcao para receber o menu
        Scanner input = new Scanner(System.in);
        int c1;

        do {

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

        } while (c1 < 1 || c1 > 4);
        {
            if (c1 == 1) {
                System.out.println("Iniciando o jogo...");
                Fazes();
            }
            if (c1 == 2) {
                int a;

                System.out.println("Desenvolvedores:\nBruno Gonçalves Pinheiro \n"
                        + "Renato Souza de Carvalho\n"
                        + "Eric Augusto de Jesus Silva\n"
                        + "Victor Levenetz Mariano \n\nCentro Universitário Senac\n"
                        + "Tecnologia em Analise e desenvolvimento de sistemas\n"
                        + "Projeto Integrador I\n"
                        + "Prof. Fernando Tsuda\n");

                System.out.println("Digite 1 para voltar ao Menu peincipal, ou 2 para sair.");
                a = input.nextInt();
                if (a == 1) {
                    System.out.println(retornoMenu());
                } else if (a == 2) {
                    System.out.println("Obrigado por jogar, saindo...");
                    System.exit(0);
                }
            }

            if (c1 == 3) {
                int b;

                System.out.println("Neste RPG textual você deverá seguir uma série de desafios para descobrir os mistérios que cercam a floresta.\n"
                        + "Você deverá explorar o mapa para lidar com alguns inimigos.\n"
                        + "Por se tratar de um RPG textual todas as suas ações serão feitas com alguns comandos no seu teclado, que envolvem alguns desafios.\n"
                        + "Esperamos que se divirta e descubra todos os segredos de Nightmare Loop the game.\n");

                System.out.println("Digite 1 para voltar ao Menu peincipal, ou 2 para sair.");
                b = input.nextInt();

                if (b == 1) {
                    System.out.println(retornoMenu());
                } else if (b == 2) {
                    System.out.println("Obrigado por jogar, saindo...");
                    System.exit(0);
                }
            }
            if (c1 == 4) {
                System.out.println("Saindo do jogo...");
                System.exit(0);
            }
            return c1;
        }
    }

    public static int Boneco1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Logo após entrar no local, percebo que está tudo muito escuro, então decido acender meu isqueiro,"
                + "\nE assim que o local se ilumina percebo um boneco ventríloquo me observando,"
                + "\nCurioso começo a me aproximar do boneco, quando de repente ele começa a dizer a seguinte frase,"
                + "\n'VOU TE MATAR, VOU TE MATAR HA HA HA!!!"
                + "\nAssustado decido entra na primeira sala que encontro, "
                + "logo após entrar no que aprece ser uma cozinha,"
                + "\nSinto um calafrio e então quando olho para trás percebo que o maldito boneco está novamente em minha cola,"
                + "\nAcho que a única maneira de me livrar desse maldito vai ser o matando.\n\n"
                + "[1] Enfrentar o boneco \n[2] Correr \n[3] Tentar se esconder");
        int a, b, c, d, e;
        a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Decido criar coragem para o atacar e então, Percebo que o boneco está evitando a área próximo ao forno, talvez se eu conseguir atrair ele até o fogão,"
                        + "\nPoderia usar meu isqueiro para acender o fogo e matar o maldito.");
                System.out.println("==========================================================================================================================================================");
                d = boneco2();
                break;
            case 2:
                System.out.println("Começo a correr no escuro, mas aparentemente não foi a melhor opção, aquele boneco parece conhecer o local melhor que eu.");
                System.out.println("O boneco te alcança e te mata.");
                b = GameOver();
                break;
            case 3:
                System.out.println("Me escondo no canto da porta, mas infelizmente acabo encostando em um molho de chaves,"
                        + "\nE acabo fazendo muito barulho atraindo o boneco para o local que estava me escondendo.");
                System.out.println("O boneco te acha e te mata.");
                c = GameOver();
            default:
                System.out.println("Opção invalida");
                e = Boneco1();
                System.out.println("==========================================================================================================================================================");
        }
        return a;
    }

    public static int boneco2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Espero pelo momento certo para atacar o inimigo, assim que ele abrir uma brecha terei a oportunidade perfeita!\n");
        System.out.println("[1] Tentar Distrai-lo, jogando um objeto para direção oposta. \n[2] Atacar na primeira oportunidade.");

        int a, b, c;
        a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Assim que ele se distrai percebo que ele está perto o suficiente do fogão e então o empurro para dentro do forno e acendo sem o boneco ter a chance de escapar,"
                        + "\nCausando assim sua morte.");
                System.out.println("Me aproximo das cinzas do boneco, e encontro o que parece ser uma parte de um velho mapa. vou levar comigo talvez ajude em alguma coisa");
                break;
            case 2:
                System.out.println("Infelizmente o boneco está atento as suas ações, assim que você se aproxima ele te mata.");
                b = GameOver();
                break;
            default:
                System.out.println("Opção invalida");
                c = boneco2();
                System.out.println("==========================================================================================================================================================");
        }
        return a;

    }

    public static int inimigoBoneco1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Quando olho para trás me deparo com um boneco ventríloquo me observando, ao me aproximar ele diz a seguinte frase:'VOU TE MATAR, VOU TE MATAR HA HA HA!!!\n"
                + "Assustado decido correr em direção a uma floresta que estava ao lado,"
                + "\nDepois de um tempo correndo imaginei que havia despistado o maldito boneco, então logo após o susto decido acender um cigarro para me acalmar \n"
                + "Quando de repente cinto um calafrio, e então percebo que o desgraçado ainda está me espiando e volta a repetir a frase:"
                + "\nVOU TE MATAR, VOU TE MATAR HA HA HA!!!\n"
                + "Neste momento percebi que a única saída seria enfrentar o maldito.");
        System.out.println("==========================================================================================================================================================");
        System.out.println("preciso fazer alguma coisa, mais o que?\n");
        System.out.println("[1] Correr \n[2] tentar acertar um soco nele \n[3] Jogar meu cigarro, talvez ele seja fumante, vai saber!");
        int a, b, c, d;
        a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Estou muito cansado para correr.\nEntão o Boneco ventríloquo te alcança e torce seu pescoço.");
                b = GameOver();
                break;
            case 2:
                System.out.println("Quando me aproximo ele pula em cima de min e morde minha jugular.");
                b = GameOver();
                break;
            case 3:
                System.out.println("\nNão consegui acertar o maldito, mas percebi que o cigarro caiu nas folhas secas e faz uma pequena fogueira,"
                        + "\nEntão vejo que o boneco se assusta com o fogo, acho que encontrei uma forma de derrotá-lo.");
                System.out.println("==========================================================================================================================================================");
                c = inimigoBoneco2();
                break;
            default:
                System.out.println("Opção invalida");
                d = inimigoBoneco1();
                System.out.println("==========================================================================================================================================================");
        }
        return a;

    }

    public static int inimigoBoneco2() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nPreciso colocar fogo nesse boneco do capiroto!!!\n");
        System.out.println("[1] Acender uma fogueira usando meu isqueiro. \n[2] Acender minha camisa, e assim que ele se aproximar, terei a oportunidade perfeita para matar o maldito. ");
        int a, b, c;
        a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Você não tinha tempo suficiente para acender uma fogueira, é e atacado.");
                b = GameOver();
                break;
            case 2:
                System.out.println("");
                System.out.println("==========================================================================================================================================================");
                System.out.println("Assim que ele se aproxima, jogo minha camisa em chamas no boneco, logo após ele começa a agonizar no chão, dizendo a seguinte frase 'POR FAVOR ISSO NÃO, POR FAVOR...'\n"
                        + "Depois que ele vira cinzas percebo que tem muitas coisas ao meu redor, talvez encontre algo de util.");
                System.out.println("Quando me aproximo do boneco e percebo um o que parece ser um mapa, vou levar comigo talvez seja util.");
                break;
            default:
                System.out.println("Opção invalida");
                c = inimigoBoneco2();
                System.out.println("==========================================================================================================================================================");
        }
        return a;
    }

    public static String charada() {
        Scanner input = new Scanner(System.in);

        String charada = "moeda";

        String resposta = null;
        int cont = 1;
        int a;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Escreva sua resposta:");
            resposta = input.next();

            if (resposta.equals(charada)) {
                System.out.println("Parabéns, você deve ser muito bom com charadas, acho que não vou te matar, pode passar.");
                System.out.println("o palhaço some em uma nuvem de fumaça e no local onde ele estava cai uma folha de papel, parece ser um mapa");
                System.out.println("==========================================================================================================================================================");
                break;
            } else {
                System.out.println("Tente novamente");
                System.out.println("Você tem somente mais " + cont-- + " chances, pense com cuidado");
                if (cont == -1) {
                    System.out.println("Parece que você não e bom com charadas, HA HA HA HA");
                    System.out.println("No mesmo instante, sinto uma navalha em meu pescoço");
                    a = GameOver();
                }
            }

        }
        return resposta;
    }

    public static String charada2() {
        Scanner input = new Scanner(System.in);

        String charada = "mapa";

        String resposta = null;
        int cont = 1;
        int a;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Escreva sua resposta:");
            resposta = input.next();

            if (resposta.equals(charada)) {
                System.out.println("Parabéns, você deve ser muito bom com charadas, acho que não vou te matar, pode passar.");
                System.out.println("o palhaço some em uma nuvem de fumaça e no local onde ele estava cai uma folha de papel, parece ser um mapa");
                System.out.println("==========================================================================================================================================================");
                break;
            } else {
                System.out.println("Tente novamente");
                System.out.println("Você tem somente mais " + cont-- + " chances, pense com cuidado");
                if (cont == -1) {
                    System.out.println("Parece que você não e bom com charadas, HA HA HA HA");
                    System.out.println("No mesmo instante, sinto uma navalha em meu pescoço");
                    a = GameOver();

                }
            }
        }
        return resposta;
    }

    public static String palhaco1() {

        String a;

        System.out.println("Logo após entrar no local, Percebo que os gritos de socorro pararam, e então vou seguindo por uma passagem que encontrei na sepultura,\n"
                + "Ao chegar no final da passagem começo a ver algumas coisas infantis, como bonecas e balões, um pouco confuso observo que a alguém está sentado em uma cadeira ao lado,\n"
                + "Quando me aproximo percebo que o indivíduo não passava de um palhaço, ele vira pra min com um sorriso no rosto e pergunta “VAMOS JOGAR UM JOGO?”, eu ainda confuso explico que estou perdido e busco ajuda,\n"
                + "E então ele volta fazer a mesma perguntar, “VAMOS JOGAR UM JOGO?”, então respondi NÃO,\n"
                + "No mesmo instante o palhaço mudou seu semblante e disse “ENTÃO VOCÊ VAI MORRER...”, no mesmo instante percebi que não tinha saída a não ser jogar o maldito jogo.");
        System.out.println("Então ele explica que gosta de charadas, e que se eu não acertasse a sua charada, ele iria me matar");
        System.out.println("==========================================================================================================================================================");
        System.out.println("“AI VAI A CHARADA”");
        System.out.println("Eu tenho uma coroa, mas não a uso na cabeça. Eu tenho cara, mas não tenho um corpo. Ter muitos de mim é sempre um bom negócio. O que eu sou?");
        a = charada();

        return a;
    }

    public static String palhaco2() {

        String a;

        System.out.println("Depois de não conseguir entrar no portão, olho para trás e percebo vários balões voando em minha direção,\n"
                + "E então quando os balões começaram a se dispersarem no ar, percebo uma criatura medonha saindo de umas das covas do cemitério,\n"
                + "Se tratava de um palhaço com o rosto todo desfigurado, quando pensei que tudo estava perdido e que ali seria meu fim,\n"
                + "O palhaço me diz a seguinte frase “VAMOS JOGAR UM JOGO?”, sem entender nada, porem com muito medo pergunto, “que tipo de jogo vamos jogar”,\n"
                + "Então o palhaço responde, “um jogo de vida ou morte, se você acertar a minha charada vive, se errar morre e bem simples, não?”\n"
                + "Sem saída decido entrar no jogo doentio do palhaço.");
        System.out.println("==========================================================================================================================================================");
        System.out.println("“AI VAI A CHARADA”");
        System.out.println("Eu tenho lagos sem água, montanhas sem pedra e cidades sem prédios. O que eu sou?");
        a = charada2();

        return a;
    }

    static void JanelasIgreja() {
        System.out.println("você tenta atravessar as janelas, mas se corta e cai no processo.");
    }

    static void PossoDaIgreja() {
        System.out.println("você olha o alçapão da igreja porem infelizmente não tem nada ali q possa te ajudar.");
    }

    static void AlsapaoDaIgreja() {
        System.out.println("O alçapão está trancado para o seu azar.");
    }

    static void FundoDaIgreja() {
        boolean a;
        System.out.println("==========================================================================================================================================================");
        System.out.println("você corre até o fundo da igreja e vê uma porta aberta e consegue entrar no local.");
        a = Oguia();
    }

    static void Fazes() {
        int x;

        x = cenario();

        switch (x) {
            case 1:
                introducao();
                cenarioCemiterio();
                cenarioPosto();
                cenarioIgreja();
                mapafinal();
                System.exit(0);
                break;               
            case 2:
                introducao();
                cenarioIgreja();
                cenarioPosto();
                cenarioCemiterio();
                mapafinal();
                System.exit(0);
                break;
            
            case 3:
                introducao();
                cenarioPosto();
                cenarioIgreja();
                cenarioCemiterio();
                mapafinal();
                System.exit(0);
                break;
        }

    }

    static void cenarioPosto() {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================================================================================================================================");
        System.out.println("Cenário 3, Posto abandonado");
        System.out.println("Ao me aproximar até o local, me deparo com o que parece ser um velho posto abandonado,\n"
                + "Sem muitas opções resolvo entrar no local. Ao chegar perto do posto percebo que a uma velha porta em sua lateral, achei aquilo um pouco estranho então resolvi ir até lá,\n"
                + "Quando me aproximo percebo que a um velho painel com um código bloqueando a porta, talvez eu posso decifrar esse código!");
        int Pp1 = 0, Pp2, Pp3, Pp4;

        // puzzle porta 1,2,3
        System.out.println("==========================================================================================================================================================");
        System.out.println("Neste painel estão os números de 1 a 9, talvez se eu acertar um desses números a porta irá se abrir!");
        Pp2 = PuzzlePorta();

        int cont = 2;

        for (int i = 0; i <= 2; i++) {
            System.out.println("\nNúmero:");
            Pp1 = input.nextInt();

            if (Pp1 == Pp2) {
                System.out.println("Resposta correta");
                System.out.println("A porta começa a se abrir lentamente. e então você entra no local");
                System.out.println("==========================================================================================================================================================");
                Pp4 = Boneco1();
                break;
            } else {
                System.out.println("Resposta incorreta, Tente novamente...");
                System.out.println("Você tem " + cont-- + " chances");
            }
            if (cont == -1) {
                System.out.println("\nInfelizmente não consegui descobrir a senha, terei que achar outra maneira de entrar!\n");
                System.out.println("==========================================================================================================================================================");
                System.out.println("");
                Pp3 = inimigoBoneco1();

            }
        }
    }

    static void cenarioCemiterio() {
        Scanner input = new Scanner(System.in);
        System.out.println("==========================================================================================================================================================");
        System.out.println("Cenário 2, Cemitério");
        System.out.println("Ao me aproximar até o local me deparo com o que parece ser um cemitério abandonado, na hora fiquei em choque, "
                + "mas sem muitas opções resolvi entrar no local. ");
        System.out.println("Ao entrar no cemitério me deparei com uma grande sepultura, quando me aproximei do portão da sepultura, escutei vozes de crianças pedindo por socorro,  "
                + "\nAssustado com a situação decidi me aproximar do local para investigar melhor o que estava acontecendo.");
        System.out.println("Então percebo que o portão está trancado, com um cadeado. \\n logo acima do cadeado está uma pequena nota com a seguinte frase, "
                + "'O INDIVIDUO QUE ESTÁ NESTE TÚMULO, DEVERA PAGAR POR TODOS OS PECADOS DOS DEMAIS' ");
        System.out.println("==========================================================================================================================================================");
        System.out.println("Você então decide explorar o cemitério, e encontra os seguintes túmulos:\n");
        System.out.println("Túmulo 1, Alfred Morto no dia X");
        System.out.println("Túmulo 2, Jason Morto no dia IV");
        System.out.println("Túmulo 3, Ronald Morto no dia XIII");
        System.out.println("==========================================================================================================================================================");
        System.out.println("Talvez se eu conseguir, somar esses números consiga saber o código do cadeado.");
        //puzzle porta 2 cemiterio
        int Pc1, Pc2, Pc3;
        String Pc4;
        String Pc5;
        System.out.println("Digite a resposta:");
        Pc1 = input.nextInt();
        Pc2 = puzzleCemiterio();

        if (Pc1 == Pc2) {
            System.out.println("Certa resposta, o cadeado se destranca e o portão se abre!\n");
            System.out.println("==========================================================================================================================================================");
            Pc4 = palhaco1();
            //adicionar aqui continuacao.
        } else {
            System.out.println("Resposta Errada.");
            System.out.println("A porta não se abre, terei que achar outra forma de entrar\n");
            System.out.println("==========================================================================================================================================================");
            Pc5 = palhaco2();
        }

    }
    
    static void cenarioIgreja() {
        
        int f = 0;
        boolean g;
        System.out.println("==========================================================================================================================================================");
        System.out.println("Cenário 1, igreja  ");
        System.out.println("Você anda até a construção abandonada e percebe que é uma espécie de igreja.\n"
                + "Ao se aproximar da porta percebo que ela está trancada, ouso um estralo de um galho atras de min\n"
                + "Me deparo com uma figura estranha... é um homem alto com um terno cinza claro e um chapéu bem formal\n"
                + "Eu nem sentiria medo se não fosse pelo seu par de chifres transpassando o chapéu e sua faca vermelho escuro \n"
                + "ELE COMEÇA A SE APROXIMAR, e com certeza isso não era bom... droga tenho que dar um jeito de correr daqui");
        g = PuzzelIgreja();

        int fimJogo;
        if (g == false) {
            System.out.println("enquanto você corria, algo te atinge e você sente a faca fria entrando nas suas costas.");
            fimJogo = GameOver();
            if (g == true) {
                System.out.println("você entra na igreja, mas alguma coisa não está certa");
                g = Oguia();
                if (g == false) {
                    System.out.println("fim de jogo");
                    fimJogo = GameOver();
                }
            } else {
                System.out.println("os espíritos se vão uma entidade de capuz preto aparece, ele estende as mãos  \n"
                        + "em uma um pingente com uma cruz de prata e na outra ele a estende em sua direção como se quisesse algo \n"
                        + "então você lhe dá faca que acabou de pegar, e um eco soa pelo local  e aquele que espreita nas sombras \n "
                        + "não irá mais ir atras de você");
            }

        }

    }
        
    static void introducao() {
        //introduçao a o enredo
        System.out.println("==========================================================================================================================================================");
        System.out.println("Início do Jogo  \n\n"
                + " ...Acordo de um sono profundo em meu carro com uma leve dor na lateral da minha cabeça, tento identificar o local que estou, mas está escuro demais para ver qualquer coisa.\n"
                + "A dor é quase como se eu tivesse sido atingido por algo, ainda não sei ao certo o que pode ter acontecido, mas com certeza poderia ter sido pior, afinal, ainda estou consciente.\n"
                + "Olho em minha volta e não vejo nenhum sinal de vida, tão pouco a estrada a qual me levou até onde estou agora.\n"
                + "Ao reparar no capô do meu carro, noto que está saindo fumaça e, apesar dos pesares, isso não me preocupa, a única coisa que consigo pensar é em como e porque eu fui parar ali. \n"
                + "Em minha volta há apenas pinheiros e em frente ao meu carro há uma construção abandonada. \n"
                + "Resolvo descer do carro e explorar o local afim de encontrar algo que possa me ajudar a entender o que aconteceu até então. \n"
                + "Mas antes, preciso pegar meus cigarros e meu canivete no porta luvas... e, claro, não posso esquecer do meu isqueiro.\n"
                + "Desço do carro e sigo caminhando em direção a construção abandonada.\n");

    }

    static boolean Oguia() {
        int n1,i, n2, n3 = 0;
        System.out.println("Corro até o fundo da igreja e vejo uma porta aberta, sigo na direção dela e entro no local.");
        System.out.println("Ao olhar em volta percebo a presença de algumas formas espectrais sentadas espalhadas ao redor da sala.\n" +
        "E em uma parade próxima uma mensagem gravada diz...");
        System.out.println("\"Dê ao responsável pela morte de Maria o manto preto, e ele te dará uma chave\".");

        do {
            
            System.out.println("O que você quer fazer?");
            System.out.println(" [1]investigar os espíritos. \n [2]olhar de baixo de uma das mesas.");
        
            System.out.println(n3);
            n1 = Entrada();
            switch (n1) {
                case 1:
                    System.out.println("qual você quer ouvir?");
                    System.out.println(" [1]Velha senhora \n [2]Marechal \n [3]O largado\n"
                            + " [4]A moça gentil \n [5]a criança estranha \n [6]A criança ensanguentada \n [7]O padre");
                    n2 = Entrada();
                    Espiritos(n2);
                    break;

                case 2:
                    System.out.println("qual mesa você quer ver?");
                    n2 = Entrada();
                    switch (n2) {
                        case 2:
                            System.out.println(" Você vê uma caixa e ao abri-la, vê o esqueleto de uma criança muito nova\n"
                                    + "no verso da tampa esta escrito maria");
                            n3 = 2;
                            break;

                        case 5:
                            System.out.println("você observa uma faca ensanguentada");
                            n3 = 1;
                            System.out.println(n3);
                            break;

                        default:
                            System.out.println("você não vê nada");
                            break;
                    }
            }
        } while (n3 != 1 && n3 != 2);

        if (n3 == 2) {
            System.out.println("os espíritos se revoltam, um multaram de almas te rodeia e te matam");
            i = GameOver();
            return false; 
        } 
        if(n3 == 1){
            System.out.println("você acha o culpado");
            return true;
        }
        
        return false;
    }

    static void Espiritos(int n1) {
        switch (n1) {
            case 1:
                System.out.println("você vê uma velha senhora sentada em um dos cantos da igreja");
                System.out.println("sua forma espectral é estranha ao se aproximar é possível ouvir sussurros");
                System.out.println("eles dizem -não confie no marechal ele mente");
                System.out.println("");
                System.out.println("você realmente procura não está baixo do banco da criança");
                break;

            case 2:
                System.out.println("você vê um velho senhor sentado em um dos cantos da igreja");
                System.out.println("ele usa vestes militares e seu rosto é de uma pessoa amargurada");
                System.out.println("sua forma espectral é estranha, ao se aproximar é possível ouvir sussurros");
                System.out.println("a criança mente acredite, eu conheço a maldade de Judite e ela é puro mau");
                System.out.println("o que você procura não está na cadeira da senhora");
                break;

            case 3:
                System.out.println("você vê um jovem rapaz sentado em um dos cantos da igreja junto de uma criança");
                System.out.println("suas vestes são largadas e ele parece triste");
                System.out.println("sua forma espectral é estranha ao se aproximar é possível ouvir sussurros");
                System.out.println("eu não posso me perdoar pelo que fiz, mas talvez possa ajudar outra pessoa");
                System.out.println("pergunte a Clarissa ela não mente ela é gentil demais para isso, e aconteça o que acontecer não olhe a cadeira do marechal");

                break;

            case 4:
                System.out.println("você vê uma jovem mossa sentada gentilmente na cadeira");
                System.out.println("suas vestes são elegantes e ela parece estar muito bem");
                System.out.println("sua forma espectral é estranha ao se aproximar é possível ouvir sussurros");
                System.out.println("não dá para ficar se lamentando pelo que já passou, mas eu jurei esperar por Clegor, por isso estou aqui");
                System.out.println("se quer saber quem realmente é ruim nessa sala é a velha ela mentiu para todos e ainda foi traída no final");
                break;

            case 5:
                System.out.println("você vê uma criança sentada de forma estranha nos bancos longos da igreja");
                System.out.println("ao se aproximar é possível ouvir sussurros");
                System.out.println("então você procura algo para matar aquele que espreita na floresta?");
                System.out.println("fiquei sabendo que o marechal possui uma arma de baixo de sua cadeira");
                System.out.println("porem ele não deixa ninguém usa-la");
                break;

            case 6:
                System.out.println("você vê um garoto sentado no canto oposto a outra criança e ao lado do rapaz mais velho");
                System.out.println("suas vestes estão cheias de sangue e ele parece triste");
                System.out.println("a Judite falou que era apenas uma brincadeira como eu ia saber que isso iria acontecer?");
                System.out.println("eu não queria ter feito que fiz, será que ela ainda está me esperando?");
                System.out.println("e o general não tem uma arma ele tem um pano de sua filha morta");
                break;

            case 7:
                System.out.println("você vê um velho homem com vestes da igreja talvez um padre");
                System.out.println("eu não posso mentir na casa de deus, então te garante que uma das crianças mente");
                break;
        }
    }
    
    static void mapafinal(){
        System.out.println("==========================================================================================================================================================");
        System.out.println("Por um breve momento sinto uma forte tensão em meu corpo, e em um piscar de olhos estou novamente em meu carro... Estou sendo observado por criaturas estranhas e a única coisa que consigo pensar é que eles são os responsáveis pela experiência que acabará de viver. \n" +
"\n" +
" O sentimento de Déjà vu está tão alinhado com minhas emoções que já não consigo mais distinguir o que é real ou apenas um sonho, uma espécie de sonho repetitivo e duradouro...\n" +
"\n" +
"Talvez esse seja de fato meu fim, ou melhor... O recomeço do meu fim...\n" +
"\n" +
" Ao tentar sair do carro, uma luz que vem do céu desce de encontro em minha direção, e antes que possa olhar para cima afim de encontrar o que produz a luz, eu desmaio e acordo em meio a um flashback... \n" +
"\n" +
" Recordo a consciência e minha cabeça ainda dói... estou em um novo lugar, em uma espécie de câmara com um liquido estranho. De forma automática a cápsula se abre, derramando todo o liquido que antes me acolhia. \n" +
"\n" +
" Ao tentar sair da cápsula, surgem criaturas em minha volta, elas são pequenas, agressivas e estão espalhadas por todos os lugares da sala, de forma imediata me forçam a voltar para dentro da cápsula. \n" +
"\n" +
"Antes da câmara ser lacrada percebo que estou cercado por cápsulas iguais as minhas, e em todas haviam pessoas desacordadas, o desespero toma conta de mim, e um momento de pura adrenalina chuto uma das criaturas e desesperadamente saiu em fuga, até que... \n" +
"\n" +
"\n" +
" Bom, a continuação segue um mistério, essa á uma história que precisara de mais \"tempo\" ou melhor, de mais alguns looping...");
    }

    public static void main(String[] args) {

        retornoMenu();
        
        mapafinal();
        
        retornoMenu();
    }
}
