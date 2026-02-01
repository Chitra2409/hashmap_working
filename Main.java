public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyHashMap...");
        
        MyHashMap<String, Integer> map = new MyHashMap<>();
        
        // Test 1: Insertion
        System.out.println("Adding 'Apple' -> 10");
        map.put("Apple", 10);
        
        System.out.println("Adding 'Banana' -> 20");
        map.put("Banana", 20);
        
        System.out.println("Adding 'Mango' -> 30");
        map.put("Mango", 30);

        // Test 2: Retrieval
        System.out.println("Get 'Apple': " + map.get("Apple") + " (Expected: 10)");
        System.out.println("Get 'Banana': " + map.get("Banana") + " (Expected: 20)");

        // Test 3: Updating a value
        System.out.println("Updating 'Apple' to 15");
        map.put("Apple", 15);
        System.out.println("Get 'Apple': " + map.get("Apple") + " (Expected: 15)");

        // Test 4: Key not found
        System.out.println("Get 'Cherry': " + map.get("Cherry") + " (Expected: null)");

        // Test 5: Removal
        System.out.println("\n--- Testing Removal ---");
        
        // Remove 'Banana'
        Integer removedValue = map.remove("Banana");
        System.out.println("Removed 'Banana', value was: " + removedValue + " (Expected: 20)");
        System.out.println("Get 'Banana' after removal: " + map.get("Banana") + " (Expected: null)");
        
        // Remove 'Apple' (Head of a bucket potentially)
        map.remove("Apple");
        System.out.println("Removed 'Apple'. Get 'Apple': " + map.get("Apple") + " (Expected: null)");

        // Remove something that doesn't exist
        Integer ghost = map.remove("Ghost");
        System.out.println("Removing 'Ghost': " + ghost + " (Expected: null)");
        
        System.out.println("Current Size: " + map.size()); 
    }
}