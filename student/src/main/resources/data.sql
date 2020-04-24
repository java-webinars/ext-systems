INSERT INTO sr_university (university_name) VALUES ('University One');
INSERT INTO sr_university (university_name) VALUES ('University Two');

INSERT INTO sr_faculty (university_id, faculty_name) VALUES (1, 'Faculty One');
INSERT INTO sr_faculty (university_id, faculty_name) VALUES (1, 'Faculty Two');
INSERT INTO sr_faculty (university_id, faculty_name) VALUES (2, 'Faculty Other One');
INSERT INTO sr_faculty (university_id, faculty_name) VALUES (2, 'Faculty Other Two');

INSERT INTO sr_student (last_name, first_name, middle_name, date_of_birth,
passport_seria, passport_number, passport_date)
VALUES ('Last', 'First', 'Middle', '2000-04-12', '1111', '222222', '2016-04-30');

INSERT INTO sr_student_document (document_number, document_date, expired_date,
student_id, faculty_id, student_form)
VALUES ('123456', '2017-09-01', '2021-05-31', 1, 1, 0);