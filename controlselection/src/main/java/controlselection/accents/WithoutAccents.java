package controlselection.accents;

public class WithoutAccents {

    public char convertToCharWithoutAccents(char ch) {
        switch (ch) {
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'í':
                return 'i';
            case 'ó':
                return 'o';
            case 'ú':
                return 'u';
            case 'ű':
                return 'u';
            case 'ő':
                return 'ö';
            case 'Á':
                return 'A';
            case 'É':
                return 'E';
            case 'Í':
                return 'I';
            case 'Ó':
                return 'O';
            case 'Ú':
                return 'U';
            case 'Ű':
                return 'U';
            case 'Ő':
                return 'Ö';
            default:
                return ch;
        }
    }

}
