package builder.robot;

public class Frame {

    private byte[] byteSource;

    public Frame(byte[] bytes) {
        this.byteSource = bytes;
    }

    public byte[] getBytes() {
        return byteSource;
    }

    public String toHexString() {
        StringBuilder temp = new StringBuilder();
        for (byte c : byteSource) {
            // hexává alakítás formaterrel.
            temp.append(String.format("%02x",c).toUpperCase()).append("-");
        }

        if(byteSource.length == 0){
            return "";
        }

        return temp.substring(0,temp.length()-1);
    } //tárolt byte tömb string reprezentáció
}
