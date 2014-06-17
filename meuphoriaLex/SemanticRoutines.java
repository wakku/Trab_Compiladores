import java.util.*;

public class SemanticRoutines {

	private static ArrayList<SymbolsTable> scopes = new ArrayList<SymbolsTable>();
	private int level;

	public SemanticRoutines() {
		SymbolsTable symbols = new SymbolsTable();
		Symbol atom;
		atom = new Symbol("atom", 0, Category.Constant);
		symbols.insert(atom);
		/*
		Symbol wli, rlo, wlo, t, f, s;
		wli = new Symbol("WriteLine", 0, Category.Procedimento);
		rlo = new Symbol("ReadLong", 0, Category.Procedimento);
		wlo = new Symbol("WriteLong", 0, Category.Procedimento);
		t = new Symbol("true", 0, Category.Constante);
		f = new Symbol("false", 0, Category.Constante);
		t.setTipo(Tipo.Boolean);
		f.setTipo(Tipo.Boolean);
		s = new Symbol("rlo_par", 0, Category.Parametro);
		s.setTipo(Tipo.Int);
		rlo.getParametros().add(s);
		s = new Symbol("wlo_par", 0, Category.Parametro);
		s.setTipo(Tipo.Int);
		wlo.getParametros().add(s);
		symbols.insere(t);
		symbols.insere(f);
		symbols.insere(rlo);
		symbols.insere(wlo);
		symbols.insere(wli);
		*/
		scopes.add(symbols);
		
		level = 0;
	}

	public Symbol searchLevel(String id) {
		if(scopes.isEmpty() != true) {
			SymbolsTable ts = scopes.get(level);
			return ts.search(id);
		}
		return null;
	}

	public Symbol search(String id, int level) {
		SymbolsTable ts = scopes.get(level);
		return ts.search(id);
	}

	public Symbol search(String id) {
		Symbol s = null;
		for ( int i = scopes.size() - 1; i >= 0; i-- ) {
			s = scopes.get(i).search(id);
			if ( s != null ) {
				return s;
			}
		}
		return null;
	}

	public void insert(Symbol symbol) {
		System.out.println(level + "    " + scopes.size());
		if ( level < scopes.size() ) {
			scopes.get(level).insert(symbol);
		}

	}

	public void newLevel() {
		level++;
		scopes.add(new SymbolsTable());
	}

	public void previousLevel() {
		level--;
	}

	public void posteriorLevel() {
		level++;
	}

	public void removeLastLevel() {
		scopes.remove(level);
		level--;
	}

	public int getLevel() {
		return level;
	}

	public static Type tokenAsType(Token t) {

		if (t.toString().compareTo("int") == 0)
			return Type.Int;
		else 
			return null;
	}

	public SymbolsTable get(int i) {
		return scopes.get(i);
	}

}

