package toys;

public class Car {
    private final Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    

    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    
    public void pack(){
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Labelling car '%d'\n", this.serialNumber); 
    }
    

}
