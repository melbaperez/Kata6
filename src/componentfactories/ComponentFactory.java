package componentfactories;

import toyproduct.components.*;

public interface ComponentFactory {
    Wheel createWheel();
    Engine createEngine();
    RotorBlade createRotorBlade();
}
