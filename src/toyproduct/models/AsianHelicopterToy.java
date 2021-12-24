package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;

public class AsianHelicopterToy implements Toy{
    private final Integer serialNumber;
    final String type = "helicopter";
    final ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();        
    }
    
    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public String getType() {
        return this.type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling %s '%d'\n", this.type, this.serialNumber); 
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    

}
