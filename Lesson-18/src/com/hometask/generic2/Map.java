package com.hometask.generic2;
/**
 * @author Martha Partuta
 * */
public class Map<K,V> {
 
	int size;
	MyEntry<K,V> pop;
	
	public Map() {
		size=0;
		pop=null;
	}
	//method to add new keys and values 
	public void add(K newKey, V newValue) {
		MyEntry<K,V> newEntry = new MyEntry<K,V>(newKey,newValue, pop);
		pop= newEntry;
		size++;
	}
	//with method delete the last added Map
	public K deleteLastAdd() {
		MyEntry<K, V> oldPop=pop;
		if(size==0) {
			return null;
		}
		pop=pop.getNext();
		size--;
		return oldPop.getKey();
	}
	
	
	public K peekK() {
		if(size==0) {
			return null;
		}
		return pop.getKey();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Map [size=" + size + ", pop=" + pop + "]";
	}

}
