class Stack<T> {
    private int top = -1;
    private Object[] stack = new Object[5];

    void push(T x) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else {
            stack[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(stack[top--] + " popped");
    }

    void display() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }
}

class Main {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}