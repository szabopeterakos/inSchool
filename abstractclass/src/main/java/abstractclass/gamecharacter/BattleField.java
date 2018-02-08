package abstractclass.gamecharacter;

public class BattleField {

    int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }

        return false;
    }

//    private boolean oneHit(Character attacker, Character defender) {
//        if (attacker.isAlive() && defender.isAlive()) {
//            attacker.primaryAttack(defender);
//            attacker.secondaryAttack(defender);
//            return true;
//        }
//
//        return false;
//    }

    public Character fight(Character one, Character other) {
        Character winner = one;

        while (one.isAlive() && other.isAlive()) {
            if (getRound() % 2 == 0) {
                oneHit(one, other);
                round = round + 1;
                if (!other.isAlive()) {
                    winner = one;
                }
            } else if (!(getRound() % 2 == 0)) {
                oneHit(other, one);
                round = round + 1;
                if (!one.isAlive()) {
                    winner = other;
                }
            }

        }
        return winner;
    }

//    public Character fight(Character one, Character other) {
//        Character winner = null;
//        do {
//            if (round % 2 == 0) {
//                oneHit(one, other);
//                round++;
//                if (!other.isAlive()) {
//                    winner = one;
//                }
//            } else {
//                oneHit(other, one);
//                round++;
//                if (!one.isAlive()) {
//                    winner = other;
//                }
//            }
//        } while(one.isAlive() && other.isAlive());
//        return winner;
//    }


}
