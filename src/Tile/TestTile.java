package Tile;

import java.util.Scanner;


class TestTile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the tile: ");
        int tileLength = sc.nextInt();

        Tile t = new Tile(tileLength);

        System.out.println("Enter the length and width of Floor: ");
        int fLength = sc.nextInt();
        int fWidth = sc.nextInt();
        Floor f = new Floor(fLength, fWidth);

        f.totalTiles(t);

    }
}
