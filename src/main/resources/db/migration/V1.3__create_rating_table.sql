CREATE TABLE IF NOT EXISTS rating(
id_rating SERIAL PRIMARY KEY,
student_id SERIAL NOT NULL,
subject_id SERIAL NOT NULL,
rate DECIMAL(10,2),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted BOOLEAN,

CONSTRAINT fk_student
FOREIGN KEY(student_id)
REFERENCES student(id_student),

CONSTRAINT fk_subject
FOREIGN KEY(subject_id)
REFERENCES subject(id_subject)
);