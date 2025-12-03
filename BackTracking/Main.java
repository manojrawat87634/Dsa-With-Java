class Main {
    static void generateSubStr(String s) {
        if (s.length() == 3) {
            System.out.println(s);
            return;
        }
        generateSubStr(s + "A");
        generateSubStr(s + "B");
        generateSubStr(s + "C");
    }

    public static void main(String[] args) {
        generateSubStr("");
    }
}