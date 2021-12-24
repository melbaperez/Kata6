package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;

public class AmericanSubmarineToy implements Toy{
    private final Integer serialNumber;
    final String type = "submarine";
    final ComponentFactory factory;
    private Engine engine;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
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
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    

}
