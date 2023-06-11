CREATE TABLE IF NOT EXISTS student(
id_student SERIAL PRIMARY KEY,
names VARCHAR,
last_name VARCHAR,
second_last_name VARCHAR,
is_active BOOLEAN
);