package com.fju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Json {
    public String taipeiActivity() {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStayEn.aspx");
            URLConnection connection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine = null;
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
