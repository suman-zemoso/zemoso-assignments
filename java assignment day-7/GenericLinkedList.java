class SNode<U> {
	U item;
	SNode<U> next;
	SNode() { item = null; next = null;}
	SNode(U item, SNode<U> next) {
		this.item = item;
		this.next = next;
	}
	public String toString(){return "" + item;}
}
class SListIterator<T> {
	SNode<T> pointer;
	SListIterator(SNode<T> head) {
		pointer = head;
	}
	boolean hasNext(){
		return pointer.next != null;
	}
	SNode<T> next(){
		pointer = pointer.next;
		return pointer;
	}
	void insert(T item){
		pointer.next = new SNode<T>(item, pointer.next);
		pointer = pointer.next;
	}
	void remove(){
		if(pointer.next != null){
			pointer.next = pointer.next.next;
		}
	}
}
class SList<T> {
	private SNode<T> top = new SNode<T>();
	SListIterator<T> iterator() {
		return new SListIterator<T>(top);
	}
	public String toString() {
		String s = "[ ";
		SNode<T> tmp = top;
		if(tmp.next != null){
			s = s + tmp.next.item;
			while(tmp.next.next != null){
				s = s + ", " + tmp.next.next.item;
				tmp = tmp.next;
			}
		}
		s = s + "]";
		return s;
	}
}

public class GenericLinkedList {
	public static void main(String... args) {
		SList<Integer> sl = new SList<Integer>();
		SListIterator<Integer> sli = sl.iterator();
		sli.insert(1);
		sli.insert(2);
		sli.insert(3);
		sli.insert(4);
		System.out.println(sl);
		while(sli.hasNext()){System.out.println(sli.next());}
		SListIterator<Integer> sli1 = sl.iterator();
		sli1.remove();
		sli1.remove();
		sli1.remove();
		sli1.remove();
		System.out.println(sl);
	}
}
