package interface_segregation_principle.incorrect;

class RobotWorker implements Worker {
    @Override
    public void work() {
        //works
    }
    @Override
    public void eat() {
        //nothing happens
    }
    @Override
    public void drink() {
        //nothing happens
    }
    @Override
    public void goHome() {
        //nothing happens
    }
}
