CREATE SCHEMA `voya` ;
use voya;
CREATE TABLE Usuarios (
    ID_Usuarios INT AUTO_INCREMENT PRIMARY KEY,
    Nome_completo VARCHAR(255),
    CPF VARCHAR(11),
    Endereco VARCHAR(255),
    Email VARCHAR(255),
    Telefone VARCHAR(11),
    Senha VARCHAR(255)
); 

CREATE TABLE Destinos (
    ID_Destinos INT AUTO_INCREMENT PRIMARY KEY,
    Formas_de_pagamento VARCHAR(255),
    Destino_da_viagem VARCHAR(255),
    Data_de_ida DATE,
    Data_de_volta DATE
); 

CREATE TABLE Promocoes (
    ID_Promocoes INT AUTO_INCREMENT PRIMARY KEY,
    ID_Destinos INT,
    ID_Usuarios INT,
    Descricao VARCHAR(255),
    Preco DECIMAL(10, 2),
    foreign key(ID_Destinos) references destinos(ID_Destinos),
    foreign key(ID_Usuarios) references usuarios(ID_Usuarios)
); 

    
select * from Usuarios;
select * from Destinos;
select * from Promocoes;