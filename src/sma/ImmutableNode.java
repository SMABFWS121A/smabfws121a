package sma;

public class ImmutableNode<T> {

    public final T value;
    public final ImmutableNode<T> nextNode;
    
    public ImmutableNode(T value, ImmutableNode<T> nextNode)
    {
        this.value = value;
        this.nextNode = nextNode;
    }

    public boolean contains(T value) {
        // TODO Auto-generated method stub
        if(this.value.equals(value)) {
            return true;
        } 
        return this.nextNode == null ? false: this.nextNode.contains(value);
    }

    public ImmutableNode<T> remove(T value) {
        // TODO Auto-generated method stub
        if(this.value.equals(value)) {
            return nextNode;
        } 
        
        return new ImmutableNode<T>(this.value, this.nextNode.remove(value));
    }
}
