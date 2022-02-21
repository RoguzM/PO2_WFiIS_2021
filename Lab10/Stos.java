public class Stos<T> {
    Node<T> head = null;
    static boolean flag = true;

    private class Node<S> {
        S value;
        Node<S> prev;
    }

    public void push(T elem) {
        if (head != null) {
            Node<T> temp = new Node<>();
            temp.value = elem;
            temp.prev = head;
            head = temp;
        } else {
            head = new Node<>();
            head.value = elem;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.prev;
        }
    }

    public String toString()
    {
        String result = "";

        Node<T> temp = head;

        while(temp != null)
        {
            if (flag) {
                result += "Wynik:\n\n";
                flag = false;
            }

            result += "{" + temp.value + "} ";
            temp = temp.prev;
        }

        return result;
    }
}