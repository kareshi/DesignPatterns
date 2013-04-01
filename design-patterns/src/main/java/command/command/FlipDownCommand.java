package command.command;

import command.receiver.Light;

public class FlipDownCommand implements Command {

    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
