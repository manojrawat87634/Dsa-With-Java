package topics.inorder;

import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

class Graph {
    class Pair {
        String node;
        int weight;

        Pair(String n, int w) {
            this.node = n;
            this.weight = w;
        }

    }

    private Map<String, List<Pair>> graph = new HashMap<>();

    public void addEdge(String u, String v, int w) {
        graph.putIfAbsent(v, new ArrayList<>());
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Pair(v, w));
        graph.get(v).add(new Pair(u, w));
    }

    public void printGraph() {
        if (graph.isEmpty()) {
            return;
        }
        for (String node : graph.keySet()) {
            System.out.print(node + ": ");
            for (Pair P : graph.get(node)) {
                System.out.print("( " + P.node + ", " + P.weight + " )");
            }
            System.out.println();
        }
    }

    public void inorder(String start) {
        Queue<String> q = new LinkedList<>();
        Map<String, Boolean> v = new HashMap<>();
        q.add(start);
        v.put(start, true);
        while (!q.isEmpty()) {
            String node = q.poll(); // current node
            System.err.print(node);
            for (Pair i : graph.get(node)) {
                if (!v.getOrDefault(i.node, false)) {
                    q.add(i.node);
                    v.put(i.node, true);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("A", "D", 4);
        g.addEdge("A", "E", 4);
        g.addEdge("A", "C", 3);
        g.addEdge("D", "E", 2);
        g.addEdge("C", "E", 4);
        g.addEdge("C", "G", 5);
        g.addEdge("C", "B", 2);
        g.addEdge("C", "F", 5);
        g.addEdge("G", "F", 5);
        g.addEdge("F", "E", 1);

        // g.printGraph();
        g.inorder("A");
    }
}