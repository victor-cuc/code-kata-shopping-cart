import java.util.HashMap;
import java.util.Map;

class Checkout {
    // input when running "java Checkout"
    // e.g. "java Checkout A A B A"
    public static void main(String[] args) {
        HashMap<String, Integer> counts = new HashMap<>();
        int total = 0;

        for (String item : args) {
            item = item.toUpperCase();
            int count = counts.containsKey(item) ? counts.get(item) : 0;
            counts.put(item, count + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getKey().equals("A")) {
                total += ((entry.getValue() / 3) * 130 + (entry.getValue() % 3) * 50);
            } else if (entry.getKey().equals("B")) {
                total += ((entry.getValue() / 2) * 37 + (entry.getValue() % 2) * 30);
            } else if (entry.getKey().equals("C")) {
                total += (entry.getValue() * 20);
            } else if (entry.getKey().equals("D")) {
                total += (entry.getValue() * 10);
            }
        }
        System.out.println(total);
    }
}