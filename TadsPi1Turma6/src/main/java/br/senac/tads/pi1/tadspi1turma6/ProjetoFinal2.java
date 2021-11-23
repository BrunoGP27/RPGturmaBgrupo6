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
        System.out.println("\noque voce ira fazer?:");
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
                continuar = Fazes();
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

        int  valor = input.nextInt(max + min) + min;

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
                        System.out.println("oque voce fara agora? (1)janelas (2)pôsso (3)fundo da igreja");
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        PossoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("oque voce fara agora? (1)janelas (2)pôsso (3)fundo da igreja");
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
                        System.out.println("oque voce fara agora? (1)janelas (2)alsapão (3)fundo da igreja");
                        n1 = Entrada();
                    }

                    if (n1 == 2) {
                        AlsapaoDaIgreja();
                        ac = ac - n1;
                        if (ac <= 0) {
                            return false;
                        }
                        System.out.println("oque voce fara agora? (1)janelas (2)alsapão (3)fundo da igreja");
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
                int a = Fazes();
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

                System.out.println("Digite 1 para voltar ao Menu peincipal, ou 2 para sair");
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
                        + "Você devera explorar o mapa para lidar com alguns inimigos.\n"
                        + "Por se tratar de um RPG textual todas as suas ações serão feitas com alguns comandos no seu teclado, que envolvem alguns desafios.\n"
                        + "Esperamos que se divirta e descubra todos os segredos de Nightmare Loop the game.\n");

                System.out.println("Digite 1 para voltar ao Menu peincipal, ou 2 para sair");
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
            }
            return c1;
        }
    }
    
    public static int Boneco1(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Logo apos entrar no local, percebo que esta tudo muito escuro, entao decido acender meu isqueiro, e assim que o local se ilumina percebo um boneco ventriloquo me observando,"
                + " curioso começo a me aproximar do boneco, quando de repente ele comeca a dizer a seguinte frase,\n'VOU TE MATAR, VOU TE MATAR HA HA HA!!!\nAssustado decido entra na primeira sala que encontro, "
                + "Logo apos entrar no que aprece ser uma cozinha, sinto um calafrio e entao quando olho para tras percebo que o maldito boneco esta novamente atras de min."
                + "\nAcho que a unica maneira de me livrar desse maldito vai ser o matando\n"
                + "[1] Enfrentar o boneco \n[2] Correr");
        int a,b,c;
        a = input.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("Parcebo que o boneco esta evitando o fogao ao lado, talvez se eu conseguir atrair ele até o fogao, poderia usar meu isqueiro para acender o fogo e matar o maldito.");
                break;
            case 2:
                System.out.println("Começo a correr no escuro, mais aparentemente nao foi a melhor opção, aquele boneco parece conhecer o local melhor que eu.");
                System.out.println("O boneco te alcança e te mata");
                b = GameOver();
                break;
        }
        return a;
    }
    
        

    public static int inimigoBoneco1() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Quando olho para tras me deparo com um boneco ventriloquo me observando,ao me aproximar ele diz a seguinte frase:'VOU TE MATAR, VOU TE MATAR HA HA HA!!!\n"
                + " assutado decido correr em direcao a uma floresta que estava ao lado, depois de um tempo correndo imaginei que havia despistado o maldito boneco, entao logo apos o susto decido acender um ciagarro para me acalmar \n "
                + "quando de repende cinto um calafrio, e entao percebo que o disgracado ainda esta me espiando e volta a repetir a frase:'VOU TE MATAR, VOU TE MATAR HA HA HA!!!\n"
                + " neste momento percebi que a unica saida seria enfrentar o maldito.  ");
        System.out.println("==========================================================================================================================");
        System.out.println("preciso fazer alguma coisa, mais oque?");
        System.out.println("[1]Correr \n[2]tentar acertar um soco nele \n[3]Jogar meu cigarro, talvez ele seja fumante, vai saber!");
        int a, b, c;
        a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("'Estou muito cansado para correr'\n Então o Boneco ventriloquo te alcanca e torce seu pescoso.");
                b = GameOver();
                break;
            case 2:
                System.out.println("Quando me aproximo ele pula em cima de min e morde minha jugular");
                b = GameOver();
                break;
            case 3:
                System.out.println("\nNão consegui acertar o maldito, mais percebi que o cigarro caiu nas folhs secas e faz uma pequena fogueira, entao vejo que o boneco se assuta com o fogo,Personagem: 'Acho que encontrei uma forma de derrotalo'. ");
                c = inimigoBoneco2();

        }
        return a;

    }
    public static int inimigoBoneco2(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nPreciso colocar fogo nesse boneco do capiroto!!!\n");
        System.out.println("[1] Acender uma fogueira usando meu isqueiro. [2] Acender minha camisa, e assim que ele se aproximar, terei a oportunidade perfeita par matar o maldito. ");
        int a,b,c;
        a = input.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("Você nao tinha tempo suficiente para acender uma fogueira, e é atacado.");
                b = GameOver();
            case 2:
                System.out.println("Assim que ele se aproxima jogo minha camisa em chams no boneco, logo apos ele comeca a agonizar no chao, dizendo a seguinte frase 'POR FAVOR ISSO NÃO,POR FAVOR...'\n"
                        + "Depois que ele vira cinzas percebo que tem muitas coisa ao meu redor, talvez encontre algo de util.");

                
        }
        return a;
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
        boolean a;
        System.out.println("voce corre ate o fundo da igreja e ve uma porta aberta para entrar na igreja");
        a = Oguia();
    }

    public static int Fazes() {
        Scanner input = new Scanner(System.in);
        int c1 = 0;
        System.out.println("==========================================================================================================================================================");
        //introduçao a o enredo
        System.out.println("Inicio do Jogo \n\n"
                + "...Acordo de um sono profundo em meu carro com uma leve dor na lateral da minha cabeça, tento identificar o local que estou,mas está escuro demais para ver qualquer coisa.\n "
                + "A dor é quase como se eu tivesse sido atingido por algo, ainda não sei ao certo o que pode ter acontecido, mas com certeza poderia ter sido pior, afinal,ainda estou consciente.\n "
                + "Olho em minha volta e não vejo nenhum sinal de vida, tão pouco a estrada a qual me levou até onde estou agora.\n"
                + " Ao reparar no capô do meu carro, noto que está saindo fumaça e, apesar dos pesares, isso não me preocupa,  a única coisa que consigo pensar é em como e porque eu fui parar ali.\n"
                + " Em minha volta há apenas pinheiros e em frente ao meu carro há uma construção abandonada.\n "
                + "Resolvo descer do carro e explorar o local afim de encontrar algo que possa me ajudar a entender o que aconteceu até então.\n"
                + " Mas antes, preciso pegar meus cigarros e meu canivete no porta luvas... e, claro, não posso esquecer do meu isqueiro.\n"
                + " Desço do carro e sigo caminhando em direção a construção abandonada.\n");
        int b, c, a, d, e;
        int f = 0;

        b = cenario();

        do {
            switch (b) {//puzzle posto abandonado
                case 1:
                    System.out.println(" Ao me aproximar até o local me deparo com oque parece ser um velho posto abandonado,\n "
                            + "sem muitas opçoes resolvo entrar no local, entao percebo que o a uma velha porta em sua lateral, achei aquilo um pouco estranho entao resolvi ir ate la,\n"
                            + " quando me aproximo percebo que a um velho painel com um codigo bloqueando a porta, talvez eu posso decifrar esse codigo !");
                    int Pp1,Pp2,Pp3,Pp4,Pp5;
                     
                    // puzzle porta 1,2,3

                    System.out.println("==========================================================================================================================");
                    System.out.println(" Neste painel estão os numeros de 1 a 9, talvez se eu acertar um desses números a porta irá se abrir !");
                    Pp2 = PuzzlePorta();

                    int cont = 2;

                    for (int i = 0; i <= 2; i++) {
                        System.out.println("\n Número:");
                        Pp1 = input.nextInt();

                        if (Pp1 == Pp2) {
                            System.out.println("Resposta correta \nA porta começa a se abrir lentamente. e então você entra no local");
                            break;
                        } else {
                            System.out.println("Resposta incorreta, Tente novamente...");
                            System.out.println("Voce tem " + cont-- + " chances");
                        }
                        if (cont == -1) {
                            System.out.println("\ninfelizmente não consegui descobrir a senha, Personagem: 'Parece que terei que achar outra maneira de entrar !'\n");
                            System.out.println("");
                            Pp4 = inimigoBoneco1();
                            
                            
                        }
                    }
                    a = PlayerAC(c1);
                    
                    break;

                case 2://puzzle cemiterio
                    System.out.println(" Ao me aproximar até o local me deparo com oque parece ser um cemiterio abandonado, na hora fiquei em choque,"
                            + "mais sem muitas opcões resolvi entrar no local.");
                    System.out.println(" Ao entrar no cemiterio me deparei com uma grande sepultura, quando me aproximei do portão da sepultura, escutei vozes de criaças pedindo socorro, "
                            + "\n assutado com a situação decidi me aproximar do local para investigar melhor oque estava acontecendo.");
                    System.out.println(" Então percebo que o portao esta trancada, com um cadeado. \n logo acima do cadeado esta um pequena nota com a seguinte frase, "
                            + "'O INDIVIDUO QUE ESTA NESTE TÚMULO, DEVERA PAGAR POR TODOS OS PECADOS DOS DEMAIS' ");
                    System.out.println("==========================================================================================================================");
                    System.out.println("Você então decide explorar o cemiterio, e encontra os seguintes túmulos");
                    System.out.println("Túmulo 1, Alfred Morto no dia X");
                    System.out.println("Túmulo 2, Jason Morto no dia IV");
                    System.out.println("Túmulo 3, Ronald Morto no dia XIII");
                    System.out.println("==========================================================================================================================");
                    System.out.println("Talvez se eu conseguir, somar esses números consiga saber o codigo do cadeado.");
                    //puzzle porta 2 cemiterio
                    int Pc1,
                     Pc2;
                    System.out.println("Digite a resposta");
                    Pc1 = input.nextInt();
                    Pc2 = puzzleCemiterio();

                    if (Pc1 == Pc2) {
                        System.out.println("Certa resposta, o cadeado se destranca e o portão se abre!\n");
                    } else {
                        System.out.println("A porta não se abre, terei que achar outra forma de entrar\n");
                    }

                    b = PlayerAC(c1);
                    f = f + 1;
                    break;
                case 3:
                    System.out.println(" Ao me aproximar até o local me deparo com oque parece ser uma casa completamente derubada,"
                            + " sem muitas opcoes decido entrar em uma floresta ao lado. ");
                    c = PlayerAC(c1);
                    f = f + 1;
                    break;
                case 4:
                    boolean g;
                    System.out.println("==========================================================================================================================");
                    System.out.println("Cenario 1 igreja ");
                    System.out.println(" você anda ate a construção abandonada e percebe que é uma especie de igreja.\n "
                            + "ao se aproximar da porta percebo que ela esta trancada, ouso um estralo de um galho atras de min \n"
                            + " me deparo com uma figura estranha... é um homen alto com um terno cinza claro e um chapeu bem formal \n"
                            + " eu nem sentiria medo se não fosse pelo seu par de xifres transpassando o chapeu e sua faca vermelho escuro\n"
                            + " ELE COMEÇA A SE APROXIMAR, e com certeza isso não era bom... droga tenho que dar um geito de correr daqui");
                    g = PuzzelIgreja();

                    int fimJogo;
                    if (g == false) {
                        System.out.println("enquanto voce corria algo te atinge e voce sente a faca fria entrando nas suas costas");
                        fimJogo = GameOver();
                        if (g == true) {
                            System.out.println("voce entra na igreja mas alguma coisa não esta certa");
                            g = Oguia();
                            if (g == false) {
                                System.out.println("fim de jogo");
                            }
                        } else {
                            System.out.println("os espiritos se vão uma entidade de capuz preto aparece, ele estende as mãos \n"
                                    + "em uma um pinjente com uma cruz de prata e na outra ele a estende em sua direção como se quisesse algo\n"
                                    + "então voce lhe da faca que voce acabou de pegar e um eco soa pelo local -quele que espreita nas sombras \n "
                                    + "não ira mais ir atras de voce");
                        }

                        f = f + 1;
                        break;
                    }
            }
        } while (f != 3);
        return 1;
    }

    static boolean Oguia() {
        int n1, n2, n3 = 0;
        System.out.println("voce ve uma serie de formas espectrais centados");
        System.out.println("na parede uma mensagem gravada esta dizendo");
        System.out.println("'de ao responsalveu pela morte maria ao manto preto e ele te da a uma chave'");

        System.out.println("oque voce quer fazer?");
        System.out.println("(1)investigar os espiritos (2)olhar de baixo de uma das mesas");

        do {
            System.out.println(n3);
            n1 = Entrada();
            switch (n1) {
                case 1:
                    System.out.println("qual voce quer ouvir?");
                    System.out.println("(1)velha senhora (2)marechall (3)o largado\n"
                            + "(4)a moça gentil (5)a criança estranha (6)a criança ensanguentada (7)o padre");
                    n2 = Entrada();
                    Espiritos(n2);
                    break;

                case 2:
                    System.out.println("qual mesa voce quer ver?");
                    n2 = Entrada();
                    switch (n2) {
                        case 2:
                            System.out.println(" voce ve uma caixa ao abrila ve o esqueleto de uma criança muito nova\n"
                                    + "no verso da tampa esta escrito maria");
                            n3 = 2;
                            break;

                        case 5:
                            System.out.println("voce ve uma faca ensanguentada");
                            n3 = 1;
                            System.out.println(n3);
                            break;

                        default:
                            System.out.println("voce não ve nada");
                            break;
                    }
            }
        } while (n3 == 1 && n3 == 2);

        if (n3 == 2) {
            System.out.println("os espiritos se revoltam, um multiram de almas te rodeia e te mata");
            return false;
        } else {
            System.out.println("voce acha o culpado");
            return true;
        }
    }

    static void Espiritos(int n1) {
        switch (n1) {
            case 1:
                System.out.println("voce ve uma velha senhora centada em um dos cantos da igreja");
                System.out.println("sua forma espectral é estranha ao se aproximar é possivel ouvir sussuros");
                System.out.println("eles dizem -não confie no marechall ele mente");
                System.out.println("");
                System.out.println("oque voce realmente procura não esta baixo do banco da criança");
                break;

            case 2:
                System.out.println("voce ve um velho senhor centado em um dos cantos da igreja");
                System.out.println("ele usa vestes militares e seu rosto é de uma pessoa amargurada");
                System.out.println("sua forma espectral é estranha ao se aproximar é possivel ouvir sussuros");
                System.out.println("a criança mente acredite, eu conheço a maldade de judite e ela é puro mau");
                System.out.println("oque voce procura não esta na cadeira da senhora");
                break;

            case 3:
                System.out.println("voce ve um jovem rapaz centado em um dos cantos da igreja junto de uma criança");
                System.out.println("suas vestes são largadas e ele parece triste");
                System.out.println("sua forma espectral é estranha ao se aproximar é possivel ouvir sussuros");
                System.out.println("eu não posso me perdoar pelo que fiz mas talvez possa ajudar outra pessoa");
                System.out.println("pergunte a clarrisa ela não mente ela é gentil demais para isso, e aconteça oque acontecer não olhe a cadeira do marechal");
                break;

            case 4:
                System.out.println("voce ve uma jovem mossa centada gentilmente na cadeira");
                System.out.println("suas vestes são elegante e ela parece estar muito bem");
                System.out.println("sua forma espectral é estranha ao se aproximar é possivel ouvir sussuros");
                System.out.println("não da para ficar se lamentando pelo que ja passou mas eu jurei esperar por clegor, por isso estou aqui");
                System.out.println("se quer saber quem realmente é ruim nessa sala é a velha ela mentiu para todos e ainda foi traida no final");
                break;

            case 5:
                System.out.println("voce ve uma criança centada de forma estranha nos bancos longos da igreja");
                System.out.println("ao se aproximar é possivel ouvir sussuros");
                System.out.println("então voce procura algo para matar aquele que espreita na floresta?");
                System.out.println("fiquei sabendo que o marechal possui uma arma de baixo de sua cadeira");
                System.out.println("porem ele não deixa nigem usala");
                break;

            case 6:
                System.out.println("voce ve um garoto centado no canto oposto a outra criança e ao lado do rapaz mais velho");
                System.out.println("suas vestes estão cheias de sangue e ele parece triste");
                System.out.println("a judite falou que era apenas uma brincadeira como eu ia saber que isso iria acontecer?");
                System.out.println("eu não queria ter feito que fiz, sera que ela ainda esta me esperando?");
                System.out.println("e o general não tem uma arma ele tem uma pano de sua filha morta");
                break;

            case 7:
                System.out.println("voce ve um velho homen com vestes da igreja talvez um padre");
                System.out.println("eu não posso mentir na case de deus então oque ta garanto é que uma das crianças mente");
                break;
        }
    }

    public static void main(String[] args) {

        int menu = retornoMenu();
        int inicio = Fazes();
        if (inicio == 1) {
        }

    }

}
