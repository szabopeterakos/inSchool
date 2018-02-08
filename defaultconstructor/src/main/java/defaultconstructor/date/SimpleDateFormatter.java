package defaultconstructor.date;

public class SimpleDateFormatter {

    public String formatDateString(SimpleDate simpleDate){
        return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        String out = "";

        if(countryCode.toString().equals("HU")){
            out = simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
        }
        if(countryCode.toString().equals("EN")){
            out = simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+simpleDate.getYear();

        }
        if(countryCode.toString().equals("US")){
            out = simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
        }
        return out;
    }

}
