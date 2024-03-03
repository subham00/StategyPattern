package WithStategy;

public class Vechile {
    DriveStategy driveStategy;
    // constructer injection
    Vechile(DriveStategy driveobj){
        this.driveStategy = driveobj;
    }
    public void drive(){
        driveStategy.drive();
    }
}
