package com.auexpress.util;


import com.auexpress.entity.SmsBatch;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by 维军 on 2016/07/24.
 */
public class NetworkLibrary {

    public String getPost(String geturl) {
        StringBuilder sb=new StringBuilder();
        String parameterData="";
        try{
            URL url=new URL(geturl);
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setUseCaches(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            urlConnection.setRequestProperty("Content-Length", String.valueOf(parameterData.length()));
            urlConnection.setRequestProperty("Accept-Charset", "utf-8");
            urlConnection.connect();
            PrintWriter out=new PrintWriter(urlConnection.getOutputStream());
            out.println(parameterData);
            out.close();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
            String inputLin="";
            while ((inputLin=bufferedReader.readLine())!=null){
                sb.append(inputLin);
            }
            bufferedReader.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

}
