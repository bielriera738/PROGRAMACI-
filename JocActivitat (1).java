package AEA3.TicTacToeActivitat;

import AEA3.TicTacToe.Tauler;

import java.util.Scanner;

public class JocActivitat {
    private Tauler tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;
    public JocActivitat() {
        tauler = new TaulerActivitat();
        jugadorActual = 'X';
        guanyador = false;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (!guanyador && !tauler.estaPle()) {
            tauler.mostrarTauler();
            System.out.println("Torn del jugador " + jugadorActual);
            System.out.print("Introdueix la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Introdueix la columna (0-2): ");
            int columna = scanner.nextInt();

            if (tauler.posarJugada(fila, columna, jugadorActual)) {
                if (tauler.haGuanyat(jugadorActual)) {
                    tauler.mostrarTauler();
                    System.out.println("El jugador " + jugadorActual + " ha guanyat!");
                    guanyador = true;
                } else if (tauler.estaPle()) {
                    tauler.mostrarTauler();
                    System.out.println("Empat! El tauler està ple.");
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Moviment invàlid. Torna a intentar-ho.");
            }
        }
    }
}
