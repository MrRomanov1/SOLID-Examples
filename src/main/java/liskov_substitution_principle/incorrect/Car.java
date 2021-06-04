package liskov_substitution_principle.incorrect;

class Car extends Transportation {
    @Override
    void startEngine() {}
}
