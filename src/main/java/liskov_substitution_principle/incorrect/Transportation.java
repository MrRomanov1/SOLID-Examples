package liskov_substitution_principle.incorrect;

public class Transportation {
    String name;
    Engine engine;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine() {
        //wutututututu code here
    }
}
