class MyCustomHashMap {
    private class Node {
        String key;
        int value;
        Node next;
        Node(String key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }         
    }
      Node [] buckets = new Node[5];
        private int getIndex(String key){
            return Math.abs(key.hashCode()) % buckets.length;
        };

        public void put (String key, int value){
            int index = getIndex(key);
            Node head = buckets[index];


            // Colision 
            while (head != null) {
                if (head.key.equals(key)){
                    head.value = value;
                    return;
                }
                head = head.next;
            }

            Node newNode = new Node(key, value);
            newNode.next = buckets[index];
            buckets[index] = newNode;
        }

        public int get(String key){
            int index = getIndex(key);
            Node head = buckets[index];
            while (head != null) {
                if (head.key.equals(key)){
                    return head.value;
                }                
                head = head.next;
            }
            return -1;
        }
}

public class MyHashMap {
    public static void main(String[] args) {
        MyCustomHashMap data = new MyCustomHashMap();
       data.put("manoj", 1343);
       data.put("abc", 23123);
       data.put("xyz", 4534);
       System.out.println(data.get("abc"));
       System.out.println(data.get("manoj"));
       System.out.println(data.get("sadf"));
       System.out.println(data.get("xyz"));
    }
}
