import java.util.HashMap;
import java.util.Map;

public class ex8 {
    public static void main(String[] args) {
        String[] orders = new String[]{"123", "123", "123", "123", "1234", "1234", "12345", "12345", "123456", "123456", "123456", "123456", "1234567"};

        Map<String, Integer> countMap = new HashMap<>();

        for (String order : orders) {
            countMap.put(order, countMap.getOrDefault(order, 0) + 1);
        }

        String mostOrderedProduct = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostOrderedProduct = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Produto mais pedido: " + mostOrderedProduct + " com " + maxCount + " pedidos.");
    }
}