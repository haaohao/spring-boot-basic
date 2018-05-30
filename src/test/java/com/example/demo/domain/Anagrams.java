package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams {

  public static List<String> of(String input) {
    List<String> resultList = new ArrayList<>();
    if (input.length() == 1) {
      return Arrays.asList(input);
    }
    if (input.length() == 2) {
      return Arrays.asList(input, new StringBuilder(input).reverse().toString());
    }

//    if (input.length() == 3) {
//      Set<String> set = new HashSet<>();
//      String input1 = input.substring(1);
//      List<String> stringList = Arrays.asList(input1, new StringBuilder(input1).reverse().toString());
//
////      return Arrays.asList("abc", "bac", "acb", "cba", "cab", "bca");
//    }

    return resultList;
  }
}
