# Processo Seletivo Simulado em Java

Este projeto é uma simulação de um processo seletivo para candidatos a uma vaga de emprego. Ele foi desenvolvido em Java e utiliza conceitos como estruturas de repetição, condicionais, arrays e métodos para simular as etapas de seleção, contato e análise de candidatos.

---

## Funcionalidades Principais

1. **Seleção de Candidatos**:
   - O sistema seleciona candidatos com base no salário pretendido, comparando-o com um salário base pré-definido (R$ 2000,00).
   - Candidatos que solicitam um salário igual ou inferior ao salário base são selecionados para a vaga.

2. **Simulação de Contato**:
   - O sistema tenta entrar em contato com os candidatos selecionados, simulando até 3 tentativas de ligação.
   - A resposta do candidato (atendeu ou não) é simulada aleatoriamente.

3. **Análise de Candidatos**:
   - O sistema analisa o salário pretendido de cada candidato e decide se deve:
     - Ligar diretamente para o candidato (salário pretendido menor que o salário base).
     - Fazer uma contraproposta (salário pretendido igual ao salário base).
     - Aguardar o resultado de outros candidatos (salário pretendido maior que o salário base).

4. **Impressão de Candidatos Selecionados**:
   - O sistema imprime a lista de candidatos selecionados, mostrando o índice e o nome de cada um.

---

## Como Funciona

1. **Seleção de Candidatos**:
   - O método `selecaoCandidatos()` itera sobre uma lista de candidatos e seleciona aqueles que solicitam um salário igual ou inferior ao salário base.

2. **Contato com Candidatos**:
   - O método `entrandoEmContato()` simula tentativas de contato com os candidatos selecionados. Ele tenta até 3 vezes e informa se o contato foi bem-sucedido ou não.

3. **Análise de Salário**:
   - O método `analisarCandidato()` compara o salário pretendido com o salário base e decide a ação a ser tomada (ligar, fazer contraproposta ou aguardar).

4. **Impressão de Resultados**:
   - O método `imprimirSelecionados()` exibe a lista de candidatos selecionados de duas formas: usando um loop `for` tradicional e um loop `for-each`.

---

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Bibliotecas**:
  - `java.util.Random`: Para gerar números aleatórios.
  - `java.util.concurrent.ThreadLocalRandom`: Para gerar valores aleatórios de salário pretendido.

---

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/processo-seletivo-java.git