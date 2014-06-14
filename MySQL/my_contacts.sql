CREATE TABLE my_contacts
(
	last_name VARCHAR(30) NOT NULL,
	first_name VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL,
	gender CHAR(1) NOT NULL,
	birthday DATE NOT NULL,
	profession VARCHAR(50) NOT NULL,
	location VARCHAR(50) NOT NULL,
	status VARCHAR(20) NOT NULL,
	interests VARCHAR(100) NOT NULL,
	seeking VARCHAR(100) NOT NULL
);

INSERT INTO my_contacts
(last_name, first_name, email, gender, birthday,
profession, location, status, interests,
seeking)
VALUES
('Anderson', 'Jillian', 'jill_anderson@breakneckpizza.com',
'F', '1980-09-05',
'Technical Writer', 'Palo Alto, CA', 'Single',
'Kayaking, Reptiles', 'Relationship, Friends');