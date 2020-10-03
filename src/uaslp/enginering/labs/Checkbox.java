package uaslp.enginering.labs;

/** This class also has extends because is a subclass of Control **/
public class Checkbox extends Control{
    private String label;

    public Checkbox(String label) {
        this.label = label;
    }

    public void draw() {
        System.out.print(label);
    }
}
