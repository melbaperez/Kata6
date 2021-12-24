package factories;

class SerialNumberGenerator {
    private Integer serialNumber = 0;
    private static SerialNumberGenerator instance = null;

    private SerialNumberGenerator(){
        
    }
    
    public static SerialNumberGenerator getInstance(){
        if (instance == null){
            instance = new SerialNumberGenerator();
        }
        return instance;
    }
        
    public Integer next(){
        return this.serialNumber++;
    }

}
