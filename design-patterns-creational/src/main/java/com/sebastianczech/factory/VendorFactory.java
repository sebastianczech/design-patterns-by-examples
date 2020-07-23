package com.sebastianczech.factory;

import com.sebastianczech.model.Vendor;

public abstract class VendorFactory {

    private static final FactoryCisco factoryCisco = new FactoryCisco();
    private static final FactoryJuniper factoryJuniper = new FactoryJuniper();
    private static final FactoryNokia factoryNokia = new FactoryNokia();

    public static VendorFactory getFactory(Vendor vendor) {
        VendorFactory factory = null;
        switch (vendor) {
            case Cisco:
                factory = factoryCisco;
                break;
            case Juniper:
                factory = factoryJuniper;
                break;
            case Nokia:
                factory = factoryNokia;
                break;
        }
        return factory;
    }
}