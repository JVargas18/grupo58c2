package views;
import java.io.IOException;

import model.Wallet;

public class Vista {
    
    public static void main2(String[] args) {
        
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Wallet wallet1 = new Wallet();
            Wallet wallet2 = new Wallet();
            System.out.println(wallet1.saveMoney(200000));
            System.out.println(wallet1.saveMoney(300000));
            System.out.println(wallet1.breakLimit());
            System.out.println(wallet1.saveMoney(600000));
            System.out.println(wallet1.getSaldo());
            System.out.println(wallet2.getSaldo()); 
        } catch (Exception e) {
            /*No hacer nada*/
        }
        
    }
}
