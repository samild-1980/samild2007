package course1lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class CrossesZeroesApp {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scan = new Scanner(System.in);
    public static final Random RAND = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (chekWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (chekWin(DOT_O)) {
                System.out.println("Победил бот");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i],DOT_EMPTY);
            }

    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellValid(x,y));
          map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        if (map[y][x] == DOT_EMPTY)
            return true;
        return false;
    }
    public static void aiTurn() {
        int x,y;
        do {
            System.out.println("Ход бота");
        x = RAND.nextInt(SIZE);
        y = RAND.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Бот сходил в чочку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean chekWin(char simb) {
        int i,j;
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j ++) {
                if (map[0][j] == simb && map[1][j] == simb && map[2][j] == simb)
                    return true;
            }
        }
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                if (map[i][0] == simb && map[i][1] == simb && map[i][2] == simb)
                    return true;
            }
        }
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                if (map[1][1] == simb && map[2][2] == simb && map[3][3] == simb || map[2][0] == simb && map[1][1] == simb && map[0][2] == simb)
                    return true;
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i ++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

}
