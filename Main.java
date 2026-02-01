public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyHashMap...");
        
        MyHashMap<String, Integer> map = new MyHashMap<>();
        
        // Test 1: Insertion
        System.out.println("Adding 'Apple' -> 10");
        map.put("Apple", 10);
        
        System.out.println("Adding 'Banana' -> 20");
        map.put("Banana", 20);

        // Test 2: Retrieval
        Integer appleValue = map.get("Apple");
        System.out.println("Get 'Apple': " + appleValue + " (Expected: 10)");

        Integer bananaValue = map.get("Banana");
        System.out.println("Get 'Banana': " + bananaValue + " (Expected: 20)");

        // Test 3: Updating a value
        System.out.println("Updating 'Apple' to 15");
        map.put("Apple", 15);
        System.out.println("Get 'Apple': " + map.get("Apple") + " (Expected: 15)");

        // Test 4: Key not found
        System.out.println("Get 'Cherry': " + map.get("Cherry") + " (Expected: null)");
    }
}
