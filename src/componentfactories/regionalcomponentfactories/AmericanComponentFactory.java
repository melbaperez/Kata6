package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;
import toyproduct.components.american.*;

public class AmericanComponentFactory implements ComponentFactory{

    @Override
    public Wheel createWheel() {
        System.out.println("...Created American Wheel");
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        System.out.println("...Created American Engine");
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        System.out.println("...Created American Rotor Blade");
        return new AmericanRotorBlade();
    }

}
