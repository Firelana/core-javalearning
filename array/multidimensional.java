import java.util.Scanner;

public class multidimensional {
    public static void main(String[] args) {
    int room [][] = {
        {101, 102, 103},
        {201, 202, 203},
        {301, 302, 303}
    };
    for (int i = 0; i < room.length; i++) {
        for (int j = 0; j < room.length; j++) {
        System.out.println("Room Number: " + room[i][j]+ "\t"); 
        }
    }
    }
}
