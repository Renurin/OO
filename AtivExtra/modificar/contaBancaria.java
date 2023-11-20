package modificar;

public class contaBancaria {
    private float saldo;

    public contaBancaria(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float deposito){
        this.saldo += deposito;
    }
}
