package path06.homework0602;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Bancomat bancomat = new Bancomat();

        System.out.println("Valid USD");
        System.out.println(bancomat.validate("100 USD"));
        System.out.println(bancomat.validate("105 USD"));
//
//        System.out.println("Valid RUB");
//        System.out.println(bancomat.validate("1000 RUB"));
//        System.out.println(bancomat.validate("1005 RUB"));
//
//        System.out.println("Valid EURO");
//        System.out.println(bancomat.validate("100 EUR"));
//        System.out.println(bancomat.validate("105 EUR"));

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        System.out.println(bancomat.getCash(value));
    }

}


