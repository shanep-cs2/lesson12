package lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String>  results = NameAge.parse(scnr);
        for(String s : results){
            System.out.println(s);
        }
    }
}
