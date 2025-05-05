create database SISTEMA;
use SISTEMA;

create table usuario (
NOME VARCHAR(100),
EMAIL VARCHAR(100) UNIQUE,
SENHA VARCHAR(100)
);

select*from usuario;