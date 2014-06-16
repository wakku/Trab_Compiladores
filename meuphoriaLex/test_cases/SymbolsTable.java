import java.util.*;

enum Category {
	Variavel,
	Parametro,
	Procedimento,
	Funcao,
	Constante
}

enum Type {
	Atom,
	Int,
	Sequence,
	Object
}

public class Symbol {

	private String id;
	private int level;
	private Category category;
	private Type type;
	
	private int npar;
	private ArrayList parametros;

	private int address;
	private String label;
	private int value;

	public Simbolo(String _id, int _nivel, Categoria _categoria) {
		id = _id;
		nivel = _nivel;
		categoria = _categoria;
		if ( categoria == Categoria.Procedimento ) {
			parametros = new ArrayList();
		}
	}
	
	public Simbolo(int _valor, int _nivel, Tipo _tipo) {
		valor = _valor;
		nivel = _nivel;
		tipo = _tipo;
		categoria = Categoria.Constante;
	}
	
	public Simbolo duplica() {
		Simbolo s = new Simbolo(id, nivel, categoria);
		s.setTipo(tipo);
		s.setNPar(npar);
		s.setParametros(new ArrayList(parametros));
		return s;
	}

	public int checaParametros(ArrayList _par) {
		if ( categoria != Categoria.Procedimento ) {
			return 1;		// não é um procedimento.
		}
		if ( parametros.size() != _par.size() ) {
			return 2;		// número de parâmetros inválidos.
		}
		Iterator l, p;
		l = parametros.iterator();
		p = _par.iterator();
		while ( l.hasNext() ) {
			if ( ((Simbolo)l.next()).getTipo() != ((Tipo)p.next()) ) {
				return 3;	// tipo de parâmetros inválidos.
			}
		}
		return 0;			// lista de parâmetros válida.
	}

	public String toString() {
		Iterator i;
		String s = getId() + ": Nivel=" + getNivel() + " Categoria=" + getCategoria();
		switch ( getCategoria() ) {
			case Variavel:
				s += " Tipo=" + getTipo();
				break;
			case Parametro:
				s += " Tipo=" + getTipo();
				break;
			case Constante:
				s += " Tipo=" + getTipo();
				break;
			case Procedimento:
				s += " Parametros=(";
				i = parametros.iterator();
				if ( i != null ) {
					while ( i.hasNext() ) {
						s += (Simbolo)i.next();
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo t) {
		tipo = t;
	}

	public int getNivel() {
		return nivel;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public ArrayList getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList par) {
		parametros = par;
	}
	
	public int getNPar() {
		return npar;
	}

	public void setNPar(int d) {
		npar = d;
	}

	public void setEndereco(int addr) {
		endereco = addr;
	}
	
	public int getEndereco() {
		return endereco;
	}
	
	public void setLabel(String lbl) {
		label = lbl;
	}
	
	public String getLabel() {
		return label;
	}

}




public class SymbolsTable {

	private HashMap<String, Simbolo> symbols;

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



