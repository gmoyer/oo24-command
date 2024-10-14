package headfirst.designpatterns.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light l = new Light();
		LightOnCommand lightOn = new LightOnCommand(l);
		LightOffCommand lightOff = new LightOffCommand(l);
		GarageDoor gd = new GarageDoor();
		GarageDoorOpenCommand gdoc = new GarageDoorOpenCommand(gd);
		GarageDoorCloseCommand gdcc = new GarageDoorCloseCommand(gd);
		Thermostat t = new Thermostat();
		ThermostatTempDownCommand tDown= new ThermostatTempDownCommand(t);
		ThermostatTempUpCommand tUp = new ThermostatTempUpCommand(t);
		ThermostatSetTempCommand setTemp = new ThermostatSetTempCommand(t);
		RemoteControlInput remoteControlInput = new RemoteControlInput(remote);
		remote.setCommand(0,lightOn);
		remote.setCommand(1,lightOff);
		remote.setCommand(2,gdoc);
		remote.setCommand(3,gdcc);
		remote.setCommand(4,tUp);
		remote.setCommand(5,tDown);
		remote.setCommand(6,setTemp);
		remote.printOptions();
		remoteControlInput.userPress();


    }
	
}
