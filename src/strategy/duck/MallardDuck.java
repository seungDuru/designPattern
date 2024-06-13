package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리 입니다.");
    }

    public void swim() {
        System.out.println("물에 살아서 수영을 아주 잘합니다.");
    }
}
