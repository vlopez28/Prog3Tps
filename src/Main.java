public class Main {
    public static void main(String[] args) {

//        Node<T> n1 = new Node<T>(1, null);
//        Node<T> n2 = new Node<T>(2, null);
//        Node<T> n3 = new Node<T>(3, null);
//        Node<T> n4 = new Node<T>(4, null);
//        Node<T> n5 = new Node<T>(5, null);
//        n1.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(n4);
//        n4.setNext(n5);

        MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
        lista.insertFront(5);
        lista.insertFront(4);
        lista.insertFront(3);
        lista.insertFront(2);
        lista.insertFront(1);

        System.out.println(lista.toString());
        System.out.println("-----------------------------------------------------");
       // System.out.println(lista.extractFront());
       // System.out.println("-----------------------------------------------------");
        System.out.println(lista.getIndex(6));
    }
}