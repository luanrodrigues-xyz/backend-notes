# Exemplos: variáveis e referências em Java

Exemplos completos do artigo [Variáveis em Java. O que uma atribuição copia?](../../../articles/java/fundamentos/01-atribuicao-e-referencias/README.md).

Requer **JDK 21** (também usa recursos disponíveis em versões anteriores). Sem dependências externas.

Todos os arquivos Java estão no pacote padrão para facilitar a execução individual.

```sh
javac *.java
java PrimitiveCopyExample
java SharedReferenceExample
java IndependentObjectsExample
java ReassignmentExample
java FinalReferenceExample
```

Para verificar a restrição de `final`, descomente a linha indicada em `FinalReferenceExample.java` e compile novamente. O compilador deve rejeitar a reatribuição.
