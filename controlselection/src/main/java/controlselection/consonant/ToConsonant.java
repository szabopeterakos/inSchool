package controlselection.consonant;

public class ToConsonant {

    public char convertToConsonant(char ch) {
        switch (ch) {

            case 'a':
                return 'b';
            case 'e':
                return 'f';
            case 'i':
                return 'j';
            case 'o':
                return 'p';
            case 'u':
                return 'v';
            default:
                return ch;
        }
    }


}
