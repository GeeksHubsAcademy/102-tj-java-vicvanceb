package es.geekshubs.academy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primos {

  public static boolean isPrime(int number) {
    return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
  }

  /**
   * Apply Method
   * @param input
   * @return
   */
  public List<Integer> apply(final Integer input) {
    List<Integer> primeNumbers = IntStream.rangeClosed(2, input)
            .filter(Primos::isPrime).boxed().collect(Collectors.toList());

    return primeNumbers.isEmpty() ? null : primeNumbers;
  }

}
