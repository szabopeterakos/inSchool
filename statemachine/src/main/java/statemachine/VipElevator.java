package statemachine;

public enum VipElevator {

    FLOOR_OPEN{VipElevator justNext() {return VipElevator.FLOOR_CLOSED;}},
    FLOOR_CLOSED{VipElevator justNext() {return VipElevator.CEIL_OPEN;}},
    CEIL_OPEN{VipElevator justNext() {return VipElevator.CEIL_CLOSED;}},
    CEIL_CLOSED{VipElevator justNext() {return VipElevator.FLOOR_OPEN;}};


    abstract VipElevator justNext();

}
