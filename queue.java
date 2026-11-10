class Queue<T> {
    int front = 0, rear = -1;
    private Object[] q = new Object[5];

    void enqueue(T x) {
        if (rear == 4)
            System.out.println("Queue Overflow");
        else {
            q[++rear] = x;
            System.out.println(x + " inserted");
        }
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println(q[front++] + " deleted");
    }

    void display() {
        if (front > rear)
            System.out.println("Queue is Empty");
        else {
            System.out.println("Queue Elements:");
            for (int i = front; i <= rear; i++)
                System.out.print(q[i] + " ");
            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}