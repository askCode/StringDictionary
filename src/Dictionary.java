
public class Dictionary implements StringDictionary {
	private int tableSize = 25;
	Object [] table;
	
	//constructor
	Dictionary(){
		this.table = new Object [this.tableSize];
	}
	
	
	@Override
	public boolean add(String s) {
		// TODO Auto-generated method stub
		int hashCode = s.hashCode() % this.tableSize;
		if(!this.contains(s)){
			this.table[hashCode] = s;
		}
		return false;
	}

	@Override
	public boolean remove(String s) {
		// TODO Auto-generated method stub
		int hashCode = s.hashCode() % this.tableSize;
		if(this.contains(s)){
			this.table[hashCode] = null;
			return true;
		}	
		return false;
	}

	@Override
	public boolean contains(String s) {
		// TODO Auto-generated method stub
		int hashCode = s.hashCode() % this.tableSize;
		if(table[hashCode] != null){
			if(table[hashCode].equals(s))
				return true;
		}
		return false;
	}
}
