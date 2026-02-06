public class Main {

    static void normalFunc(){
        System.out.println("This is a function");
    }

    static int sum_num(int a, int b){
        return a + b;
    }
    
    public static void main(String [] args){
        normalFunc();
        int res = sum_num(4, 6);
        System.out.println(res);
    }
}