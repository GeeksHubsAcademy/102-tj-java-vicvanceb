package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimosTest {

  private Primos primos;
  
  @Before
  public void setUp() throws Exception {
    primos = new Primos();
  }

  @After
  public void tearDown() throws Exception {
    primos = null;
  }
  
  @Test public void test01 () {
    final List<Integer> result = primos.apply(1);
    assertNull(result);
  }

  @Test public void test02 () {
    final List<Integer> expected = Arrays.asList(2);
    final List<Integer> result = primos.apply(2);
    assertEquals(expected, result);
  }

  @Test public void test03 () {
    final List<Integer> expected = Arrays.asList(2,3);
    final List<Integer> result = primos.apply(3);
    assertEquals(expected, result);
  }

  @Test public void test04 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7);
    final List<Integer> result = primos.apply(10);
    assertEquals(expected, result);
  }

  @Test public void test05 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19);
    final List<Integer> result = primos.apply(20);
    assertEquals(expected, result);
  }

  @Test public void test06 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
    final List<Integer> result = primos.apply(30);
    assertEquals(expected, result);
  }

  @Test public void test07 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37);
    final List<Integer> result = primos.apply(40);
    assertEquals(expected, result);
  }

  @Test public void test08 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47);
    final List<Integer> result = primos.apply(50);
    assertEquals(expected, result);
  }

  @Test public void test09 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97);
    final List<Integer> result = primos.apply(100);
    assertEquals(expected, result);
  }

  @Test public void test10 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499);
    final List<Integer> result = primos.apply(500);
    assertEquals(expected, result);
  }

  @Test public void test11 () {
    final List<Integer> expected = Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997);
    final List<Integer> result = primos.apply(1000);
    assertEquals(expected, result);
  }

}