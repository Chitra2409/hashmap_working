public class MyHashMap<K, V> {
    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 0;
    private Node<K, V>[] buckets;

    public MyHashMap() {
        this.buckets = new Node[4];
        this.size = 0;
    }

    private int getBucketIndex(K key) {
        int hc = key.hashCode();

        int index = Math.abs(hc) % buckets.length;
        return index;
    }

    public void put(K key, V value) {
        int bi = getBucketIndex(key);
        Node<K, V> head = buckets[bi];

        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[bi];
        buckets[bi] = newNode;
        size++;
    }
    public V get(K key){
        int bi= getBucketIndex(key);
        Node<K,V> current = buckets[bi];

        while(current !=null){
            if(current.key.equals(key)){
                return current.value;
            }
            current= current.next;
        }
        return null;
    }
}