package creationalDesignPatterns.PrototypePattern;

import java.util.List;

public class Robot implements Cloneable {
    private int ID;
    private List<String> features;
    private Component component;

    public Robot(int ID, List<String> features, Component component) {
        this.ID = ID;
        this.features = features;
        this.component = component;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    protected Robot clone() {
        try {
            return (Robot) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
