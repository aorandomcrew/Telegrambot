-- liquibase formatted sql

-- changeset dbogomolov:2024-04-25
CREATE TABLE Shelter(
    id bigserial PRIMARY KEY,
    type varchar,
    address varchar
);
CREATE TABLE Pet(
    id bigserial PRIMARY KEY,
    type varchar,
    status varchar,
    name varchar,
    FOREIGN KEY (id) REFERENCES Shelter
);
CREATE TABLE Parent(
    id bigserial PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    phone_number varchar,
    FOREIGN KEY (id) REFERENCES Pet
);
CREATE TABLE Volunteer(
    id bigserial PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    phone_number varchar,
    FOREIGN KEY (id) REFERENCES Shelter
);

