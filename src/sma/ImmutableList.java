package sma;

public class ImmutableList<T> {
    
    private final ImmutableNode<T> firstNode;

    public ImmutableList(ImmutableNode <T> firstNode) {
        
        this.firstNode = firstNode;
        
    }
    
    public ImmutableList<T> addFirst(T value) {
        
        return new ImmutableList<T>(new ImmutableNode<T>(value, firstNode));
    }
    
    public ImmutableList<T> remove(T value) {
        if(isEmpty()) return this;
        
        return new ImmutableList<T>(this.firstNode.remove(value));
    }
    
    public boolean contains(T value) {
        if(isEmpty()) {
            return false;
        }
        
        return this.firstNode.contains(value);
        
    }
    
    public boolean isEmpty()
    {
        return firstNode == null;
    }
}
