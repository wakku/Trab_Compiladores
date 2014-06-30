import java.util.*;

public class Symbol {

	private String id;
	private int level;
	private Category category;
	private Type type;
	private int npar; // numero de parametros, no caso de funcao
	private int minpar = -1; // numero min par - funcoes builtin
	private int maxpar = -1; // numero max par - funcoes builtin
	private ArrayList parameters;
	private int address;
	private String label;
	private int value;
	//private String value;
	private int nbytes;
	private int return_parameters = 0;

	public Symbol(String _id, int _level, Category _category) {
		id = _id;
		level = _level;
		category = _category;
		npar = 1;
		if ( category == Category.Procedure ) {
			parameters = new ArrayList();
		}
		//nbytes = 
	}

	public Symbol(String _id, int _level, int _minpar, int _maxpar, Category _category) {
		id = _id;
		level = _level;
		minpar = _minpar;
		maxpar = _maxpar;
		category = _category;
		if ( category == Category.Procedure ) {
			parameters = new ArrayList();
		}
		//nbytes = 
	}

	public Symbol(String _id, int _level, int _value, Category _category) {
		id = _id;
		level = _level;
		value = _value;
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
			if(minpar == -1 && maxpar == -1)
				return 2;
			else if( !(_par.size() >= minpar) && !(_par.size() <= maxpar ) ) //se não estiver no intervalo
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
			case Function:
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

	/***************************
	GETTERS
	***************************/

	public String 	getId() 			{ return id; }
	public Type 	getType() 			{ return type; }
	public int 		getLevel() 			{ return level; }
	public Category getCategory() 		{ return category; }
	public ArrayList getParameters() 	{ return parameters; }
	public int getReturnParameters() 	{ return return_parameters; }
	public int 		getNPar() 			{ return npar; }
	public int 		getAddress() 		{ return address; }
	public String 	getLabel()			{ return label; }
	public int 		getMinpar() 			{ return minpar; }
	public int 		getMaxpar() 			{ return maxpar; }

	public void setType(Type t) 				{ type = t; }
	public void setParameters(ArrayList par) 	{ parameters = par; }
	public void setReturnParameters(int n) 		{ return_parameters = n; }
	public void setNPar(int d) 					{ npar = d; }
	public void setAddress(int addr) 			{ address = addr;	}	
	public void setLabel(String lbl) 			{ label = lbl; }
	
}

