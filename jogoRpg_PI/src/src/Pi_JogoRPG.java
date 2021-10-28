package src;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//importa os utilizatarios da biblioteca io
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Pi_JogoRPG {

    static Scanner sc = new Scanner(System.in);

    static void menu() {

        System.out.println("                ##                                                                                                       ##");
        System.out.println("               ###########################################################################################################");
        System.out.println("              ##  /\\       |  __ \\             | |                      | |                   (_)     | |              ##\n" +
                           "             ##  /  \\      | |__) |   ___    __| |  _ __    __ _      __| |   __ _    __   __  _    __| |   __ _      ##\n" +
                           "            ##  / /\\ \\     |  ___/   / _ \\  / _` | | '__|  / _` |    / _` |  / _` |   \\ \\ / / | |  / _` |  / _` |    ##\n" +
                           "           ##  / ____ \\    | |      |  __/ | (_| | | |    | (_| |   | (_| | | (_| |    \\ V /  | | | (_| | | (_| |   ##\n" +
                           "          ##  /_/    \\_\\   |_|       \\___|  \\__,_| |_|     \\__,_|    \\__,_|  \\__,_|     \\_/   |_|  \\__,_|  \\__,_|  ##\n" +                
                           "         ##                                                                                                       ##");
        System.out.println("        ###########################################################################################################");
        System.out.println("       ##                                                                                                       ##");
        System.out.println("      ##                                                                                                       ##");
        
        
                        System.out.println(
                "                                                      ��������������������������       \n" +
                "                                                     �  �        �� ��        �  �      \n" +
                "                                                   ��    �      �     �      �    ��    \n" +
                "                                                  �       �   �         �   �       �   \n" +
                "                                                ��         ���           ���         �� \n" +
                "                                                ��������������������������������������� \n" +
                "                                                 ��         ��            ��         ��  \n" +
                "                                                   ��       ��           ��        ��    \n" +
                "                                                     ��      ��          ��       ��      \n" +
                "                                                      ��      ��        ��      ��        \n" +
                "                                                        ��     ��      ��     ��         \n" +
                "                                                          ��    ��    ��    ��           \n" +
                "                                                            �     �� ��   ��             \n" +
                "********************************                              ��  �   �  ��              \n" +
                "******* ---- Menu ---- *********                                ���� ����                \n" +
                "********************************                                  �� ��                  \n" +
                "(1) - jogar                                                        ��� ");
        
        
        
        
        

       
        System.out.println("(2) - Instruções");
        System.out.println("(3) - Créditos");
        System.out.println("(4) - Sair");

        
        System.out.println("Escolha uma opção: ");
        

        opcaoMenu();

    }

    //função do menu (server para determinarmos a opção escolhida pelo jogador)
    static void opcaoMenu() {
        int opcao = 0;

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                //jogar ();
                break;
            case 2:
                instrucoes();
                break;
            case 3:
                creditos();
                break;
            case 4:
                System.out.println("Saindo do jogo!!");
                System.exit(0);
                break;
        }
    }

    //função que controla as instruções
    static void instrucoes() {
        System.out.println("\n\n\n\n\n\n\n");
                
System.out.println(         "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                          ********Instruções*********                              ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##             Pedra da vida é um jogo ambientado em uma era mitologica              ##\n"                                                         
                     +      "              ##         onde o jogador embarca em uma jornada para descobrir os misterios de      ##\n" 
                     +      "              ##                  um mundo cheio de fantasias e misterios.                         ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##         Tudo começa quando um terrivel praga devasta o reino do rei Arthur,       ##\n"  
                     +      "              ##           matando milhares de pessoas incluindo sua amada filha e esposa,         ##\n"
                     +      "              ##        seu objetivo no jogo sera interpretar os acontecimentos da historia e      ##\n"
                     +      "              ##  então linkar esses acontecimentos com a materia de Fundamentos da Administração. ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n" 
                     +      "              ##                                                                                   ##\n");
        

        int op;

        do {

            System.out.println("\n\nDigite 0 para retornar ao menu: ");
            op = sc.nextInt();

            if (op != 0) {
                System.err.println("Opção invalida ");
            }

        } while (op != 0);

        menu();

    }

    static void creditos() {
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println( "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                          **********Creditos*********                              ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##             Senac - Santo Amaro                                                   ##\n"                                                         
                     +      "              ##         Projeto Integrador I                                                      ##\n" 
                     +      "              ##         Autores: Diegos Santos                                                    ##\n"
                     +      "              ##                  Juliano Castro                                                   ##\n"
                     +      "              ##                  Nailson Nascimento                                               ##\n"  
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                  2º Semestre de 2019                                              ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n" 
                     +      "              ##                                                                                   ##\n");
      

        
        int op;

        do {
            System.out.println("\n\nDigite 0 para retornar ao menu");
            op = sc.nextInt();

            if (op != 0) {
                System.out.println("Opção invalida");
            }

        } while (op != 0);

        menu();

    }
    
    static String nomeJogador(){
        
        System.out.println("*******************************");
        System.out.println("*  Digite o nome do jogador:  *");
        System.out.println("*******************************");
        String nome = sc.next();
        
        return nome;
    }
    
    static void introducao(){
        System.out.println( "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                          *********introdução********                              ##\n"
                     +      "              ##                          ***************************                              ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##             Há muito tempo em um reino mitológico existia uma pedra               ##\n"                                                         
                     +      "              ##         denominada a pedra da vida, a qual o portador obtém o pode de             ##\n" 
                     +      "              ##         controlar a vida . Porém a utilização de seus poderes causara             ##\n"
                     +      "              ##         em seu portador graves problemas.                                         ##\n"
                     +      "              ##         Durante o Reinado do rei Arthur houve uma praga onde matou milhares       ##\n"  
                     +      "              ##         de pessoas incluindo sua esposa e filha, isso o modificou drasticamente.  ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n" 
                     +      "              ##                                                                                   ##\n");
    }
 
    static char entradaDados(){
        System.out.println("\nDigite a Opção desejada ou (0) para retornar ao menu: ");
      
        char alternativaEscolida = sc.next().charAt(0);
        
        return alternativaEscolida;
    }
    
    static void ranking(int score, String nome){
         //especifica o nome do arquivo a ser utilizado/criado 
        String nomeDoArquivo = "ranking.txt";        
       
        String conteudo = Read(nomeDoArquivo);
        String scoreNome = conteudo.split(" ")[0];
        String scoreValor = conteudo.split(" ")[1].trim();
        
        int scoreValor_int = Integer.parseInt(scoreValor);
        
        //verifica se a quantidade de pontos do jogador atual e maior que a do recorde
        //gravado no arquivo ranking.txt
        if(score > scoreValor_int){
        System.out.println( "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                    *******************"+"*********************                       ##\n"
                     +      "              ##                    ******* new record!,Parabens!!! ********                       ##\n"
                     +      "              ##                    *******************"+"*********************                       ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##");
                             
            
            
            
            
            /*
            System.out.println("");
            System.out.println("*******************"+"*********************");
            System.out.println("******* new record!,Parabens!!! ********");
            System.out.println("*******************"+"*********************");
            */
            
            //pega o nome do jogador 'atual' e 'Score' e grava no arquivo "ranking.txt"
            String print = nome + " " + score;
            Write(nomeDoArquivo,print);
            
            //lê após o valor do record ser atualizado 
            conteudo = Read(nomeDoArquivo);
            scoreNome = conteudo.split(" ")[0];
            scoreValor = conteudo.split(" ")[1].trim();
            
            /*
            System.out.println("*******  Nosso Recorde agora é: ********");
            System.out.println("*******************"+"*********************");
            System.out.println("*** Nome: " + nome+" ****"+"*** score: " +score+" ***");
            System.out.println("*******************"+"*********************");
            */
            System.out.println(
                            "              ##                                                                                   ##\n"
                     +      "              ##                    *******  Nosso Recorde agora é: ********                       ##\n"                                                         
                     +      "              ##                    *******************"+"*********************                      \n" 
                     +      "              ##                    *** Nome: " + nome+" ****"+"*** score: " +score+" ***            \n"
                     +      "              ##                    *******************"+"*********************                      \n"
                     +      "              ##                                                                                   ##\n"  
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n" 
                     +      "              ##                                                                                   ##\n");
            
            
            
        }else{
            
            System.out.println( 
                            "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##       *********************************************************************       ##\n"
                     +      "              ##            == "+nome +" =="+ " sua pontuação é: == " +score+ " ==, tente novamente             ##\n"
                     +      "              ##       *********************************************************************       ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##");
            
          
            //System.out.println("== "+nome +" =="+ " sua pontuação é: == " +score+ " ==, tente novamente");
            
            
            //System.out.println("Nome: " + nome);
            //System.out.println("score: " + score);
            
            //printa o valor do recorde atual
            conteudo = Read(nomeDoArquivo);
            scoreNome = conteudo.split(" ")[0];
            scoreValor = conteudo.split(" ")[1].trim();
        /*
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("**********  Nosso Recorde é: **********");
            System.out.println("*******************"+"********************");
            System.out.println("*** Nome: " + scoreNome+" ****"+"*** score: " +scoreValor+" ***");
            System.out.println("*******************"+"********************");
            
        */    
            
            
            
                        System.out.println(
                            "              ##                                                                                   ##\n"
                     +      "              ##                    ***************************************                        ##\n"                                                         
                     +      "              ##                    **********  Nosso Recorde é: **********                          \n" 
                     +      "              ##                    *** Nome: " + scoreNome+" **"+"** score: " +scoreValor+" ***                      \n"
                     +      "              ##                    *******************"+"********************                      \n"
                     +      "              ##                                                                                   ##\n"  
                     +      "              ##                                                                                   ##\n"
                     +      "              ##                                                                                   ##\n"
                     +      "          ################################################################################################\n" 
                     +      "              ##                                                                                   ##\n");
            
            
            
            
            
            
            
            
            
            
            
            
        }
        System.out.println("Para para sair digite (4) ou digite (0) para reiniciar");
        int reiniciar = sc.nextInt();
        
        if(reiniciar == 0){
             main(null);
        }else{
            System.exit(0);
        }
    }
    
    static boolean testaAcerto(String a, String b, String c, String d, String alternativaCorreta){
        
        boolean acertou = false;
        
        
        
        
        //recebe as alternativas e passa para a função randomização para serem embaralhadas
        List alternativasEmbaralhadas = randomizacao(a, b, c, d);
        
        char letras[] = new char[]{'A','B','C','D'};
        
       
        //System.out.println(alternativasEmbaralhadas);
        
       //printa as alternativas embaralhadas junto com o vetor de letras
       
    
       
       for(int i = 0; i < alternativasEmbaralhadas.size(); i++){
           System.out.println( 
                   " ## ("            + letras[i] + ")" + alternativasEmbaralhadas.get(i) + "                                                   ");
            
           
       }
       
        System.out.println(
                        " ##                                                                                                           ##\n" 
                      + " ##                                                                                                           ##\n" 
                      + " ##                                                                                                           ##\n" 
                      + "#################################################################################################################\n"
                      + " ##                                                                                                           ##\n");
       
       

       
       /*
       if("método de entreterimento , o conselheiro sabia o potencial do seu rei e que não haveria alguem tao bom como ele"== alternativaCorreta){
        System.out.println(alternativaCorreta);
       }*/
       
       char escolha = entradaDados();
       switch(escolha){
           case '0' :
               System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
               main(null);
               break;         
           case 'a':
           case 'A':
               if(alternativasEmbaralhadas.get(0).equals(alternativaCorreta)){
                   System.out.println("Resposta Correta!");
                   printAsterisco();
                   acertou = true;
                   break;
               }else{
                   System.out.println("Resposta incorreta! ");
                   System.out.println("Leia com atenção!");                  
                   break;
               }
            case 'b':
            case 'B':
               if(alternativasEmbaralhadas.get(1).equals(alternativaCorreta)){
                   System.out.println("Resposta Correta!");
                   printAsterisco();
                   acertou = true;
                   break;
               }else{
                   System.out.println("Resposta incorreta! ");
                   System.out.println("Leia com atenção");
                   break;
               }
            case 'c':
            case 'C':
               if(alternativasEmbaralhadas.get(2).equals(alternativaCorreta)){
                   System.out.println("Resposta Correta!");
                   printAsterisco();
                   acertou = true;
                   break;
                   
               }else{
                   System.out.println("Resposta incorreta! ");
                   System.out.println("Leia com atenção");
                   break;
               }
            case 'd':
            case 'D':
               if(alternativasEmbaralhadas.get(3).equals(alternativaCorreta)){
                   System.out.println("Resposta Correta!");
                   printAsterisco();
                   acertou = true;
                   break;
               }else{
                   System.out.println("Resposta incorreta! ");
                   System.out.println("Leia com atenção");
                   break;
               }
       }
       
       return acertou;
    }
    
    static int vida (int vida){
        vida --;
        return vida;
    }
    
    static int ponto(int i, int pontos, int peso){
        
        if(i == 1){
            pontos += 30 * peso;
        }else if(i == 2){
            pontos += 20 * peso;
        }else{
            pontos += 10 * peso;
        }
        
        return pontos;
        
    }
    
    static void questao1(int vida, int pontuacao, String nome ){
        boolean acertou;
        int i = 0;
        int peso = 1;
        
        
        
        do{
         System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 1********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (1) Pós esse acontecimento o rei começou a não ser visto em público                              ##\n"                                                         
                     +      " ##          e ficou em seu castelo. Esse tipo de atitude e mais comuns em pessoas                            ##\n" 
                     +      " ##          que tenham traços de ?                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
 
         
        String a = "Fantasia";
        String b = "Regressão";
        String c = "Deslocamento";
        String d = "Apatia"; //resposta correta
        
        String alternativaCorreta = d;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        questao2(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
        
        
    }
    
    static void questao2(int vida, int pontuacao, String nome){
       boolean acertou;
        int i = 0;
        int peso = 2;
        
        
        
        do{
            
        System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                      ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 2********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (2) Seu conselheiro notando sua tristeza profunda, promoveu diversas festas                      ##\n"                                                         
                     +      " ##          e banquetes para tentar motivá-lo, para assim poder volta a governar,                            ##\n" 
                     +      " ##          pois seu povo precisava dele. Qual métodos de motivacao foi ultilizado pelo coselheiro ?         ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
        
       
        String a = "Método de entreterimento , o conselheiro sabia o potencial do seu rei e que não haveria alguem tão\n" +
        " ##    bom como ele.";//resposta correta
        String b = "Comunicaçao , aproveitando o estado emocional do seu rei critico o conselheiro promoveu festas e\n" +
        " ##    banquetes.";
        String c = "Reconhecimento do rei , o conselheiro so queria ser bem visto no reino , assim promoveu varias\n" +
        " ##    atracões e eventos.";
        String d = "Incentivo, o conselheiro promoveu eventos e festa para amernizar os problemas do rei com seu\n" +
        " ##    povo."; 
        
        String alternativaCorreta = a;
                
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
            if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);

        questao3(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
        
    }
    
    static void questao3(int vida, int pontuacao, String nome){
        boolean acertou;
        int i = 0;
        int peso = 3;
        
        
        
                do{
        System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                      ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 3********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (3) Em uma dessas festas o conselheiro trouxe diversas atrações de diversos reinos,              ##\n"                                                         
                     +      " ##          dentre elas lutas entre cavalheiros , apresentação de magia , competição de bebidas,             ##\n" 
                     +      " ##          contos mitológicos .                                                                             ##\n"
                     +      " ##                                                                                                           ##\n"         
                     +      " ##          Dentre essas apresentações foi apresentado ao rei uma historia de uma pedra  que teria           ##\n"
                     +      " ##          o poder absoluto de  controlar a vida, o rei triste e depremido ficou obsecado ao ouvir          ##\n"  
                     +      " ##          essa história.                                                                                   ##\n"
                     +      " ##                                                                                                           ##\n"        
                     +      " ##          Assim foi procurar o viajante que teria contado a historia, ouvindo a historiao o rei            ##\n"
                     +      " ##          ficou em transe imaginando como seria sua vida caso ele conseguisse utilizar o poder da pedra    ##\n"
                     +      " ##          podemos afirmar que ?                                                                            ##\n"
                     +      " ##                                                                                                           ##");
      
        String a = "O rei teve um deslocameto de ideia pensando como seria ter o poder da vida.";
        String b = "O rei fantasiou em seu subconsciênte que poderia dominar todos os reinos com o poder da pedra\n"
                 + " ##    assim sendo o mais poderoso.";
        String c = "O rei foi impulsivo  imaginando como seria ter o poder da pedra.";
        String d = "O rei  eliminou  o desprazer iminente, mas que, na realidade, é impossível\n"+//resposta correta
                   " ##    de se concretizar. É uma espécie de teatro mental onde o indivíduo fantasiou  uma história diferente\n"
                 + " ##    daquela que vive na realidade."; 
        
        String alternativaCorreta = d;
                
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
            if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        System.out.println("Resposta Correta!!");
        questao4(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
        
        
        
        
        
    }
    
    static void questao4(int vida, int pontuacao, String nome){
         boolean acertou;
        int i = 0;
        int peso = 4;
        
        do{
            
            
             System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                     ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 4********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (4) O viajante que na verdade e um mago conhecido como Merlin , vindo de um outro reino          ##\n"                                                         
                     +      " ##          destruído por guerras milenares , aproveitou-se da fragilidade do rei para persuadi-lo a         ##\n" 
                     +      " ##          utilizar seus recursos. para encontrar a pedra com o objetivo de possuir seus poderes            ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          Qual método utilizado pelo viajante ?                                                            ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
                
        String a = "O viajante ultilizou  metodo de persuasão que é  a estratégia de comunicação que\n "//resposta correta
                + "##    utiliza recursos lógicos, racionais ou simbólicos para induzir alguém a aceitar uma\n"
                + " ##    ideia, uma atitude ou realizar uma ação.";
        String b = "O viajante ultilizou o motodo de regressao assim fazer o rei ficar cego fazendo de tudo\n"
                + " ##    para conseguir a pedra sacrificando ate seus guerreiros. ";
        String c = "O viajante ultilizou o metodo de conquista  , assim mostrando como seria a vida do sei caso\n"
                + " ##    tivesse a pedra.";
        String d = "O viajante ultiziou o metodo da agressividade , mostrando que a pedra seria a unica forma\n"
                + " ##    dele ser feliz de novo .";
        
        String alternativaCorreta = a;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        System.out.println("Resposta Correta!!");
        questao5(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
    }
    
    static void questao5(int vida, int pontuacao, String nome){
        boolean acertou;
        int i = 0;
        int peso = 5;
        
      
        
        do{
            
            
            System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                     ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 5********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (5)Um dos recursos mais utilizados pelo rei é  seu exército comandado                            ##\n"                                                         
                     +      " ##          por um lendário cavaleiro cujo o nome e conhecido e temido em todos os reinos                    ##\n" 
                     +      " ##          ragnar lodbrok , conhecido por sua capacidade de liderança e senso de justiça .                  ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          Quais  definicoes podemos dizer que  um  bom lider tem ?                                         ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
            
            
     
        String a = "Comando, planejamento, determinação e bom senso.";//resposta correta
        String b = "Liderança, controle, persuasão e impulsividade";
        String c = "Agressividade, compunsao e impulsao.";
        String d = "Planejamento, persuasao, implusao e bom senso.";
        
        String alternativaCorreta = a;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        System.out.println("Resposta Correta!!");
        questao6(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
    }
    
    static void questao6(int vida, int pontuacao, String nome){
        boolean acertou;
        int i = 0;
        int peso = 6;
        
        
   
        do{
            
            System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                     ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 6********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (6)Ragnar com toda sua sabedoria e experiência começou a ficar desconfiado dos reais objetivos   ##\n"                                                         
                     +      " ##          de Merlin , ao confrontá-lo o mago sentiu-se ameaçado lançando um feitiço no rei para que ele    ##\n"
                     +      " ##          volta-se contra Ragnar , que é destituído dos  seus ofícios e expulso do rei reino.              ##\n" 
                     +      " ##          A atitude do rei não  foi  bem vista no reino, porém não há nada que posso ser feito pois a      ##\n"
                     +      " ##          palavra do rei e absoluta.                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          Quais são os conceitos de uma monarquia presentes nos conceitos da administração clássica ?      ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
     
        String a = "Comando e controle, escalabilidade de poder e centralização."; //resposta correta
        String b = "Alto controle, racionalizacao e persuasão.";
        String c = "Centralizacao, confianca e etica.";
        String d = "Gerenciamento, execucao e liderança.";
        
        String alternativaCorreta = a;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        System.out.println("Resposta Correta!!");
        questao7(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
        
    }
    
    static void questao7(int vida, int pontuacao, String nome){
         boolean acertou;
        int i = 0;
        int peso = 7;
        
       
        
        do{
            
            System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                     ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 7********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (7)Ragnar mesmo sendo expulso do reino foi em busca da pedra , como guerreiro                    ##\n"                                                         
                     +      " ##          ele sabia que  teria a missao de ajudar o reino ,  pois sabia que os magos iriam influnciar      ##\n"
                     +      " ##          nas decisoes do rei . ragnar não tinha muito conhecimento da pedra  não sabia que a ultilizacao  ##\n"
                     +      " ##          levaria a morte.                                                                                 ##\n" 
                     +      " ##          Porem como era um guerreiro e não temia a nada . ao encontrá-la  abdicou-se de sua própria vida  ##\n"
                     +      " ##          para reviver a esposa e filha do rei.                                                            ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          Quais sentimentos foram determinantes para guiar as ações de ragnar ?                            ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");
      
        String a = "Empatia, compreensão e adimiração."; //resposta correta
        String b = "Dever, angustia e admiração.";
        String c = "Admiração, dever e poder.";
        String d = "Fama, dever e adimiração"; 
        
        String alternativaCorreta = a;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
        System.out.println("Resposta Correta!!");
        questao8(vida, pontuacao, nome);
        
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
    }
    
    static void questao8(int vida, int pontuacao, String nome){
        boolean acertou;
        int i = 0;
        int peso = 8;

        
        do{
            
            System.out.println(" ##                                                                                                           ##\n"
                     +      "#################################################################################################################\n"
                     +      " ##                                                                        =Vidas: "+vida+"                          ##\n"
                     +      " ##                                                                        =Pontução: "+pontuacao+"                     ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##         ********* Questão 8********                                                                       ##\n"
                     +      " ##         ***************************                                                                       ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          (8) Em seguida a esposa e filha do rei  voltaram ao reino, Arthur ao avista                      ##\n"                                                         
                     +      " ##          a chegada delas despertou  do seu feitiço e ordenou  imediatamente a execução do mago, e que     ##\n"
                     +      " ##          protegessem a pedra para toda a eternidade,  proibindo sua utilização.                           ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##          Em seguida conversando com seu conselheiro lamentou-se por suas atitudes para com o cavalheiro,  ##\n"
                     +      " ##          pois tem consciência que jamais conseguira encontrar alguém com suas habilidades.                ##\n"
                     +      " ##                                                                                                           ##\n" 
                     +      " ##          Trazendo a visão de dificuldade de encontrar um substituto para o cavalheiro é possível          ##\n"     
                     +      " ##          trazer esse conceito para a administração como a dificuldade de ?                                ##\n"
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##\n"  
                     +      " ##                                                                                                           ##\n"
                     +      " ##                                                                                                           ##");

        String a = "Recrutamento de talentos /profissionais qualificados.";//resposta correta
        String b = "Profissionais impulsivos / profissionais obdentes.";
        String c = "Recrutamento de pessoas agressiveis / profissionais espertos.";
        String d = "Recrutamento de inteligentes / profissionais apaticos";
        
        String alternativaCorreta = a;
        
        acertou = testaAcerto(a,b,c,d, alternativaCorreta);
        
       
        if(acertou == false){
            vida = vida(vida);
        }
        
        i++;
        
        
        }while(acertou == false && vida > 0);
        
        if(acertou ==true && vida > 0){
        
        pontuacao = ponto(i, pontuacao, peso);
        
            System.out.println("Fim de jogo");
        
        System.out.println("Score: " + pontuacao);
        ranking(pontuacao, nome);
         
        }else{
            System.out.println("Game Over!!");
            ranking(pontuacao, nome);
        }
        
        
    }
    
    //função para printar asteriscos
    static void printAsterisco(){
        System.out.println("\n*****************************************************************************"
                + "***********************************\n");
        
    }
    
    //função que randomiza as alternativas recebidas de cada questao
    static List randomizacao(String alternativa1, String alternativa2,
            String alternativa3, String alternativa4){
        
        List alternativas = new ArrayList();
        
        alternativas.add(alternativa1);
        alternativas.add(alternativa2);
        alternativas.add(alternativa3);
        alternativas.add(alternativa4);
        
        Collections.shuffle(alternativas);
        
        return alternativas;
    }
    
    //cria o metodo de Read (e le o arquivo de testo)
    public static String Read(String caminho){
        String conteudo = "";
        try{
            //tenta encontrar o arquivo
            FileReader arquivo = new FileReader(caminho);
            //cria um baffer do arquivo
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            //cria uma linha, para ler
            String linha="";
            try{
                linha = lerArquivo.readLine();
                while(linha!=null){
                    //contatena o valor lido na linha
                    conteudo +=linha + "\n";
                    linha=lerArquivo.readLine();
                }
                arquivo.close();
                
            //exceção casa não seja possivel ler o arquivo
            }catch(IOException ex){
                System.out.println("Erro: Não foi possível ler o arquivo! ");
            }
            //exceção caso o arquivo não seja encontrado
        }catch(FileNotFoundException ex){
            System.out.println("Erro: Arquivo não encontrado! ");
        }
        if(conteudo.contains("Erro")){
            return"";
        }else{
            return conteudo;
        }
       
    }
    
    //crima o metodo Write (passa o caminho-"caminho do arquivo"/ texto-"valor a ser gravado"
    public static boolean Write(String caminho, String texto){
        
        try{
            //procura o arquivo
            FileWriter arquivo = new FileWriter(caminho);
            //grava no arquivo
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            
            gravarArquivo.print(texto);
            gravarArquivo.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        
        int vida = 3;
        int pontuacao = 0;
        
        // iniciar o programa chamando o menu
        menu();
        
        String nome = nomeJogador();
        
        introducao();
        
        questao1(vida, pontuacao, nome);
        
       
    }
}
