package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 오리 모형입니다.");
    }

    public void swim() {
        System.out.println("모형이라서 수영할 수 없습니다.");
    }
}
