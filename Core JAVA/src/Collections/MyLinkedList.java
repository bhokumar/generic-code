package Collections;

import java.util.Iterator;

/**
 * Created by manishasingh on 8/2/2017.
 */
public class MyLinkedList<A> {
    Node<A> front;
    Node<A> rear;
    int size = 0;

    public boolean add(A a) {
        Node<A> p = rear;
        Node<A> newNode = new Node<>(rear, a, null);
        rear = newNode;
        if (front == null)
            front = rear;
        else
            p.rear = rear;

        size++;
        return true;
    }

    public boolean addFirst(A a) {
        Node aa = front;
        front = new Node(null, a, aa);
        aa.front = front;
        size++;
        return true;
    }

    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        int size1 = size;
        int index = 0;
        Node<A> fronta = front;
        MyIterator() {

        }

        @Override
        public Object next() {
            A a = fronta.data;
            fronta = fronta.rear;
            index++;
            return a;
        }

        @Override
        public boolean hasNext() {

            if (index < size1)
                return true;

            return false;
        }
    }

    private class Node<A> {
        Node<A> front;
        A data;
        Node<A> rear;

        Node(Node<A> front, A data, Node<A> rear) {
            this.front = front;
            this.data = data;
            this.rear = rear;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> t = new MyLinkedList<>();
        t.add("ss");
        t.add("pp");
        t.add("qq");
        t.addFirst("mm");
        t.addFirst("mm");
        Iterator itr = t.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            t.addFirst("bb");
        }

        itr = t.iterator();

        System.out.println("gggggggggggggggggggggggggggggggg");
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
