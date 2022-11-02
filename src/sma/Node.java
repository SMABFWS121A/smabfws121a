package sma;

class Node<T> {
    
    public T value;
    public Node<T> nextNode;
    
    public Node(T value, Node<T> nextNode)
    {
        this.value = value;
        this.nextNode = nextNode;
    }
}
