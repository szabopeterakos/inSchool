package builder.robot;

public class MoveFrameBuilder {
    private byte[] byteSource = {125, 0, 0, 0, 0, 0};

    public MoveFrameBuilder setXSpeed(byte x) {
        if (x < 127 || x > -127) {
            byteSource[1] = x;
        }
        return this;
    }

    public MoveFrameBuilder setYSpeed(byte y) {
        if (y < 127 || y > -127) {
            byteSource[2] = y;
        }
        return this;
    }

    public MoveFrameBuilder setRotationSpeed(byte r) {
        if (r > -1 || r < 124) {
            byteSource[3] = r;
        }
        return this;
    }

    public MoveFrameBuilder setMaximumSpeed(byte max) {
        if(max < 128){
            byteSource[4] = max;
        }
        return this;
    }

    private byte checksum() {
        byte sum = 0;
        for (byte c : byteSource) {
            sum += c;
        }
        byteSource[5] = sum;
        return sum;
    }

    public Frame build() {
        checksum();
        return new Frame(byteSource);
    }

}
