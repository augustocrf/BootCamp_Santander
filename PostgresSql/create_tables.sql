---CREATE DATABASE financas;


CREATE TABLE IF NOT EXISTS banco (
	numero INTEGER NOT NULL,
	nome	VARCHAR(50) NOT NULL,
	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (numero)
);

CREATE TABLE IF NOT EXISTS agencia (
	banco_numero INTEGER NOT NULL,
	numero INTEGER NOT NULL,
	nome VARCHAR(80) NOT NULL,
	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (banco_numero, numero),
	FOREIGN KEY (banco_numero) REFERENCES banco (numero)
);

CREATE TABLE cliente (
	numero BIGSERIAL PRIMARY KEY,
	nome VARCHAR(120) NOT NULL,
	email VARCHAR(250) NOT NULL,
	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE tipo_conta (
	numero SMALLINT PRIMARY KEY,
	nome VARCHAR(80) NOT NULL,
	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP

);

CREATE TABLE conta
(
	banco_numero INTEGER NOT NULL,
	agencia_numero INTEGER NOT NULL,
	tipo_conta_numero SMALLINT NOT NULL,
	numero BIGINT NOT NULL,
	digito SMALLINT NOT NULL,
	cliente_numero BIGINT NOT NULL,
	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (banco_numero, agencia_numero, tipo_conta_numero, numero, digito, cliente_numero),
	FOREIGN KEY (banco_numero, agencia_numero) REFERENCES agencia (banco_numero, numero),
	FOREIGN KEY (tipo_conta_numero) REFERENCES tipo_conta (numero),
	FOREIGN KEY (cliente_numero) REFERENCES cliente (numero)
);


CREATE TABLE tipo_transacao(
	id SMALLSERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
 	ativo	BOOLEAN NOT NULL DEFAULT TRUE,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE cliente_transacoes (
	id BIGSERIAL PRIMARY KEY,
	banco_numero INTEGER NOT NULL,
	agencia_numero INTEGER NOT NULL,
	tipo_conta_numero SMALLINT NOT NULL,
	conta_numero BIGINT NOT NULL,
	conta_digito SMALLINT NOT NULL,
	cliente_numero BIGINT NOT NULL,
	tipo_transacao_id SMALLINT NOT NULL,
	valor NUMERIC(15,2) NOT NULL,
	data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (banco_numero, agencia_numero, tipo_conta_numero, conta_numero, conta_digito, cliente_numero) REFERENCES conta (banco_numero, agencia_numero, tipo_conta_numero, numero, digito, cliente_numero)
);
