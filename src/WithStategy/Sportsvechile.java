package WithStategy;

public class Sportsvechile extends Vechile{
    public Sportsvechile(){
        super(new SportsDriveStategy());
    }
}
