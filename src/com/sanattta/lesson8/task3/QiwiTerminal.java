package com.sanattta.lesson8.task3;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String address) {
        super(address);
        owner = Owner.QIWI;
        tax = 7;
        noTaxLimit = 1000;
    }

}
