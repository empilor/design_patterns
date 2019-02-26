package chapter.one.method.encapsulation;

public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.up();
    }

    public void undo() {
        door.down();
    }
}
