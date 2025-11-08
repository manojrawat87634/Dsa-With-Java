public class HashMap {
    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets = new Node[5];

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(String key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public int get(String key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return -1; // Not found
    }

    public void printAll() {
        for (int i = 0; i < buckets.length; i++) {
            Node current = buckets[i];
            while (current != null) {
                System.out.println(current.key + " = " + current.value);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("apple", 100);
        System.out.println("apple = " + map.get("apple"));
        map.printAll();
    }
}
