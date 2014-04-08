************************************ MeuPhoria ******************************************

	Este arquivo tem como função discorrer sobre o desenvolvimento e compilação passo-a-passo do parser MeuPhoria.

	Para iniciar a compilação do parser MeuPhoria, é necessário gerar os arquivos java’s a partir do léxico e gramática descritos no arquivo .jj. Para isso, basta instalar o javacc em seu computador, e então executar a linha de comando:
	javacc meuphoriaLex.jj

	Após isso, os arquivos java’s serão criados, sendo estes: 
		LISTAR ARQUIVOS JAVA

	Estes arquivos devem ser compilados pelo java em um único programa, sendo possível fazer isso com a linha de comando:
	javac *.java

	ENCONTREI ERRO AQUI… =/