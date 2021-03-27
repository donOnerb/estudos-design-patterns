# Padrões de projeto

## Criacionais

### **Builder**

- Descrição

Permite criar objetos complexos usando o mesmo código de construção.

- Problema

A construção de um objeto mais complexo (muitos campos e/ou objetos aninhados) pode ser feita direto em um construtor enorme ou espalhado pelo código.
Nem sempre todos os parâmetros do construtor são necessários:
```
public class Main {
    public static void main(String[] args) {
 
        var casaSimples = new Casa(2, 2, new Teto("cerâmica"));
 
        // nem todos os parâmetros são sempre utilizados
        var casaComJardim = new Casa(4, 4, new Teto("cerâmica"), null, false, null, null, new Jardim(new ArrayList<Flor>()));
 
    }
}
```

Uma forma de mitigar o problema de vários parâmetros subutilizados é criar variações de construtor. A técnica que consiste em sobrecarregar o construtor com várias versões é chamada de construtor telescópico. 

```
package com.design.patterns.creational.builder.model;
 
import java.util.List;
 
public class Casa {
 
    private int numPortas;
    private int numJanelas;
    private Teto teto;
    private Piscina piscina;
    private boolean painelSolar;
    private List<ArCondicionado> arCondicionado;
    private Garagem garagem;
    private Jardim jardim;
 
    public Casa(int numPortas, int numJanelas, Teto teto) {
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.teto = teto;
    }
 
    public Casa(int numPortas, int numJanelas, Teto teto, Jardim jardim) {
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.teto = teto;
        this.jardim = jardim;
    }
 
    public Casa(int numPortas, int numJanelas, Teto teto, Piscina piscina, boolean painelSolar, List<ArCondicionado> arCondicionado, Garagem garagem, Jardim jardim) {
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.teto = teto;
        this.piscina = piscina;
        this.painelSolar = painelSolar;
        this.arCondicionado = arCondicionado;
        this.garagem = garagem;
        this.jardim = jardim;
    }
}
```
Porém diminui a legibilidade do código, e ao adicionarmos mais atributos na classe é necessário atualizar um construtor já existente ou criar uma nova variação.

- Solução

O padrão builder permite extrair a construção do objeto para uma classe separada.

- Componentes
  * Builder (interface): contém os steps em comum que o builder pode implementar. Permite criar um objeto utilizando apenas os steps necessários
  * Director: É opcional. Encapsula a rotina de steps que é geralmente usada no código, permitindo reuso do código.
  * ConcreteBuilders: provém diferentes implementações da classe builder.

Markup : ![builder](https://github.com/donOnerb/estudos-design-patterns/blob/main/components/builder.png "builder components")

- Vantages
  1. Separar em pequenas partes a construção de um objeto complexo;
  2. Redução da extensão e complexidade de uma classe;
  3. Encapsulamento de código;
  4. Permitir diferentes representações do objeto a ser construído;
  5. O código para construção é isolado do código de representação, e estes são facilmente alterados sem afetar uns aos outros;
  6. Criação de objetos complexos independentes das partes que o compõem;

- Desvantagens
  1. Quando o construtor base é mal elaborado, pode resultar em construções redundantes e mal aproveitadas;
  2. Pouco útil em situações em que há objetos com poucos parâmetros;
  3. Custo de performance (pouco perceptível) pela necessidade de sempre chamar o Builder antes da utilização do objeto.

### **Prototype**

### **Factory**

### **Abstract Factory**

### **Singleton**
