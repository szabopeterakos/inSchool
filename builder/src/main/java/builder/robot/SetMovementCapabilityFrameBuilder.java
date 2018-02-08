package builder.robot;

public class SetMovementCapabilityFrameBuilder {
    //DEFAULTS
    private byte maximumSpeed = 96;
    private byte maximumRotationSpeed = 10;
    private byte maximumAcceleration = 98;
    private byte maximumRotationalAcceleration = 8;
    private byte[] bytes = new byte[6];

    public SetMovementCapabilityFrameBuilder setMaximumSpeed(byte speed) {
        maximumSpeed = speed;
        return this;
    }

    public SetMovementCapabilityFrameBuilder setMaximumRotationSpeed(byte speed) {
        maximumRotationSpeed = speed;
        return this;
    }

    public SetMovementCapabilityFrameBuilder setMaximumAcceleration(byte acceleration) {
        maximumAcceleration = acceleration;
        return this;
    }

    public SetMovementCapabilityFrameBuilder setMaximumRotationalAcceleration(byte acceleration) {
        maximumRotationalAcceleration = acceleration;
        return this;
    }

    private byte checksum() {
        byte sum = 0;
        for (byte number : bytes) {
            sum += number;
        }
        return sum;
    }

    // Building a Frame Object
    public Frame build() {
        bytes[0] = 0x04;
        bytes[1] = maximumSpeed;
        bytes[2] = maximumRotationSpeed;
        bytes[3] = maximumAcceleration;
        bytes[4] = maximumRotationalAcceleration;
        bytes[5] = checksum();

        return new Frame(bytes);
    }

}
