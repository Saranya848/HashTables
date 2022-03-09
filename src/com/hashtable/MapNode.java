package com.hashtable;

/**
 * it is interface to declare methods which is implemented in My mapnode
 * 
 * @return
 */
public class MapNode<K, V> implements Node<K> {
	K key;
	V value;
	Node<K> next;

	// constructor
	public MapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	// getters and setters
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

	@Override
	public Node<K> getNext() {
		return next;
	}

	@Override
	public void setNext(Node<K> next) {

		this.next = next;

	}

	@Override
	/**
	 * For displaying the output of the MapNode
	 */
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
}