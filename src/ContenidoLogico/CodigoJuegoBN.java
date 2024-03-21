package ContenidoLogico;

//Importamos La Libreria De Random 
import java.util.Random;

public class CodigoJuegoBN {

    public static final int FILAS = 10;
    //Variable Para Dejar Estatica Las Columnas De La Matriz
    public static final int COLUMNAS = 10;
    Random rd = new Random();
    //Variable Para Inicializar El Numero De Bombas aleatorias Que Van A Estar En La Matriz
    int Bombas = 0;
    int Barcos = 0; 
    int fila = 0;    
    int col = 0;
    int i,j;
    //Permite dejar estáticas las filas y columnas
    String batalla[][] = new String[FILAS][COLUMNAS];
    public void vaciarMatriz() {
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                batalla[i][j] = " ";
            }
        }
    }
    //Metodo para retornar en que posicion hay barcos
    //'X' representa donde hay barcos en la matriz del juego
    public boolean posicionesBarcosMatriz(int x, int y) {
        if (y < 0) {
            y = 0;
        }//Cierre If  
        if (y > 9) {
            y = 9;
        }//Cierre If                
        if (x > 9) {
            x = 9;
        }//Cierre If
        if (x < 0) {
            x = 0;
        }//Cierre If
        if (batalla[x][y] == "B") {
            batalla[x][y] = " ";
            return true;
        }//Cierre If 
        else {
            return false;
        }
    }
    //Metodo para retornar en que posicion no hay barcos
    //'O' representa donde NO hay barcos en la matriz del juego
    public boolean posicionessSinBarcos(int x, int y) {
        if (y < 0) {
            y = 0;
        }//Cierre If  
        if (y > 9) {
            y = 9;
        }//Cierre If                
        if (x > 9) {
            x = 9;
        }//Cierre If
        if (x < 0) {
            x = 0;
        }//Cierre If
        if (batalla[x][y] == "O") {
            batalla[x][y] = " ";
            return true;
        }//Cierre If
        else {
            return false;
        }
    }
    //Metodo para poner barcos aleatoriamente en las filas de la matriz
    public void ponerBarcos() {
        Barcos = 9;       
        for (fila = 0; fila <= Barcos; fila++) {
            batalla[fila][rd.nextInt(9)] = "B";
        }//Cierre For
    }
    //Metodo donde pone 'O' aleatoriamente
    public void sinBarcos() {
        Bombas = 100;
        for (fila = 0; fila <= Bombas; fila++) {
            for (col = 0; col <= Bombas; col++) {
                batalla[rd.nextInt(10)][rd.nextInt(10)] = "O";
            }
        }
    }
    //Metodo que permite mostrar la matriz llena con sus posiciones y que hay en cada una de ellas
    public String mostrarMatriz() {
        String matriz = "[" + batalla[0][0] + "][" + batalla[0][1] + "][" + batalla[0][2] + "][" + batalla[0][3] + "][" + batalla[0][4] + "][" + batalla[0][5] + "][" + batalla[0][6] + "][" + batalla[0][7] + "][" + batalla[0][8] + "][" + batalla[0][9] + "]\n";
        matriz += "[" + batalla[1][0] + "][" + batalla[1][1] + "][" + batalla[1][2] + "][" + batalla[1][3] + "][" + batalla[1][4] + "][" + batalla[1][5] + "][" + batalla[1][6] + "][" + batalla[1][7] + "][" + batalla[1][8] + "][" + batalla[1][9] + "]\n";
        matriz += "[" + batalla[2][0] + "][" + batalla[2][1] + "][" + batalla[2][2] + "][" + batalla[2][3] + "][" + batalla[2][4] + "][" + batalla[2][5] + "][" + batalla[2][6] + "][" + batalla[2][7] + "][" + batalla[2][8] + "][" + batalla[2][9] + "]\n";
        matriz += "[" + batalla[3][0] + "][" + batalla[3][1] + "][" + batalla[3][2] + "][" + batalla[3][3] + "][" + batalla[3][4] + "][" + batalla[3][5] + "][" + batalla[3][6] + "][" + batalla[3][7] + "][" + batalla[3][8] + "][" + batalla[3][9] + "]\n";
        matriz += "[" + batalla[4][0] + "][" + batalla[4][1] + "][" + batalla[4][2] + "][" + batalla[4][3] + "][" + batalla[4][4] + "][" + batalla[4][5] + "][" + batalla[4][6] + "][" + batalla[4][7] + "][" + batalla[4][8] + "][" + batalla[4][9] + "]\n";
        matriz += "[" + batalla[5][0] + "][" + batalla[5][1] + "][" + batalla[5][2] + "][" + batalla[5][3] + "][" + batalla[5][4] + "][" + batalla[5][5] + "][" + batalla[5][6] + "][" + batalla[5][7] + "][" + batalla[5][8] + "][" + batalla[5][9] + "]\n";
        matriz += "[" + batalla[6][0] + "][" + batalla[6][1] + "][" + batalla[6][2] + "][" + batalla[6][3] + "][" + batalla[6][4] + "][" + batalla[6][5] + "][" + batalla[6][6] + "][" + batalla[6][7] + "][" + batalla[6][8] + "][" + batalla[6][9] + "]\n";
        matriz += "[" + batalla[7][0] + "][" + batalla[7][1] + "][" + batalla[7][2] + "][" + batalla[7][3] + "][" + batalla[7][4] + "][" + batalla[7][5] + "][" + batalla[7][6] + "][" + batalla[7][7] + "][" + batalla[7][8] + "][" + batalla[7][9] + "]\n";
        matriz += "[" + batalla[8][0] + "][" + batalla[8][1] + "][" + batalla[8][2] + "][" + batalla[8][3] + "][" + batalla[8][4] + "][" + batalla[8][5] + "][" + batalla[8][6] + "][" + batalla[8][7] + "][" + batalla[8][8] + "][" + batalla[8][9] + "]\n";
        matriz += "[" + batalla[9][0] + "][" + batalla[9][1] + "][" + batalla[9][2] + "][" + batalla[9][3] + "][" + batalla[9][4] + "][" + batalla[9][5] + "][" + batalla[9][6] + "][" + batalla[9][7] + "][" + batalla[9][8] + "][" + batalla[9][9] + "]\n";
        return matriz;
    }
}//Cierre Clase
