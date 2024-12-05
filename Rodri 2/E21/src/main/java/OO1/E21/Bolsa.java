package OO1.E21;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bolsa<T> implements Bag<T>{

	private Map<T,Integer> dictionary;
	
	
	public Bolsa(){
	  this.dictionary = new HashMap<>();
	}
	
	
	public boolean add(T var) {
		if (this.dictionary.containsKey(var)) {
			this.dictionary.put(var, this.dictionary.get(var) + 1);
		}else {
			this.dictionary.put(var, 1);
		}
		return true;
	}
	
	public int occurrencesOf(T element) {
		if (this.dictionary.containsKey(element)) {
			return this.dictionary.get(element);
		}
		return 0;
	}
	
	public void removeOccurrence(T element) {
		if (this.dictionary.containsKey(element)) {
			this.dictionary.put(element, this.dictionary.get(element) - 1);
		}
	}
	
	
	public void removeAll(T element) {
		if (this.dictionary.containsKey(element)) {
			this.dictionary.remove(element);
		}
	}
	
	
	public int size() {
		return this.dictionary.values().stream().mapToInt(Integer -> Integer).sum();
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}