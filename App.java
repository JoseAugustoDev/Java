package com.mycompany.graficos;

import javafx.application.Application;
import br.com.mauricioborges.graficos.Grafico;
import br.com.mauricioborges.graficos.Grafico.Estilo;
import java.util.Scanner;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor do coeficiente angular: ");
        double valorA = in.nextDouble();
        
        System.out.println("Digite o valor do coeficiente linear: ");
        double valorB = in.nextDouble();
        
        char sinal = ' ';
        
        if (valorB >= 0) {
            sinal = '+';
        }
        
        System.out.println("f(x) = " + valorA + "x " + sinal + valorB);
        
        Double[] x = new Double [5];
        Double[] y = new Double [5];
        
        for (int i = 0; i < 5; i++) {
            x[i] = Double.valueOf(i);
            
            y[i] = (valorA * i) + valorB;
            
            System.out.println("Para x = " + x[i] + ";" + " y = " + y[i]);
        }
        
        Grafico g = new Grafico();
        g.plotPontos(x, y, "Pontos", Estilo.LINHA_E_MARCADOR);
        g.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}