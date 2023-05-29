import java.util.Scanner;

public class SalarioLiquido {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha: (x) ou (o)");
        String jogadorUm = in.next();

        String jogadorDois;

        if (jogadorUm.equals("x")) {
            jogadorDois = "o";
        } else {
            jogadorDois = "x";
        }

       System.out.println("Jogador 1: " + jogadorUm);
       System.out.println("Jogador 2: " + jogadorDois);

       jogar(jogadorUm, jogadorDois);

       in.close();
        
    }

    public static String[][] criarJogo(String jogador) {
        String [][] jogoDaVelha = new String[3][3];
        
        System.out.println("-0-|-1-|-2-");

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha.length; j++) {
                
                jogoDaVelha[i][j] = " ";
                
                System.out.print(" " + jogoDaVelha[i][j]);
                if ( j < 2) System.out.print(" |");
                
            }
            System.out.print("  " + i);
            System.out.println();

            if (i < 2) {
                System.out.println("---|---|---");
            }

        }
        
        return jogoDaVelha;
    }
    
    public static String[][] jogar(String jogadorUm, String jogadorDois) {
        Scanner in = new Scanner(System.in);
        
        String [][] jogoDaVelha = criarJogo(jogadorUm);
        
        int posicaoColuna = 0;
        int posicaoLinha = 0;
        
        int jogadas = 0;
        
        while (jogadas < 9) {
            do {
                do {
                    System.out.println("Digite a coluna: ");
                    posicaoColuna = in.nextInt();
                    
                    System.out.println("Digite a linha: ");
                    posicaoLinha = in.nextInt();
    
                } while (posicaoLinha < 0 || posicaoLinha > 2 || posicaoColuna < 0 || posicaoColuna > 2);

            } while (jogoDaVelha[posicaoLinha][posicaoColuna] != " ");

            String jogar;

            if (jogadas%2 == 0) {
                jogar = jogadorUm;
                
            } else {
                jogar = jogadorDois;
            }
                
            jogoDaVelha[posicaoLinha][posicaoColuna] = jogar;
            
            System.out.println("-0-|-1-|-2-");

            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha.length; j++) {

                    System.out.print(" " + jogoDaVelha[i][j]);
                    if ( j < 2) System.out.print(" |");
                    
                }
                System.out.print("  " + i);
                System.out.println();
    
                if (i < 2) System.out.println("---|---|---");
            }

            jogadas++;
            
            if (verificarGanhador(jogoDaVelha)) {
                break;
            }

            if (jogadas > 8 && !verificarGanhador(jogoDaVelha)) {
                System.out.println("Deu velha!");
            }
        }

        in.close();
        
        return jogoDaVelha;
    }

    public static boolean verificarGanhador(String[][] jogoDaVelha) {

        // Verificar Horizontal
        boolean ganhouX = false;
        boolean ganhouO = false;

        for (int l = 0; l < 3; l++) {
            if (jogoDaVelha[l][0].equals("o") && jogoDaVelha[l][1].equals("o") && jogoDaVelha[l][2].equals("o")) {
                System.out.println("Ganhou o");
                ganhouO = true;
            }
        }

        for (int l = 0; l < 3; l++) {
            if (jogoDaVelha[l][0].equals("x") && jogoDaVelha[l][1].equals("x") && jogoDaVelha[l][2].equals("x")) {
                System.out.println("Ganhou x");
                ganhouX = true;
            }
        }
        
        //  Verificar Coluna
        
        for (int c = 0; c < 3; c++) {
            if (jogoDaVelha[0][c].equals("o") && jogoDaVelha[1][c].equals("o") && jogoDaVelha[2][c].equals("o")) {
                System.out.println("Ganhou o");
                ganhouO = true;
            }
        }

        for (int c = 0; c < 3; c++) {
            if (jogoDaVelha[0][c].equals("x") && jogoDaVelha[1][c].equals("x") && jogoDaVelha[2][c].equals("x")) {
                System.out.println("Ganhou x");
                ganhouX = true;
            }
            
        }
        
        // Verificar diagonal Decrescente

        if (jogoDaVelha[0][0].equals("o") && jogoDaVelha[1][1].equals("o") && jogoDaVelha[2][2].equals("o")) {
            System.out.println("Ganhou o");
            ganhouO = true;
        }
        if (jogoDaVelha[0][0].equals("x") && jogoDaVelha[1][1].equals("x") && jogoDaVelha[2][2].equals("x")) {
            System.out.println("Ganhou x");
            ganhouX = true;
        }

        // Verificar Diagonal Crescente
        
        if (jogoDaVelha[0][2].equals("o") && jogoDaVelha[1][1].equals("o") && jogoDaVelha[2][0].equals("o")) {
            System.out.println("Ganhou o");
            ganhouO = true;
        }
        if (jogoDaVelha[0][2].equals("x") && jogoDaVelha[1][1].equals("x") && jogoDaVelha[2][0].equals("x")) {
            System.out.println("Ganhou x");
            ganhouX = true;
        }

        boolean ganhador = false;

        if (ganhouX) {
            ganhador = true;
        } else if (ganhouO) {
            ganhador = true;
        } else {
            ganhador = false;
        }

        return ganhador;
    }

}