# Java CRUD MySQL

Sistema CRUD desenvolvido em Java com integração ao banco de dados MySQL utilizando JDBC e conceitos de Programação Orientada a Objetos (POO).

## 📚 Sobre o Projeto

Este projeto foi desenvolvido como atividade acadêmica da disciplina de Programação Orientada a Objetos com o objetivo de implementar operações CRUD (Create, Read, Update e Delete) utilizando Java e MySQL.

A aplicação realiza o gerenciamento de disciplinas acadêmicas por meio de uma estrutura organizada em camadas, aplicando boas práticas de orientação a objetos e persistência de dados.

---

## 🚀 Funcionalidades

- ✅ Cadastro de disciplinas
- ✅ Listagem de registros
- ✅ Atualização de disciplinas
- ✅ Exclusão de registros
- ✅ Integração com banco de dados MySQL
- ✅ Conexão via JDBC
- ✅ Estrutura organizada em camadas

---

## 🛠 Tecnologias Utilizadas

- Java
- JDBC
- MySQL
- Eclipse IDE
- Programação Orientada a Objetos (POO)

---

## 🧠 Conceitos Aplicados

- CRUD
- DAO (Data Access Object)
- Encapsulamento
- Classes e Objetos
- Conexão com Banco de Dados
- SQL
- Modelagem de Entidades
- Separação de responsabilidades

---

## 📂 Estrutura do Projeto

```text
src/
│
├── connection/
│   └── ConnectionFactory.java
│
├── dao/
│   └── DisciplinaDAO.java
│
├── model/
│   └── Disciplina.java
│
└── Main.java
```

---

## 🗄 Banco de Dados

### Script SQL

```sql
CREATE DATABASE faculdade;

USE faculdade;

CREATE TABLE disciplinas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100),
    professor VARCHAR(100)
);
```

---

## ▶️ Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
```

### 2. Abra o projeto no Eclipse

- File → Open Projects from File System

### 3. Configure o banco MySQL

Atualize as credenciais no arquivo:

```java
ConnectionFactory.java
```

```java
private static final String URL =
"jdbc:mysql://localhost:3306/faculdade";

private static final String USER = "root";

private static final String PASSWORD = "123456";
```

### 4. Execute o script SQL

Crie o banco e a tabela no MySQL.

### 5. Execute a classe Main

O sistema realizará:
- Inserção
- Consulta
- Atualização
- Exclusão

---

## 📖 Exemplo de Operações

### CREATE
```java
Disciplina d1 = new Disciplina(
    "Programacao Orientada a Objetos",
    "Carlos Silva"
);

dao.inserir(d1);
```

### READ
```java
dao.listar();
```

### UPDATE
```java
dao.atualizar(d2);
```

### DELETE
```java
dao.deletar(1);
```

---

## 🎓 Objetivo Acadêmico

Projeto desenvolvido para aplicação prática dos conceitos de:

- Programação Orientada a Objetos
- Persistência de Dados
- JDBC
- Integração Java + MySQL
- Estruturação de aplicações em camadas

---

## 👨‍💻 Autor

Rodrigo Araújo

---

## 📌 Status do Projeto

✅ Finalizado
