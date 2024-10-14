package headfirst.designpatterns.command.simpleremote;

import java.util.Scanner;

public class RemoteControlInput {
    Scanner scanner;
    SimpleRemoteControl remote;
    public RemoteControlInput(SimpleRemoteControl remote){
        scanner = new Scanner(System.in);
        this.remote = remote;
    }

    public void userPress(){
        System.out.println("Enter row for mapping: ");
        int row = scanner.nextInt();
        remote.buttonWasPressed(row);
    }
}
