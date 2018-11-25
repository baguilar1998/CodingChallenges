import java.util.HashSet;

/*
 * An OpenAddressingHashTable implemented with a Map
 */
public class OpenAddressingHashTable<K,V> implements Map<K,V>{

	private Entry<K,V> seats[];
	int size, capacity;
	private Entry<K,V> ghost;
	
	public OpenAddressingHashTable(Entry<K,V> g) {
		this.ghost = g;
		capacity = 1000;
		seats = (Entry<K, V>[]) new Object[capacity];
		size =0;
		for(int i=0;i<capacity;++i) seats[i]=null;
	}
	
	private int locate(K k) {
		int h = k.hashCode()%capacity;
		int step = 0;
		while(step<capacity) {
			int index = (h+step)%capacity;
			if(seats[index]==null)return -1;
			if(seats[index]!=ghost && seats[index].getKey().equals(k))return index;
			++step;
		}
		return -1;
	}
	
	private int findSpot(K k) {
		int h = k.hashCode()%capacity;
		int step =0;
		while(step<capacity) {
			int index = (h+step)%capacity;
			if(seats[index]==null)return index;
			if(seats[index]==ghost)return index;
		}
		return -1;
	}
	
	@Override
	public V get(K k) {
		int i = locate(k);
		if(i==-1)return null;
		return seats[i].getValue();
	}

	@Override
	public void put(K k, V v) {
		Entry<K,V> item = new Entry<K,V>(k,v);
		int i = locate(k);
		if(i!=-1)seats[i] = item;
		else {
			i = findSpot(k);
			if(i!=-1){
				seats[i]=item;
				++size;
			}
			else return;
		}
		
	}

	@Override
	public void remove(K k) {
		int i = locate(k);
		if(i == -1)return;
		seats[i] = ghost;
		
	}

	@Override
	public Set<K> keySet() {
		Set<K> keys = (Set<K>) new HashSet<K>();
		for(int i=0;i<capacity;++i) {
			if(seats[i]!=null)keys.add(seats[i].getKey());
		}
		return keys;
	}

}
