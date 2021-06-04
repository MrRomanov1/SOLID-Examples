package liskov_substitution_principle.correct;

class DevicesWithEngines extends Transportation
{
    Engine engine;

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
