package interface_segregation_principle.incorrect;

class HumanWorker implements Worker {
    @Override
    public void work() {
        //works
    }
    @Override
    public void eat() {
        //eats
    }
    @Override
    public void drink() {
        //drinks
    }
    @Override
    public void goHome() {
        //goes home
    }
}
