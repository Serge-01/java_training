package ru.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args){
    String [] langs = {"Java", "C#", "Python", "PHP"};
    /*String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP";*/

    /*for(int i = 0; i < langs.length; i++){
      System.out.println("I want to learn " + langs[i]);*/

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for(String l : languages){
      System.out.println("I want to learn " + l);
    }

    /*for(int i = 0; i < languages.size(); i++){
      System.out.println("I want to learn " + languages.get(i));
    }*/

    /*languages.add("Java");
    languages.add("C#");
    languages.add("Python");*/

    /*for (String l : languages){
      System.out.println("I want to learn " + l);
    }*/



  }

}
