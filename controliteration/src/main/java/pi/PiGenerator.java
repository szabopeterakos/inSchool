package pi;

import java.math.BigDecimal;

public class PiGenerator {

    public BigDecimal getPi(){
        String poem = "Nem a régi s durva közelítés mi szótól szóig így kijön betűiket számlálva Ludolph eredménye már ha itt végezzük húsz jegyen De rendre kijő még tíz pontosan Azt is bízvást ígérhetem ";
        int count = 0;
        String out = "";
        BigDecimal result;
        for (int i = 0; i < poem.length(); i++){
            char firstLetter = poem.charAt(i);
            if(out.length() == 1){
                out += ".";
                i--;
            }else{
                if((Character.isLetter(firstLetter))){
                    count++;
                }else{
                    out += count;
                    count = 0;
                }
            }
        }
        result = new BigDecimal(out);
        return result;
    }


}
