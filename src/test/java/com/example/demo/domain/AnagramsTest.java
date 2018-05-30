package com.example.demo.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class AnagramsTest {

  @Test
  public void should_return_empty_list_given_empty_string() throws Exception {
    List<String> result = Anagrams.of("");
    assertThat(result.size()).isEqualTo(0);
  }

  @Test
  public void should_return_list_a_given__a() throws Exception {
    List<String> result = Anagrams.of("a");
    assertThat(result).isEqualTo(Arrays.asList("a"));
  }

  @Test
  public void should_return_list_b_given__b() throws Exception {
    List<String> result = Anagrams.of("b");
    assertThat(result).isEqualTo(Arrays.asList("b"));
  }

  @Test
  public void should_return_list_ab_ba_given__ab() throws Exception {
    List<String> result = Anagrams.of("ab");
    assertThat(result).isEqualTo(Arrays.asList("ab", "ba"));
  }

  @Test
  public void should_return_list_kz_zk_given__ab() throws Exception {
    List<String> result = Anagrams.of("ab");
    assertThat(result).isEqualTo(Arrays.asList("ab", "ba"));
  }

//  @Test
//  public void should_return_list_abc_and_so_on_given_abc() throws Exception {
//    List<String> result = Anagrams.of("abc");
//    assertThat(result).isEqualTo(Arrays.asList("abc", "bac", "acb", "cba", "cab", "bca"));
//  }

//  @Test
//  public void should_return_list_def_and_so_on_given_def() throws Exception {
//    List<String> result = Anagrams.of("def");
//    assertThat(result).isEqualTo(Arrays.asList("def", "dfe", "edf", "efd", "fde", "fed"));
//  }
}
