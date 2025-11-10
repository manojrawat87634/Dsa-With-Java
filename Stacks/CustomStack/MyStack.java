public class MyStack {
    int size = 100;
    String[] arr = new String[size];
    int top = -1;
    public void push(String p){
        if (size <= top + 1){
            System.out.println("Stack overflow");
            return;
        } 

        arr[++top] = p;
    }

    public void pop(){
        if (top == -1){
            System.out.println("List is empty");
            return;
        }
        top--;
    }
    public String peek(){
        if (top == -1){
            return "Nothing Here";
        }
        return arr[top];
    }

    public void printList(){
        System.out.print("[ ");
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i] );
            System.out.print(", " );
        }
        System.out.print(" ]");
    }
        public static void main(String args[]){
        MyStack data = new MyStack();
        data.pop();
        for (int i = 0; i <= 99; i++){
            data.push("Data " + i);
        }
        data.push("Data 99");
        // data.push("Data 100");
        data.pop();
        System.out.println(data.peek());
        data.printList();
    }
}




























// class MyStack {
//     int maxSize = 100;
//     int[] arr = new int[maxSize];
//     int top = -1;

//     public void push(int x) {
//         if (top == maxSize - 1) {
//             System.out.println("Stack Overflow");
//             return;
//         }
//         arr[++top] = x;
//     }

//     public int pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
//         int val = arr[top];
//         arr[top--] = 0; // Optional: clear the value
//         return val;
//     }

//     public int peek() {
//         if (top == -1) {
//             System.out.println("Stack is Empty");
//             return -1;
//         }
//         return arr[top];
//     }

//     public boolean isEmpty() {
//         return top == -1;
//     }

//     public void printStack() {
//         System.out.print("Stack contents (bottom to top): ");
//         for (int i = 0; i <= top; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // Main method to test MyStack
//     public static void main(String[] args) {
//         MyStack stack = new MyStack();
        
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);

//         stack.printStack(); // 10 20 30

//         System.out.println("Peek: " + stack.peek()); // 30
//         System.out.println("Pop: " + stack.pop());   // 30

//         stack.printStack(); // 10 20
//     }
// }
