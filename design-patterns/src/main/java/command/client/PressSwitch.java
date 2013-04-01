package command.client;

import command.command.Command;
import command.command.FlipDownCommand;
import command.command.FlipUpCommand;
import command.invoker.Switch;
import command.receiver.Light;

public class PressSwitch {
    public static void main(String[] args){
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch s = new Switch();

        try {
            if (args[0].equalsIgnoreCase("ON")) {
                s.execute(switchUp);
            }
            else if (args[0].equalsIgnoreCase("OFF")) {
                s.execute(switchDown);
            }
            else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}
