package TP1;

public class MySimpleLinkedList<T> {

    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        size++;
    }

    //extraer el primero y retorna la info del mismo
    public T extractFront() {
        Node<T> tmp = this.first;
        this.first = this.first.getNext();
        this.size = this.size - 1;
        return tmp.getInfo();

    }

    //si el primero es null la lista esta vacia
    public boolean isEmpty() {
        return this.first == null;
    }

    //devuelve la info del indice pasado x parametro
    public T getIndex(int index) {
        int contador = 0;
        Node<T> tmp = this.first;
        if (index > size){
            return null;
        }
        while(contador < index){
            tmp = tmp.getNext();
            contador++;
        }

        if (contador >= this.size){
            return null;
        } else {
            return tmp.getInfo();
        }
    }

    public int getSize() {

        return this.size;
    }

    @Override
    public String toString() {
        String cadena = "";
        Node<T> temp = this.first;
        for(int i = 0; i < this.getSize(); i++) {
            cadena += temp.getInfo() + ", " ;
            temp = temp.getNext();
        }
        return cadena;
    }

}
