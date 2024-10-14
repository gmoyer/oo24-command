package headfirst.designpatterns.command.simpleremote;

import java.util.Scanner;

public class ThermostatSetTempCommand implements Command{
    Thermostat thermostat;

    public ThermostatSetTempCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new temp: ");
        int userInput = scanner.nextInt();
        thermostat.setTemp(userInput);
    }
}
