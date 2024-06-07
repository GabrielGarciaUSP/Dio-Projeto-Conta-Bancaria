# ContaTerminal

## Autor 
- [Gabriel Garcia](https://github.com/GabrielGarciaUSP)

Este projeto consiste em uma aplicação Java simples que simula a criação de uma conta bancária através da interação com o terminal. O usuário é solicitado a fornecer algumas informações básicas, como número da conta, agência, nome do cliente e saldo inicial, e o programa exibe uma mensagem de confirmação com os dados fornecidos.

## Estrutura do Projeto

O projeto é composto por uma única classe chamada `ContaTerminal`, que contém toda a lógica necessária para a interação com o usuário e a exibição da mensagem final.

### Classe `ContaTerminal`

#### Importação da Classe Scanner

A classe Scanner é importada para permitir a leitura da entrada do usuário a partir do terminal.

```java
import java.util.Scanner;

#### Criação do Scanner

Uma instância da classe Scanner é criada para ler as entradas fornecidas pelo usuário.

"Scanner scanner = new Scanner(System.in);"

#### Leitura dos Dados Inseridos

"numero = scanner.nextInt();"

Utilizamos essa função para receber o valor digitado pelo usuário e inseri-lo na variável.

#### Fechamento do Scanner

"scanner.close();"

#### Finalização

Por fim, imprimimos todos os dados do usuário conforme pedido na proposta do projeto.

"String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                  ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
System.out.println(mensagem);"

#### Melhorias a serem feitas

Futuramente pretendo fazer melhorias neste projeto para que possa ser possível o saque, depósito, e transferência
entre contas bancárias.