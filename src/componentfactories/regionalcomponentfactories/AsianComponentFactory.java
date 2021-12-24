package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;
import toyproduct.components.asian.*;

public class AsianComponentFactory implements ComponentFactory{

    @Override
    public Wheel createWheel() {
        System.out.println("...Created Asian Wheel");
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        System.out.println("...Created Asian Engine");
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        System.out.println("...Created Asian Rotor Blade");
        return new AsianRotorBlade();
    }

}
