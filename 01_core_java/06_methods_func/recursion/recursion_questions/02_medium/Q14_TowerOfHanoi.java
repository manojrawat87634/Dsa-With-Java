public class Q14_TowerOfHanoi {

    static void toh(int n, char src, char aux, char dest) {
        if (n == 0) return;

        toh(n - 1, src, dest, aux);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        toh(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }
}
