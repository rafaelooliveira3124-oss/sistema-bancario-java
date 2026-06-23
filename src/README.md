# Sistema Bancário em Java

## Sobre o Projeto

Este é um projeto de estudo desenvolvido em Java com o objetivo de praticar os principais conceitos de Programação Orientada a Objetos (POO), controle de fluxo, encapsulamento e integração com Git e GitHub.

O sistema funciona através de um menu interativo no terminal, permitindo a criação e gerenciamento básico de uma conta bancária.

## Funcionalidades

* Criar conta bancária
* Consultar saldo
* Realizar depósitos
* Realizar saques
* Validação de operações inválidas
* Encerramento do sistema pelo menu

## Conceitos Aplicados

### Programação Orientada a Objetos

* Classes e Objetos
* Construtores
* Encapsulamento
* Getters e Setters
* Métodos de negócio

### Estruturas da Linguagem

* Condicionais (`if` e `else`)
* Estrutura de repetição (`do-while`)
* Estrutura de seleção (`switch`)
* Manipulação de entrada de dados com `Scanner`

### Controle de Versão

* Git
* GitHub
* Commits incrementais

## Estrutura do Projeto

```text
src/
├── Main.java
└── Conta.java
```

### Classe Conta

Responsável por representar uma conta bancária.

Atributos:

* Nome do titular
* Número da conta
* Saldo

Métodos:

* depositar()
* sacar()
* getSaldo()
* getNomeTitular()
* getNumeroConta()

### Classe Main

Responsável pela interação com o usuário através do terminal, exibindo o menu e executando as operações disponíveis.

## Regras de Negócio

### Depósito

* O valor deve ser maior que zero.
* Valores negativos ou iguais a zero são recusados.

### Saque

* O valor deve ser maior que zero.
* O valor não pode ser maior que o saldo disponível.
* Operações inválidas são recusadas.

## Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/rafaelooliveira3124-oss/sistema-bancario-java
```

2. Abra o projeto em sua IDE Java de preferência.

3. Execute o arquivo `Main.java`.

## Objetivo de Aprendizado

Este projeto faz parte da minha jornada de aprendizado em desenvolvimento Java e foi criado para reforçar conceitos fundamentais de programação orientada a objetos e boas práticas de desenvolvimento.
