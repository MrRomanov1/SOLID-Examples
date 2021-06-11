package interface_segregation_principle.correct;

class HumanWorker implements Worker, Break {
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
