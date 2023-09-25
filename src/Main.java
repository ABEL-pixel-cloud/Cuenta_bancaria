import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();

        Cuenta cuenta1 = new Cuenta(saldoInicial, titular);

        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta1.getDatosCuenta());

        int opcion;
        do {
            System.out.println("ingresar la opcion ");
            System.out.println("1: retirar dinero de la cuenta");
            System.out.println("2: Ingresar dinero a la cuenta");
            System.out.println("3: ver informacion de la cuenta");
            System.out.println("4: salir ");
            opcion = sc.nextInt();

            if (opcion==1){
                System.out.print("Ingrese la cantidad a retirar: ");
                double cantidadRetiro = sc.nextDouble();
                cuenta1.setRetiro(cantidadRetiro);
                System.out.println("Saldo de la cuenta : " + cuenta1.getSaldoDeCuenta());


            } else if (opcion==2) {
                System.out.print("Ingrese la cantidad de dinero a la cuenta: ");
                double cantidadIngreso = sc.nextDouble();
                cuenta1.setIngreso(cantidadIngreso);
                System.out.println("Saldo de la cuenta  " + cuenta1.getSaldoDeCuenta());


            } else if (opcion==3) {
                System.out.println("Datos de la cuenta:");
                System.out.println(cuenta1.getDatosCuenta());

            } else if(opcion>=5 || opcion<=0){
                System.out.println("no existe esa  opcion ");
            }

        } while (opcion != 4);


        // Cierra el scanner al finalizar
        sc.close();

        //Cuenta cuenta1=new Cuenta(10000.1,"abelardo");
        //cuenta1.getDatosCuenta();
        //System.out.println(cuenta1.getDatosCuenta());
        //cuenta1.setRetiro(1000);
        //System.out.println(cuenta1.getSaldoDeCuenta());
        //cuenta1.setIngreso(2000);
        //System.out.println(cuenta1.getSaldoDeCuenta());


    }
}