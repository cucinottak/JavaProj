import java.util.Set;

public interface MyMap<K, V> {

    public Set<V> values();
    public void clear(); 
    public boolean containsKey(K key);
    public Set<K> keySet();
    public boolean containsValue(V value);
    public V get(K key);
    public boolean isEmpty();
    public void put(K key, V value);
    public void remove(K key);
    public int size();
}