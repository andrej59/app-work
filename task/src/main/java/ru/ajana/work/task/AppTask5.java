package ru.ajana.work.task;

public class AppTask5 {

    private enum Currency {USD, AUD, GBP, EURO}


    public static void main(String[] args) {

        String usd = "USD";

        //Enum to String using Enum.valueOf()
        Enum currency = Enum.valueOf(Currency.class, usd);

        //Enum to String using Currency.valueOf()
        currency = Currency.valueOf(usd);

        System.out.println("String to Enum Example : " + currency);


    }
}
