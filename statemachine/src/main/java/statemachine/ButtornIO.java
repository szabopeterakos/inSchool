package statemachine;

public enum ButtornIO {

    ON {
        ButtornIO switcher() {
            return ButtornIO.OFF;
        }
    },

    OFF {
        ButtornIO switcher() {
            return ButtornIO.ON;
        }
    };

    abstract ButtornIO switcher();

}
