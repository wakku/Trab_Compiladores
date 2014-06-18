@echo Acessando a pasta do analisador lexico
@echo off
@echo.
cd ./meuphoriaLex
@echo Removendo arquivos desatualizados
@echo.
del *.class
@echo Rodando Javacc
@echo.
java -cp ../javacc.jar javacc meuphoria.jj
@echo.
@echo Compilando .java files
@echo.
javac *.java
@echo --------------------------------------------
@echo Rodando os testes
@echo.

cd..
cd test_cases

rmdir resultados /S /Q
mkdir resultados
cd resultados
mkdir happy_path
mkdir sad_path
cd..
cd..

@echo Rodando o teste 01
java Meuphoria < ./test_cases/happy_path/teste01_comentario.in > ./test_cases/resultados/happy_path/teste01_comentario.out
@echo Rodando o teste 02
java Meuphoria < ./test_cases/happy_path/teste02_declarar_variaveis.in > ./test_cases/resultados/happy_path/teste02_declarar_variaveis.out
@echo Rodando o teste 03
java Meuphoria < ./test_cases/happy_path/teste03_atribuir_valores.in > ./test_cases/resultados/happy_path/teste03_atribuir_valores.out
@echo Rodando o teste 04
java Meuphoria < ./test_cases/happy_path/teste04_imprimir_variaveis.in > ./test_cases/resultados/happy_path/teste04_imprimir_variaveis.out
@echo Rodando o teste 05
java Meuphoria < ./test_cases/happy_path/teste05_chaves_sequencia.in > ./test_cases/resultados/happy_path/teste05_chaves_sequencia.out
@echo Rodando o teste 06
java Meuphoria < ./test_cases/happy_path/teste06_operadoresAritimeticos.in > ./test_cases/resultados/happy_path/teste06_operadoresAritimeticos.out
@echo Rodando o teste 07
java Meuphoria < ./test_cases/happy_path/teste07_operadoresLogicos.in > ./test_cases/resultados/happy_path/teste07_operadoresLogicos.out
@echo Rodando o teste 08
java Meuphoria < ./test_cases/happy_path/teste08_operadoresAtribuicao.in > ./test_cases/resultados/happy_path/teste08_operadoresAtribuicao.out
@echo Rodando o teste 09
java Meuphoria < ./test_cases/happy_path/teste09_if_statement.in > ./test_cases/resultados/happy_path/teste09_if_statement.out
@echo Rodando o teste 10
java Meuphoria < ./test_cases/happy_path/teste10_switch_statement.in > ./test_cases/resultados/happy_path/teste10_switch_statement.out
@echo Rodando o teste 11
java Meuphoria < ./test_cases/happy_path/teste11_while_statement.in > ./test_cases/resultados/happy_path/teste11_while_statement.out
@echo Rodando o teste 12
java Meuphoria < ./test_cases/happy_path/teste12_for_statement.in > ./test_cases/resultados/happy_path/teste12_for_statement.out
@echo Rodando o teste 13
java Meuphoria < ./test_cases/happy_path/teste13_flow_exit.in > ./test_cases/resultados/happy_path/teste13_flow_exit.out
@echo Rodando o teste 14
java Meuphoria < ./test_cases/happy_path/teste14_flow_break.in > ./test_cases/resultados/happy_path/teste14_flow_break.out
@echo Rodando o teste 15
java Meuphoria < ./test_cases/happy_path/teste15_flow_continue.in > ./test_cases/resultados/happy_path/teste15_flow_continue.out
@echo Rodando o teste 16
java Meuphoria < ./test_cases/happy_path/teste16_procedure.in > ./test_cases/resultados/happy_path/teste16_procedure.out
@echo Rodando o teste 17
java Meuphoria < ./test_cases/happy_path/teste17_function.in > ./test_cases/resultados/happy_path/teste17_function.out
@echo Rodando o teste 18
java Meuphoria < ./test_cases/happy_path/teste18_our_function.in > ./test_cases/resultados/happy_path/teste18_our_function.out
@echo Rodando o teste 19
java Meuphoria < ./test_cases/happy_path/teste20_prioridade.in > ./test_cases/resultados/happy_path/teste20_prioridade.out
@echo Rodando o teste 20
java Meuphoria < ./test_cases/happy_path/teste21_retornoVariavel.in > ./test_cases/resultados/happy_path/teste21_retornoVariavel.out
@echo Rodando o teste 21



