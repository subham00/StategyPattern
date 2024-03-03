package WithStategy;

public class OffRoadVechile extends Vechile{
    OffRoadVechile(){
        super(new SportsDriveStategy());
    }
}

