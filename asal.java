package Giris;
import java.util.Scanner;
public class asal {
    public static void main(String[] args) {

        for(int i=2; i<=100; i++){
            boolean isAsal = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    isAsal = false;
                }
            }
            if(isAsal)
                System.out.print(i+"- ");





    }


        }