java Meuphoria < ./test_cases/sad_path/teste01_variavel_acentuada.in > ./test_cases/resultados/sad_path/teste01_variavel_acentuada.out
@echo Rodando o teste 22
java Meuphoria < ./test_cases/sad_path/teste02_caractere_especial_1.in > ./test_cases/resultados/sad_path/teste02_caractere_especial_1.out
@echo Rodando o teste 23
java Meuphoria < ./test_cases/sad_path/teste03_caractere_especial_2.in > ./test_cases/resultados/sad_path/teste03_caractere_especial_2.out
@echo Rodando o teste 24
java Meuphoria < ./test_cases/sad_path/teste04_caractere_especial_3.in > ./test_cases/resultados/sad_path/teste04_caractere_especial_3.out
@echo Rodando o teste 25
java Meuphoria < ./test_cases/sad_path/teste05_numero_variavel.in > ./test_cases/resultados/sad_path/teste05_numero_variavel.out
@echo Rodando o teste 26
java Meuphoria < ./test_cases/sad_path/teste06_comentario_bloco_aberto.in > ./test_cases/resultados/sad_path/teste06_comentario_bloco_aberto.out
@echo Rodando o teste 27
java Meuphoria < ./test_cases/sad_path/teste07_variavel_30_char.in > ./test_cases/resultados/sad_path/teste07_variavel_30_char.out
@echo Rodando o teste 28
java Meuphoria < ./test_cases/sad_path/teste08_variavel_30_char_2.in > ./test_cases/resultados/sad_path/teste08_variavel_30_char_2.out
@echo Rodando o teste 29
java Meuphoria < ./test_cases/sad_path/teste09_if_aberto_1.in > ./test_cases/resultados/sad_path/teste09_if_aberto_1.out
@echo Rodando o teste 30
java Meuphoria < ./test_cases/sad_path/teste10_setar variaveis.in > ./test_cases/resultados/sad_path/teste10_setar variaveis.out
@echo Rodando o teste 31
java Meuphoria < ./test_cases/sad_path/teste11_if_statement_3.in > ./test_cases/resultados/sad_path/teste11_if_statement_3.out
@echo Rodando o teste 32
java Meuphoria < ./test_cases/sad_path/teste12_atribuicao_errada.in > ./test_cases/resultados/sad_path/teste12_atribuicao_errada.out
@echo Rodando o teste 33
java Meuphoria < ./test_cases/sad_path/teste13_while_no_do_statement.in > ./test_cases/resultados/sad_path/teste13_while_no_do_statement.out
@echo Rodando o teste 34
java Meuphoria < ./test_cases/sad_path/teste14_comentario.in > ./test_cases/resultados/sad_path/teste14_comentario.out
@echo Rodando o teste 35
java Meuphoria < ./test_cases/sad_path/teste15_chaves_sequencia.in > ./test_cases/resultados/sad_path/teste15_chaves_sequencia.out
@echo Rodando o teste 36
java Meuphoria < ./test_cases/sad_path/teste16_for_statement.in > ./test_cases/resultados/sad_path/teste16_for_statement.out
@echo Rodando o teste 37
java Meuphoria < ./test_cases/sad_path/teste17_for_statement_2.in > ./test_cases/resultados/sad_path/teste17_for_statement_2.out
@echo Rodando o teste 38
java Meuphoria < ./test_cases/sad_path/teste18_atribuicao_errada3.in > ./test_cases/resultados/sad_path/teste18_atribuicao_errada3.out
@echo Rodando o teste 39
java Meuphoria < ./test_cases/sad_path/teste19_varSemValor.in > ./test_cases/resultados/sad_path/teste19_varSemValor.out
@echo Rodando o teste 40
java Meuphoria < ./test_cases/sad_path/teste20_varNaoDeclarada.in > ./test_cases/resultados/sad_path/teste20_varNaoDeclarada.out
@echo Rodando o teste 41
java Meuphoria < ./test_cases/sad_path/teste21_varRedeclarada.in > ./test_cases/resultados/sad_path/teste21_varRedeclarada.out
@echo Rodando o teste 42
java Meuphoria < ./test_cases/sad_path/teste22_divZero.in > ./test_cases/resultados/sad_path/teste22_divZero.out
@echo Rodando o teste 43
java Meuphoria < ./test_cases/sad_path/teste23_varRedeclaradaTipoDifer.in > ./test_cases/resultados/sad_path/teste23_varRedeclaradaTipoDifer.out
@echo Rodando o teste 44
java Meuphoria < ./test_cases/sad_path/teste24_opLadoEsquerdo.in > ./test_cases/resultados/sad_path/teste24_opLadoEsquerdo.out
@echo Rodando o teste 45
java Meuphoria < ./test_cases/sad_path/teste25_tiposIncopativeis.in > ./test_cases/resultados/sad_path/teste25_tiposIncopativeis.out
@echo Rodando o teste 46
java Meuphoria < ./test_cases/sad_path/teste26_seqForaLimite.in > ./test_cases/resultados/sad_path/teste26_seqForaLimite.out
@echo Rodando o teste 47
java Meuphoria < ./test_cases/sad_path/teste27_funcSemRetorno.in > ./test_cases/resultados/sad_path/teste27_funcSemRetorno.out
@echo Rodando o teste 48
java Meuphoria < ./test_cases/sad_path/teste28_funcTipoParametro.in > ./test_cases/resultados/sad_path/teste28_funcTipoParametro.out
@echo Rodando o teste 49
java Meuphoria < ./test_cases/sad_path/teste29_funcNumParametros.in > ./test_cases/resultados/sad_path/teste29_funcNumParametros.out
@echo Rodando o teste 50
java Meuphoria < ./test_cases/sad_path/teste30_chamarVariavel.in > ./test_cases/resultados/sad_path/teste30_chamarVariavel.out
@echo Rodando o teste 51
java Meuphoria < ./test_cases/sad_path/teste31_funArgRedeclarado.in > ./test_cases/resultados/sad_path/teste31_funArgRedeclarado.out



@echo.
@echo OS RESULTADOS DOS TESTES SE ENCONTRAM NA PASTA RESULTADOS
@echo.
@echo.
PAUSE