# Padrões de projeto

## Criacionais

### **Builder**

- **Descrição**

Permite criar objetos complexos usando o mesmo código de construção.

- **Problema**

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

- **Solução**

O padrão builder permite extrair a construção do objeto para uma classe separada.

- **Componentes**
  * Builder (interface): contém os steps em comum que o builder pode implementar. Permite criar um objeto utilizando apenas os steps necessários
  * Director: É opcional. Encapsula a rotina de steps que é geralmente usada no código, permitindo reuso do código.
  * ConcreteBuilders: provém diferentes implementações da classe builder.

![builder](https://github.com/donOnerb/estudos-design-patterns/blob/main/components/builder.png "builder components")

- **Vantagens**
  1. Separar em pequenas partes a construção de um objeto complexo;
  2. Redução da extensão e complexidade de uma classe;
  3. Encapsulamento de código;
  4. Permitir diferentes representações do objeto a ser construído;
  5. O código para construção é isolado do código de representação, e estes são facilmente alterados sem afetar uns aos outros;
  6. Criação de objetos complexos independentes das partes que o compõem;

- **Desvantagens**
  1. Quando o construtor base é mal elaborado, pode resultar em construções redundantes e mal aproveitadas;
  2. Pouco útil em situações em que há objetos com poucos parâmetros;
  3. Custo de performance (pouco perceptível) pela necessidade de sempre chamar o Builder antes da utilização do objeto.

### **Prototype**

- **Descrição**

O padrão Prototype é aplicado quando existe a necessidade de criar cópias exatas de algum objeto em tempo de execução. 

- **Problema**

Para criar um clone de outro objeto não basta apenas copiar os valores de todos os atributos, pois alguns atributos são privados. Em outros casos, só é conhecida a interface do objeto.

**Sem utilizar o padrão prototype**

```
public abstract class Carro implements Cloneable {
    public String nomeModelo;
    public int preco;

    public String getNomeModelo()
    {
            return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo)
    {
            this.nomeModelo = nomeModelo;
    }

    public static int setPreco()
    {
            int preco = 0;
            Random r = new Random();
            int p = r.nextInt(100000);
            preco = p;

            return preco;
    }

    public Carro clone() throws CloneNotSupportedException
    {
            return (Carro)super.clone();
    }
}

 public class Chevrolet extends Carro {
        public Chevrolet(String m)
        {
                nomeModelo = m;
        }

        @Override
        public Carro clone() throws CloneNotSupportedException
        {
                return (Chevrolet)super.clone();
        }
    }

public class Ford extends Carro {
       public Ford(String m)
       {
             nomeModelo = m;
       }

       @Override
       public Carro clone() throws CloneNotSupportedException
       {
             return (Ford)super.clone();
       }
}
```

- **Solução**

O padrão prototype delega a responsabilidade de clonar o objeto ao próprio objeto que está sendo clonado.

**Utilizando o prototype**

```
public class PrototypePatternEx {

    public static void main(String args[]) throws CloneNotSupportedException {

        System.out.println("***Exemplo do padrão Prototype***\n");
        Carro chevrolet = new Chevrolet("Cruze Sport v6");
        chevrolet.preco = 100000;
        Carro ford = new Ford("Focus 2.0");
        ford.preco = 500000;

        Carro bc1;
        //Clone do Objeto Chevrolet
        bc1 = chevrolet.clone();

        //Configurando preço que será maior que 100000
        bc1.preco = chevrolet.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

        //Clone do Objeto Ford
        bc1 = ford.clone();

        //Configurando preço que será maior que 500000
        bc1.preco = ford.preco + Carro.setPreco();
        System.out.println("Nome do Carro: " + bc1.getNomeModelo() + ", Preço do Carro: " + bc1.preco);

    }
}
```

- **Componentes**
    * Prototype: geralmente contém apenas o método clone
    * Concrete Prototype: implementa o método clone.
    * Client: produz uma cópia do protótipo.

![prototype](/components/prototype.png?style=centerme "prototype components")

- **Vantagens**

    1. Você pode clonar objetos sem acoplá-los a suas classes concretas.
    2. Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
    3. Você pode produzir objetos complexos mais convenientemente.

- **Desvantagens**

    1. Clonar objetos complexos que têm referências circulares pode ser bem complicado.
    2. Cada subclasse de prototype deve implementar a operação clone, o que pode ser difícil. Por exemplo, acrescentar clone é complicado quando as classes consideradas já     existem.

### **Factory**

### **Abstract Factory**

### **Singleton**
