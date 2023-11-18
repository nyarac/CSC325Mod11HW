package org.example;

interface AmericanPowerPlug {
    void plugInAmericanSocket();
}

interface EuropeanPowerSocket {
    void plugInEuropeanSocket();
}

class AmericanPowerPlugImpl implements AmericanPowerPlug {
    @Override
    public void plugInAmericanSocket() {
        System.out.println("Plug in American socket");
    }
}

class EuropeanPowerSocketImpl implements EuropeanPowerSocket {
    @Override
    public void plugInEuropeanSocket() {
        System.out.println("Plug in European socket");
    }
}

