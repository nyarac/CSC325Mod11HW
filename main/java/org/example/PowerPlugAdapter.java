package org.example;

// Adapter class
class PowerPlugAdapter implements EuropeanPowerSocket {
    private AmericanPowerPlug americanPlug;

    public PowerPlugAdapter(AmericanPowerPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugInEuropeanSocket() {
        System.out.println("Adapter: Converting American plug to fit European socket");
        americanPlug.plugInAmericanSocket();
    }
}
