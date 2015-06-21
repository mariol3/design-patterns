package it.mario.simuduck;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public abstract class Duck {

    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swim swim");
    }

    public abstract void display();

    public void fly() {
        System.out.println("Flying!");
    }

}
