package com.hometask.generic2;
/**
 * @author Martha Partuta
 * */
public class MyEntry<K,V> {
	
	K key;
	V value;
	private MyEntry<K, V> next;
	
	public MyEntry(K key, V value, MyEntry<K,V> next) {
		super();
		this.key = key;
		this.value = value;
		this.setNext(next);
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public MyEntry<K, V> getNext() {
		return next;
	}
	
	public void setNext(MyEntry<K, V> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", value=" + value + ", next=" + next + "]";
	}
	
	
}
	
