package headfirst.designpatterns.command.simpleremote;

public class ThermostatTempUpCommand implements Command{
    Thermostat thermostat;

    public ThermostatTempUpCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.tempUp();
    }
}
