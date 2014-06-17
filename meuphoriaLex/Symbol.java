import java.util.*;

public class Symbol {

	private String id;
	private int level;
	private Category category;
	private Type type;
	private int npar; // numero de parametros, no caso de funcao
	private ArrayList parameters;
	private int address;
	private String label;
	private int value;

	public Symbol(String _id, int _level, Category _category) {
		id = _id;
		level = _level;
		category = _category;
		if ( category == Category.Procedure ) {
			parameters = new ArrayList();
		}
	}
	
	public Symbol(int _value, int _level, Type _type) {
		value = _value;
		level = _level;
		type = _type;
		category = Category.Constant;
	}
	
	/*public Symbol duplicate() {
		Symbol s = new Symbol(id, level, category);
		s.setType(type);
		s.setNPar(npar);
		s.setParameters(new ArrayList(parameters));
		return s;
	}*/

	public int verifyParameters(ArrayList _par) {
		if ( category != Category.Procedure ) {
			return 1;		// não é um procedimento.
		}
		if ( parameters.size() != _par.size() ) {
			return 2;		// número de parâmetros inválidos.
		}
		Iterator l, p;
		l = parameters.iterator();
		p = _par.iterator();
		while ( l.hasNext() ) {
			if ( ((Symbol)l.next()).getType() != ((Type)p.next()) ) {
				return 3;	// tipo de parâmetros inválidos.
			}
		}
		return 0;			// lista de parâmetros válida.
	}

	public String toString() {
		Iterator i;
		String s = getId() + ": Nivel=" + getLevel() + " Categoria=" + getCategory();
		switch ( getCategory() ) {
			case Variable:
				s += " Tipo=" + getType();
				break;
			case Parameter:
				s += " Tipo=" + getType();
				break;
			case Constant:
				s += " Tipo=" + getType();
				break;
			case Procedure:
				s += " Parametros=(";
				i = parameters.iterator();
				if ( i != null ) {
					while ( i.hasNext() ) {
						s += (Symbol)i.next();
						if ( i.hasNext() ) {
							s += ", ";
						}
					}
				}
				s += ") " + npar;
				break;
		}
		return s;
	}

	public String getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type t) {
		type = t;
	}

	public int getLevel() {
		return level;
	}

	public Category getCategory() {
		return category;
	}

	public ArrayList getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList par) {
		parameters = par;
	}
	
	public int getNPar() {
		return npar;
	}

	public void setNPar(int d) {
		npar = d;
	}

	public void setAddress(int addr) {
		address = addr;
	}
	
	public int getAddress() {
		return address;
	}
	
	public void setLabel(String lbl) {
		label = lbl;
	}
	
	public String getLabel() {
		return label;
	}

}

