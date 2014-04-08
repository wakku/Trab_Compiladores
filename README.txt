************************************ MeuPhoria ******************************************

Integrantes: 
  Caio Gomes                      7239072
  Diego Gomes                     7656467
  Fernando Cury Gorodscy	  7152354
  Roberty Manzini Bertolo         7573399
  Vanessa Apolinário Lima         7239256

Documento:
  Instruções de Compilação

*****************************************************************************************

	Este arquivo tem como função discorrer sobre o desenvolvimento e compilação passo-a-passo do parser MeuPhoria.

	Para iniciar a compilação do parser MeuPhoria, é necessário gerar os arquivos java’s a partir do léxico e gramática descritos no arquivo .jj. Para isso, basta instalar o javacc em seu computador, e então executar a linha de comando:

		javacc meuphoriaLex.jj

	Após isso, os arquivos java’s serão criados, estes arquivos devem ser compilados pelo java em um único programa, sendo possível fazer isso com a linha de comando:
	
		javac *.java

	Para utilizar o parser, deve-se usar o comando:
		
		java Meuphoria < test_case/(Nome_do_Arquivo)

	Ou então, apenas execute:
		
		java Meuphoria

	E teste o programa digitando o código.



ALTERNATIVA PARA NÃO INSTALAR O JAVACC
	
	Caso não deseje instalar o javacc, é possível fazer o download do arquivo jar do javacc, e dessa forma, substituir o primeiro comando pela linha:

		java -cp (PATH)/javacc.jar javacc meuphoriaLex.jj

	E siga o restante dos passos anteriores.



ALTERNATIVA JAR

	Apenas execute o comando:

	    java -jar AnalisadorLexico.jar < bc/(FileName).bc 

    				ou 

	    java -jar AnalisadorLexico.jar        // e teste =D


