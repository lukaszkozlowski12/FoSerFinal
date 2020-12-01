package com.example.foser;



import android.app.Activity;
import android.app.Application;

public class Aplikacja extends Application {
    //  Lukasz Kozlowski grupa 7.3/6
    private static Integer counter=0;  // te zmienne przetrwaja
    private static String napis1="";
    public static MyForegroundService aktywnosc1;


    public Aplikacja(){


        super();
        aktywnosc1=null;


    }
    public static void zapiszCounter(Integer s){
        counter=s;
    }



    public static Integer getCounter(){
        return counter;
    }

    public static void zerujCounter(){counter=0;}



}
