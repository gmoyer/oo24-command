package headfirst.designpatterns.command.simpleremote;

public class Thermostat {
    public int temp = 70;
    public void tempUp(){
        temp++;
        System.out.println("temp = " + temp);
    }
    public void tempDown(){
        temp--;
        System.out.println("temp = " + temp);
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("Temp = "+ temp);
    }
}
