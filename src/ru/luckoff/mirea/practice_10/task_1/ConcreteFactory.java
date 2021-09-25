package ru.luckoff.mirea.practice_10.task_1;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex CreateComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}
