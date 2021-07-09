package test;

import model.Client;
import model.Wallet;

public class Test {
    
    public static void main(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
    }

    public void escenarioClient(){
        Client client1 = new Client("Esteban");
        boolean test1 = assertEquals("Esteban", client1.getNombre());
        //(condition)? responseTrue: responseFalse;
        System.out.println((test1)?"Paso la prueba de nombre":"Error el nombre no es igual");

        boolean test2 = assertNotNull(client1.getWallet());
        System.out.println((test2)?"Hay wallet":"Error no hay wallet");

        Wallet wallet1 = new Wallet();
        boolean test3 = assertEqualsInt(0, wallet1.getSaldo());
        System.out.println((test3)?"Saldos iguales":"Error el saldo no es igual");
    }

    public Boolean assertEquals(String expected, String received){
        if (expected.equalsIgnoreCase(received)){
            return true;
        }
        return false;
    }

    public Boolean assertNotNull(Object objeto){
        if (objeto != null){
            return true;
        }
        return false;
    }

    public Boolean assertEqualsInt(Integer expected, Integer received){
        if (expected == received){
            return true;
        }
        return false;
    }
}
