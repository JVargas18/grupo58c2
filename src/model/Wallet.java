package model;

public class Wallet {

    public static final int CAPACIDAD_MAXIMA = 1000000;

    private int saldo;
    private boolean tieneLimite;
    private int meta;

    public Wallet() {
        super();
        this.saldo = 0;
        this.tieneLimite = true;
        this.meta = 0;
    }
    
    public int getSaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public int getMeta(){
        return meta;
    }

    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }

    public void setMeta(int newMeta){
        this.meta = newMeta;
    }

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
        saldo += value;
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value){
        
        if (saldo < value){
            return "Saldo insuficiente" ;
        }
        saldo -= value;
        return "Transacción exitosa, nuevo saldo " + saldo;
    }

    public String breakLimit(){
        if (!tieneLimite){
            return "Tu cuenta no tiene límites";
        }
        if (saldo >= 10000)  {
            saldo -= 10000;
            setTieneLimite(false);
            return "Transacción exitosa, has roto los límites, nuevo saldo" + saldo;
        }
        return "Saldo insuficiente" ;
    }

    public boolean establerMeta(int value){
        if (value == 0){
            setMeta(value);
            return true;
        }
        if (value < 0 || value <= saldo || value >= CAPACIDAD_MAXIMA && tieneLimite){
            return false;
        }
        setMeta(value);
        return true;
    }

    public boolean verificarMeta(){
        if (this.meta == 0 || this.meta > this.saldo){
            return false;
        }
        return true;
    }

    public String compararCuenta(Wallet otraWallet){
        if (saldo == otraWallet.getSaldo()){
            return "Las cuentas tienen mismo saldo";
        }
        if (saldo > otraWallet.getSaldo()){
            return "La primera cuenta es mayor.";
        }
        return "La segunda cuenta es mayor";
    }
}
