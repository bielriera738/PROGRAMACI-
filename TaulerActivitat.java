package AEA3.TicTacToeActivitat;

public class TaulerActivitat {
    private char[][] tauler;
    private static final int MIDA = 3;
    private static final char BUIT = '-';

    public TaulerActivitat() {
        tauler = new char[MIDA][MIDA];
        inicialitzarTauler();
    }

    public void inicialitzarTauler() {
        for (int i = 0; i < MIDA; i++) {
            for (int j = 0; j < MIDA; j++) {
                tauler[i][j] = BUIT;
            }
        }
    }

    public void mostrarTauler() {
        System.out.println("Tauler actual:");
        for (int i = 0; i < MIDA; i++) {
            for (int j = 0; j < MIDA; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean posarJugada(int fila, int columna, char jugador) {
        if (fila >= 0 && fila < MIDA && columna >= 0 && columna < MIDA && tauler[fila][columna] == BUIT) {
            tauler[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    public boolean haGuanyat(char jugador) {
        for (int i = 0; i < MIDA; i++) {
            if (tauler[i][0] == jugador && tauler[i][1] == jugador && tauler[i][2] == jugador) return true;
            if (tauler[0][i] == jugador && tauler[1][i] == jugador && tauler[2][i] == jugador) return true;
        }
        if (tauler[0][0] == jugador && tauler[1][1] == jugador && tauler[2][2] == jugador) return true;
        if (tauler[0][2] == jugador && tauler[1][1] == jugador && tauler[2][0] == jugador) return true;
        return false;
    }

    public boolean estaPle() {
        for (int i = 0; i < MIDA; i++) {
            for (int j = 0; j < MIDA; j++) {
                if (tauler[i][j] == BUIT) return false;
            }
        }
        return true;
    }
}

}
