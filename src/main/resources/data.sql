CREATE TABLE company
(
id NUMERIC not null,
name VARCHAR(255),
PRIMARY KEY(id)
);
INSERT INTO company(id, name) VALUES(1, 'Fred');
INSERT INTO company(id, name) VALUES(2, 'Tom');