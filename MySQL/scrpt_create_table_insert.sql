-- Create database 
CREATE database digital_innovation_one;

-- use database
USE digital_innovation_one;

-- Criar as tabelass
CREATE TABLE aluno (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    idade INTEGER NOT NULL,
    estado CHARACTER(2) NOT NULL
);

-- Adicionar alguns exemplos (rodar no prompt do MySQL OU no MySQL workbench)
INSERT INTO aluno(nome, idade, estado) VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');