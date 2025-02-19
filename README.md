Conversor de Moedas - Java

📌 Sobre o Projeto
Este é um projeto desenvolvido em Java utilizando conceitos de Orientação a Objetos. O programa permite:

- 🪙 Adicionar moedas de diferentes valores e países ao sistema.
- 💰 Remover moedas específicas do sistema.
- 👉 Listar todas as moedas que estão dentro do cofrinho.
- 🔄 Calcular o total de dinheiro e converter em Real.

🚀 Tecnologias Utilizadas

- Java (JDK 8+)
- IDE Eclipse
- Paradigma de Programação Orientada a Objetos (POO) - Herança e Polimorfismo
- Git/GitHub para versionamento

📂 Estrutura do Projeto
📁 trabalho cofrinho
┣ 📂 src
┣ 📂 faculdade
┃ ┣ 📜 Principal.java
┃ ┣ 📜 Moeda.java
┃ ┣ 📜 Cofrinho.java
┃ ┗ 📜 Dollar.java
┃ ┗ 📜 Euro.java
┃ ┗ 📜 Real.java
┗ 📜 README.md

📝 Explicação das Classes

- Principal.java → Contém o `main()` e a interface de interação com o usuário.
- Moeda.java → é uma classe abstrata mãe que serve como base para diferentes tipos de moedas (por exemplo, Real, Dólar, Euro, etc.). Ela define um conjunto de atributos e métodos que todas as subclasses de moeda devem implementar.
- Cofrinho.java → gerencia um cofrinho de moedas, permitindo adicionar, remover, listar e calcular o valor total em reais.
- **Dollar.java, Real.java e **Euro.java →
  -Herdadas de Moeda, representando cada tipo de moeda.
  \*\*Conversão para Real (BRL) usando uma taxa de câmbio fixa (1 EUR = 6.09 BRL).
  -Exibição de informações sobre a moeda e seu valor convertido.
  -Comparação entre objetos para verificar se duas moedas são iguais.

📦 Como Executar o Projeto
1️⃣ Clonar o Repositório
git clone - https://github.com/jennyAdo/Conversor-de-Moedas-java.git
cd Conversor-de-Moedas-java
2️⃣ Compilar o Projeto
javac src/\*.java
3️⃣ Executar
java src.Main

🏆 Funcionalidades
✅ Adicionar moedas
✅ Remover moedas
✅ Listar moedas disponíveis
✅ Converter valores entre moedas

🛠 Melhorias Futuras

- [ ] Criar uma interface gráfica
- [ ] Adicionar suporte a APIs de câmbio para valores reais
- [ ] Permitir persistência de dados

---

💡Autor:[Jennifer Caroline de Oliveira Adomaitis](https://github.com/jennyAdo)
