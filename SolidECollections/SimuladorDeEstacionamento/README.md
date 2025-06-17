# Atividade 1 - Simulador de Estacionamento

## Descrição

Implemente uma classe `Estacionamento` que simula o controle de entradas e saídas de veículos. Você deverá criar um enumerador chamado `TipoOperacao`, que define dois tipos de operação:

- **ENTRADA**: código `"IN"`, descrição `"Entrada no estacionamento"`
- **SAÍDA**: código `"OUT"`, descrição `"Saída do estacionamento"`

Cada operação registrada deve ser armazenada em um histórico contendo:

- Placa do veículo (`String`)
- Tipo de operação (usando o enum)
- Data e hora da operação

A classe `Estacionamento` deve ter:

- Um método `registrarOperacao(String placa, TipoOperacao tipo)`
- Um método `exibirHistorico()` que imprime todas as operações

## Funcionalidades implementadas

- Registrar operação de entrada ou saída de veículo, armazenando dados no histórico.
- Exibir o histórico completo de operações realizadas, mostrando placa, tipo e data/hora.

## Estrutura do código

- `Estacionamento.java`: Classe principal que controla as operações e armazena o histórico.
- `TipoOperacao.java`: Enum que define os tipos de operação (ENTRADA e SAÍDA).
- `Operacao.java`: Classe que representa uma operação individual, contendo placa, tipo e data/hora.
- `Main.java`: Classe com o método `main` para executar uma simulação simples do sistema.

## Como executar

1. Compile todas as classes, por exemplo, usando o terminal:

```bash
javac SimuladorDeEstacionamento/*.java
