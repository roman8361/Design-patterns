package path06.homework06;

import path06.homework06.banknote.CurrencyType;

public class Main {

    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        System.out.println(bancomat.validate(CurrencyType.RUB, "450"));
    }

}
