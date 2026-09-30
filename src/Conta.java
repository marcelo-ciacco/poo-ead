public abstract class Conta {

    private String agencia;
    private String numero;
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public abstract String exibirDados();

}
