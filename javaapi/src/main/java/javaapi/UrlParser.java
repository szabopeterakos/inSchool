package javaapi;

import java.net.MalformedURLException;
import java.net.URL;
//
//public class UrlParser {
//    public String readHost(String url){
//    URL xx = new URL(url);
//
//    }
//}


public class UrlParser {
    public String readHost(String url) {
        URL xx;
        try {
            xx = new URL(url);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + url);
        }
        return xx.getHost();
    }
}
