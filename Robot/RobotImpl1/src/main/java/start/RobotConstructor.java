package start;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;

public class RobotConstructor {

    private Head head;
    private Hand hand;
    private Leg leg;

    public RobotConstructor(Head head, Hand hand, Leg leg) {

        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }


    public void action() {

        head.thinking();
        hand.catchSomething();
        leg.go();
    }
}
