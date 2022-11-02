package sma;

public class MutableList<T> {
    
    private Node<T> firstNode;

    public void addFirst(T value) {
        if(isEmpty())
        {
            firstNode = new Node<T>(value, null);
        } else {
            Node<T> node = new Node<T>(value, firstNode);
            firstNode = node;
        }
    }
    
    public void remove(T value) {
        if(isEmpty())
            return;
        
        if(firstNode.value.equals(value))
        {
            firstNode = firstNode.nextNode;
        } else {
            Node<T> currentNode = firstNode;
            while(currentNode.nextNode != null && !currentNode.nextNode.value.equals(value))
            {
                currentNode = currentNode.nextNode;
            }
            if(currentNode.nextNode != null)
            {
                currentNode.nextNode = currentNode.nextNode.nextNode;
            }
        }
    }
    
    public boolean contains(T value) {
        if(isEmpty()) {
            return false;
        }
        Node<T> currentNode = firstNode;
        while(currentNode != null && !currentNode.value.equals(value)) {
            currentNode = currentNode.nextNode;
        }
        if(currentNode != null) {
            return true;
        }
        return false;
    }
    
    public boolean isEmpty()
    {
        return firstNode == null;
    }
    
}
