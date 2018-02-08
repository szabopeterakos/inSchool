package packages.string;

public class StringConcat {

    public String concatA(String str01, String str02) {
        return str01.concat(str02); // concat is egy metódus
    }
    // ez pl jó tesztelésnek, de nem teszt eset
    public static void main(String[] args) {
        // önmagát példányosítom
        StringConcat sc = new StringConcat();// control + space ; az sc lesz az azonosítója
        //balja változót definiálok; jobbra létrehozok egy objektumot; létrehoztam egy példányt hogy static-módban is látható legyen a StringConcat
        String temp = sc.concatA("víí", " de\njó");
        System.out.println(temp);

        System.out.println();
    }
}
