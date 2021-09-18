import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenish = 1999;
        int bonus;
        {
            if (replenish <= 1000) {
                bonus = 0;
            } else {
                bonus = replenish / 100;
            }
        }
        int replenishmentaccount = account + replenish + bonus;
        System.out.println("На вашем счету " + replenishmentaccount + " рублей");
        System.out.println("Из них, Вам начислено " + bonus + " бонусных рублей.");

    }

}
