package statemachine;

/**
 * az állapotok az enum elemeiként vannak felvéve
 * metódus az enum elemeinek szintjén van deklarálva.
 */
public enum TrafficLights {

    RED {
        TrafficLights next() {
            return TrafficLights.RED_YELLOW; // visszatérési értéke a következő állapot
        }
    },
    RED_YELLOW {
        TrafficLights next() {
            return TrafficLights.GREEN;
        }
    },
    GREEN {
        TrafficLights next() {
            return TrafficLights.YELLOW;
        }
    },
    YELLOW {
        TrafficLights next() {
            return TrafficLights.RED;
        }
    };


    abstract TrafficLights next(); // nincsen inmplementációja megadva enum szinten, ez csak egy metódus fejléc, itt nincs törzse
    // e miatt az enum értékekben a ext metódust kötelező deklarálni.
    // az abstract metódus nlkül nem is forgul le .

}
