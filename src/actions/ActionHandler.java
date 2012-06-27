package actions;

public interface ActionHandler {

    public boolean canHandle();

    public void handle();

}
