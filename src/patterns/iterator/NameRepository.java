package patterns.iterator;

public class NameRepository implements Container {

	private String names[] = {"A", "B", "C", "d"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	public class NameIterator implements Iterator {
		
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return this.index < names.length;
		}
		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[this.index ++];
			}
			
			return null;
		}
	}
	
}
