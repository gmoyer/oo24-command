package headfirst.designpatterns.command.simpleremote;

public class ThermostatTempDownCommand implements Command{
    Thermostat thermostat;

    public ThermostatTempDownCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public void execute() {
        thermostat.tempDown();
    }
}
