package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000() {
    }


    @Override
    public void fire() {
        head.thinking();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
