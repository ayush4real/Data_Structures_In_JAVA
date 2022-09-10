package HashMaps;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numBuckets;

    public Map(){
        buckets=new ArrayList<>();
        numBuckets=5;
        for(int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
        count=0;
    }

    private int getBucketIndex(K key){
        int hc= key.hashCode();
        int index=hc % numBuckets;
        return index;
    }

    private void reHash(){
        ArrayList<MapNode<K,V>> temp=buckets;
        buckets=new ArrayList<>();
        for (int i=0;i<2*numBuckets;i++){
            buckets.add(null);
        }
        count=0;
        numBuckets=numBuckets*2;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head=temp.get(i);
            while(head!=null){
                K key= head.key;
                V value= head.value;
                insert(key,value);
                head=head.next;
            }
        }
    }

    public double loadFactor(){
        return (count*1.0)/numBuckets;
    }

    public void insert(K key,V value){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head =buckets.get(bucketIndex);
        while(head!=null){
            if(head.key.equals(key)){
                head.value= value;
                return;
            }
            head=head.next;
        }
        head=buckets.get(bucketIndex);
        MapNode<K,V> newNode=new MapNode<>(key, value);
        newNode.next=head;
        buckets.set(bucketIndex,newNode);
        count++;
        double loadFactor=(count*1.0)/numBuckets;
        if(loadFactor>=0.7){
            reHash();
        }
    }

    public int size(){
        return count;
    }

    public V getValue(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head =buckets.get(bucketIndex);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public V removeKey(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head=buckets.get(bucketIndex);
        MapNode<K,V> prev=null;
        while(head!=null){
            if(head.key.equals(key)){
                if(prev==null){
                    buckets.set(bucketIndex,head.next);
                }else{
                    prev.next=head.next;
                }
                count--;
                return head.value;
            }
            prev=head;
            head=head.next;
        }
        return null;
    }
}
