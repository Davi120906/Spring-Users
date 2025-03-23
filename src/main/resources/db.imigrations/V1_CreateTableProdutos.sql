CREATE TABLE Produtos(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity int NOT NULL,
    price float NOT NULL
);