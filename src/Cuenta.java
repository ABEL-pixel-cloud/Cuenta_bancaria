import java.util.Random;


public class Cuenta {
    Random random = new Random();

    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta() {

    }

    public Cuenta(double saldoDeCuenta, String nombreDelTitular) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta=(long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;;

    }

    public void setIngreso(double ingreso){
        this.saldoDeCuenta+=ingreso;

    }
    public void setRetiro(double retiro){
        if (retiro > this.saldoDeCuenta ){
            System.out.println("no se puede retirar dinero");

        } else {
            this.saldoDeCuenta-=retiro;

        }
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "El titular de la cuenta es"+" : " + nombreDelTitular +" : "+"Saldo de la cuenta"+" : "+saldoDeCuenta+" : "+"Numnero de cuenta es"+" : "+numeroDeCuenta;
    }

}
