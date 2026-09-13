import java.util.*;

class TernaryOperator {
  public static void main(String[] args) {
    int x = 11;
    int y = 14;
    int result = (x > y) ? x : ( x > 15 ? y : x);

    System.out.println(result);
  }
}
