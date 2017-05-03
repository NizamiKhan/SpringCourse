package start;

import impls.sony.SonyHand;
import impls.sony.SonyLeg;
import impls.toshiba.ToshibaHead;
import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;

public class Robot {

    public static void main(String[] args) {

        Hand hand = new SonyHand();
        Head head = new ToshibaHead();
        Leg leg = new SonyLeg();

        RobotConstructor robot = new RobotConstructor(head, hand, leg);
        robot.action();
    }
}
