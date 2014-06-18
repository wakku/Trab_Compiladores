import java.util.*;

public class SemanticRoutines {

	private static ArrayList<SymbolsTable> scopes = new ArrayList<SymbolsTable>();
	private int level;

	public SemanticRoutines() {
		SymbolsTable symbols = new SymbolsTable();
		
		/** TIPOS**/
		Symbol symbolAtom, symbolInt, symbolSequence, symbolObject, symbolEnum, symbolConstant;
		symbolAtom 		= new Symbol("atom", 0, Category.Constant);
		symbolInt 		= new Symbol("int", 0, Category.Constant);
		symbolSequence 	= new Symbol("sequence", 0, Category.Constant);
		symbolObject 	= new Symbol("object", 0, Category.Constant);
		symbolEnum 	= new Symbol("enum", 0, Category.Constant);
		symbolConstant 	= new Symbol("constant", 0, Category.Constant);

		symbols.insert(symbolAtom);
		symbols.insert(symbolInt);
		symbols.insert(symbolSequence);
		symbols.insert(symbolObject);
		symbols.insert(symbolEnum);
		symbols.insert(symbolConstant);

		/** BUILT-INS **/
		Symbol
			builtin_SumSeq, 	builtin_abort,			builtin_and_bits,		builtin_append,			builtin_arctan,
			builtin_c_func, 		builtin_c_proc,			builtin_call,			builtin_call_func,
			builtin_call_proc, 	builtin_clear_screen, 	builtin_close,			builtin_command_line, 	builtin_compare,
			builtin_cos, 		builtin_date, 			builtin_delete, 		builtin_delete_routine, builtin_equal,
			builtin_find,		builtin_floor,			builtin_get_key,		builtin_getc,			builtin_getenv,
			builtin_gets,		builtin_hash,			builtin_head,			builtin_include_paths,	builtin_insert,
			builtin_lenght,			builtin_log,			builtin_machine_func,
			builtin_machine_proc,	builtin_match,		builtin_mem_copy,		builtin_mem_seq,		builtin_not_bits,
			builtin_open, 		builtin_option_switches,	builtin_or_bits,	builtin_peek, 			builtin_peek2s,
			builtin_peek2u, 	builtin_peek4s, 		builtin_peek4u, 		builtin_peek_string,	builtin_peeks,
			builtin_poke,			builtin_poke2,			builtin_poke4,
			builtin_position,	builtin_power,			builtin_prepend,		builtin_print,			builtin_printf,
			builtin_puts,		builtin_rand,			builtin_remainder,		builtin_remove,			builtin_repeat,
			builtin_replace,	builtin_routine_id,		builtin_sin,			builtin_splice,			builtin_sprintf,
			builtin_sqrt,		builtin_system,			builtin_system_exec,	builtin_tail,			builtin_tan,
			builtin_task_clock_start, builtin_task_clock_stop, builtin_task_create, builtin_task_list,	builtin_task_schedule,
			builtin_task_self, builtin_task_status,		builtin_task_suspend,	builtin_task_yield,		builtin_time,
			builtin_trace,		builtin_xor_bits 
			;  	

		builtin_SumSeq 			= new Symbol("?", 0, 1, 100, Category.Procedure);
		builtin_abort 			= new Symbol("abort", 0, Category.Procedure);
		builtin_and_bits		= new Symbol("and_bits", 0, Category.Function);
		builtin_append			= new Symbol("append", 0, Category.Function);
		builtin_arctan			= new Symbol("arctan", 0, Category.Function);
		builtin_c_func			= new Symbol("c_func", 0, Category.Function);
		builtin_c_proc			= new Symbol("c_proc", 0, Category.Procedure);
		builtin_call			= new Symbol("call", 0, Category.Procedure);
		builtin_call_func		= new Symbol("call_func", 0, Category.Function);
		builtin_call_proc		= new Symbol("call_proc", 0, Category.Procedure);
		builtin_clear_screen	= new Symbol("clear_screen", 0, Category.Procedure);
		builtin_close			= new Symbol("close", 0, Category.Procedure);
		builtin_command_line	= new Symbol("command_line", 0, Category.Function);
		builtin_compare			= new Symbol("compare", 0, Category.Function);
		builtin_cos				= new Symbol("cos", 0, Category.Function);
		builtin_delete			= new Symbol("delete", 0, Category.Procedure);
		builtin_delete_routine	= new Symbol("delete_routine", 0, Category.Function);
		builtin_equal			= new Symbol("equal", 0, Category.Function);
		builtin_find			= new Symbol("find", 0, Category.Function);
		builtin_floor			= new Symbol("floo", 0, Category.Function);
		builtin_get_key			= new Symbol("get_key", 0, Category.Function);
		builtin_getc			= new Symbol("getc", 0, Category.Function);
		builtin_getenv			= new Symbol("getenv", 0, Category.Function);
		builtin_gets			= new Symbol("gets", 0, Category.Function);
		builtin_hash			= new Symbol("hash", 0, Category.Function);
		builtin_head			= new Symbol("head", 0, Category.Function);
		builtin_include_paths	= new Symbol("include_paths", 0, Category.Function);
		builtin_insert			= new Symbol("insert", 0, Category.Function);
		builtin_lenght			= new Symbol("lenght", 0, Category.Function);
		builtin_log				= new Symbol("log", 0, Category.Function);
		builtin_machine_func	= new Symbol("machine_func", 0, Category.Function);
		builtin_machine_proc	= new Symbol("machine_proc", 0, Category.Procedure);
		builtin_match			= new Symbol("match", 0, Category.Function);
		builtin_mem_copy		= new Symbol("mem_copy", 0, Category.Procedure);
		builtin_mem_seq			= new Symbol("mem_seq", 0, Category.Procedure);
		builtin_not_bits		= new Symbol("not_bits", 0, Category.Function);
		builtin_open			= new Symbol("open", 0, Category.Function);
		builtin_option_switches	= new Symbol("option_switches", 0, Category.Function);
		builtin_or_bits			= new Symbol("or_bits", 0, Category.Function);
		builtin_peek			= new Symbol("peek", 0, Category.Function);
		builtin_peek2s			= new Symbol("peek2s", 0, Category.Function);
		builtin_peek2u			= new Symbol("peek2u", 0, Category.Function);
		builtin_peek4s			= new Symbol("peek4s", 0, Category.Function);
		builtin_peek4u			= new Symbol("peek4u", 0, Category.Function);
		builtin_peek_string		= new Symbol("peek_string", 0, Category.Function);
		builtin_peeks			= new Symbol("peeks", 0, Category.Function);
		builtin_poke			= new Symbol("poke", 0, Category.Procedure);
		builtin_poke2			= new Symbol("poke2", 0, Category.Procedure);
		builtin_poke4			= new Symbol("poke4", 0, Category.Procedure);
		builtin_position		= new Symbol("position", 0, Category.Procedure);
		builtin_power			= new Symbol("power", 0, Category.Function);
		builtin_prepend			= new Symbol("prepend", 0, Category.Function);
		builtin_print			= new Symbol("print", 0, 1, 100, Category.Procedure);
		builtin_printf			= new Symbol("printf", 0, 1, 100, Category.Procedure);
		builtin_puts			= new Symbol("puts", 0, 1, 100, Category.Procedure);
		builtin_rand			= new Symbol("rand", 0, Category.Function);
		builtin_remainder		= new Symbol("remaninder", 0, Category.Function);
		builtin_remove			= new Symbol("remove", 0, Category.Function);
		builtin_repeat			= new Symbol("repeat", 0, Category.Function);
		builtin_replace			= new Symbol("replace", 0, Category.Function);
		builtin_routine_id		= new Symbol("routine_id", 0, Category.Function);
		builtin_sin				= new Symbol("sin", 0, Category.Function);
		builtin_splice			= new Symbol("splice", 0, Category.Function);
		builtin_sprintf			= new Symbol("sprintf", 0, Category.Function);
		builtin_sqrt			= new Symbol("sqrt", 0, Category.Function);
		builtin_system			= new Symbol("system", 0, Category.Procedure);
		builtin_system_exec		= new Symbol("system_exec", 0, Category.Function);
		builtin_tail 			= new Symbol("tail", 0, Category.Function);
		builtin_tan				= new Symbol("tan", 0, Category.Function);
		builtin_task_clock_start	= new Symbol("task_clock_start", 0, Category.Procedure);
		builtin_task_clock_stop	= new Symbol("task_clock_stop", 0, Category.Procedure);
		builtin_task_create		= new Symbol("task_create", 0, Category.Function);
		builtin_task_list		= new Symbol("task_list", 0, Category.Function);
		builtin_task_schedule	= new Symbol("task_schedule", 0, Category.Procedure);
		builtin_task_self		= new Symbol("task_self", 0, Category.Procedure);
		builtin_task_status		= new Symbol("task_status", 0, Category.Function);
		builtin_task_suspend	= new Symbol("task_suspend", 0, Category.Function);
		builtin_task_yield		= new Symbol("task_yield", 0, Category.Procedure);
		builtin_time			= new Symbol("time", 0, Category.Function);
		builtin_trace			= new Symbol("trace", 0, Category.Procedure);
		builtin_xor_bits		= new Symbol("xor_bits", 0, Category.Procedure);

		/** CONSTANTES **/
		builtin_date			= new Symbol("date", 0, Category.Constant); // public enum date - manual
		// As demais constantes estão todas definidas em bibliotecas, como por exemplo o PI e etc. Não são builtins do Euphoria

		/** COLOCANDO NA TABELA **/
		symbols.insert(builtin_SumSeq);
		symbols.insert(builtin_abort);
		symbols.insert(builtin_and_bits);
		symbols.insert(builtin_append);
		symbols.insert(builtin_arctan);	
		symbols.insert(builtin_c_func);
		symbols.insert(builtin_c_proc);	
		symbols.insert(builtin_call);		
		symbols.insert(builtin_call_func);
		symbols.insert(builtin_call_proc);	
		symbols.insert(builtin_clear_screen);
		symbols.insert(builtin_close);		
		symbols.insert(builtin_command_line);
		symbols.insert(builtin_compare);	
		symbols.insert(builtin_cos);		
		symbols.insert(builtin_date);
		symbols.insert(builtin_delete);		
		symbols.insert(builtin_delete_routine);
		symbols.insert(builtin_equal);		
		symbols.insert(builtin_find);		
		symbols.insert(builtin_floor);
		symbols.insert(builtin_get_key);	
		symbols.insert(builtin_getc);		
		symbols.insert(builtin_getenv);
		symbols.insert(builtin_gets);		
		symbols.insert(builtin_hash);		
		symbols.insert(builtin_head);
		symbols.insert(builtin_include_paths);		
		symbols.insert(builtin_insert);		
		symbols.insert(builtin_floor);
		symbols.insert(builtin_log);		
		symbols.insert(builtin_machine_func);		
		symbols.insert(builtin_floor);
		symbols.insert(builtin_match);		
		symbols.insert(builtin_mem_copy);		
		symbols.insert(builtin_mem_seq);
		symbols.insert(builtin_not_bits);		
		symbols.insert(builtin_open);		
		symbols.insert(builtin_option_switches);
		symbols.insert(builtin_or_bits);		
		symbols.insert(builtin_peek);		
		symbols.insert(builtin_peek2s);
		symbols.insert(builtin_peek2u);		
		symbols.insert(builtin_peek4s);		
		symbols.insert(builtin_peek4u);
		symbols.insert(builtin_peek_string);		
		symbols.insert(builtin_peeks);		
		symbols.insert(builtin_poke);
		symbols.insert(builtin_poke2);		
		symbols.insert(builtin_poke4);		
		symbols.insert(builtin_position);
		symbols.insert(builtin_power);		
		symbols.insert(builtin_prepend);		
		symbols.insert(builtin_print);
		symbols.insert(builtin_printf);		
		symbols.insert(builtin_puts);		
		symbols.insert(builtin_rand);
		symbols.insert(builtin_remainder);		
		symbols.insert(builtin_remove);		
		symbols.insert(builtin_repeat);
		symbols.insert(builtin_replace);		
		symbols.insert(builtin_routine_id);		
		symbols.insert(builtin_sin);
		symbols.insert(builtin_splice);		
		symbols.insert(builtin_sprintf);		
		symbols.insert(builtin_sqrt);
		symbols.insert(builtin_system);		
		symbols.insert(builtin_system_exec);		
		symbols.insert(builtin_tail);
		symbols.insert(builtin_tan);		
		symbols.insert(builtin_task_clock_start);		
		symbols.insert(builtin_task_clock_stop);
		symbols.insert(builtin_task_create);		
		symbols.insert(builtin_task_list);		
		symbols.insert(builtin_task_schedule);
		symbols.insert(builtin_task_self);		
		symbols.insert(builtin_task_status);		
		symbols.insert(builtin_task_suspend);
		symbols.insert(builtin_task_yield);		
		symbols.insert(builtin_time);		
		symbols.insert(builtin_trace);
		symbols.insert(builtin_xor_bits);
		
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

