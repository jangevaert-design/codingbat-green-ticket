public class greenTicket {
  public int greenTicket(int a, int b, int c) {
    if (a == b && b == c) {
      return 20;
    } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
      return 10;
    } else {
      return 0;
    }
  }
}
