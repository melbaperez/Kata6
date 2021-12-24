package business;

import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();
        
    public void add(String name, ToyFactory toyFactory){
        this.toyFactories.put(name, toyFactory);
    }
    
    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy();
    }
    
}
