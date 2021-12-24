package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;

public class AmericanSubmarineToyFactory extends ToyFactory {
    
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanCarToy(serialNumber);
        
    }
    
    

}
