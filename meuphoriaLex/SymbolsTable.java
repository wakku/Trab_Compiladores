import java.util.*;

enum Category {
	Variable,
	Parameter,
	Procedure,
	Function,
	Constant
}

enum Type {
	Atom,
	Int,
	//String,
	Sequence,
	//Object,
	Constant,
	Boolean,
	Enum,
	NotDeclared
}


public class SymbolsTable {

	private HashMap<String, Symbol> symbols;

	public SymbolsTable() {
		symbols = new HashMap<String, Symbol>();
	}

	public String toString() {
		String s = "";
		Iterator it = symbols.values().iterator();
		while ( it.hasNext() ) {
			s += it.next() + "\n";
		}
		return s;
	}

	public Symbol search(String id) {
		Symbol s = symbols.get(id);
		if (s != null)
			return (Symbol) s;
		
		return s;
	}

	public boolean insert(Symbol s) {
		if ( search(s.getId()) != null )
			return false;
		
		symbols.put(s.getId(), s);
		return true;
	}

}



