package org.example;

public class Main {
    public static void main(String[] args) {
        //Problem 1
        AmericanPowerPlug americanPlug = new AmericanPowerPlugImpl();
        EuropeanPowerSocket europeanSocket = new PowerPlugAdapter(americanPlug);
        europeanSocket.plugInEuropeanSocket();
    }
}