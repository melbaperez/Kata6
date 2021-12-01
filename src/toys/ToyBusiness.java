package toys;

import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator generator =  new SerialNumberGenerator();

    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;   
        }
        
    }
    
}
