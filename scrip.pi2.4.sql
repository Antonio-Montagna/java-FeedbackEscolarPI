CREATE DATABASE java_pi;

USE java_pi;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    cpf VARCHAR(20),
    senha VARCHAR(100),
    tipo ENUM('aluno', 'professor', 'admin') NOT NULL
);

CREATE TABLE feedbacks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    texto TEXT NOT NULL,
    anonimo BOOLEAN NOT NULL,
    categoria VARCHAR(50),
    disciplina VARCHAR(50),
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

INSERT INTO usuarios (nome, email, cpf, senha, tipo) 
VALUES("Antonio", "antonio@gmail.com", "835.131.871-14", "1234", 'admin'),
("Junior", "junior@gmail.com", "632.238.623-41", "1234", 'aluno'),
("Laura", "laura@gmail.com", "155.265.900-05", "1234", 'professor');

SELECT * FROM feedbacks;
