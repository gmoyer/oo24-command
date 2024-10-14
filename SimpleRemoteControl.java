package headfirst.designpatterns.command.simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command[] slots = new Command[10];
 
	public SimpleRemoteControl() {}
 
	public void setCommand(int row, Command command) {
		slots[row]= command;
	}
 
	public void buttonWasPressed(int row) {
		slots[row].execute();
	}

	public void printOptions(){
		for(int i = 0; i < slots.length; i++){
			System.out.println(i + ": " + slots[i]);
		}
	}
}
