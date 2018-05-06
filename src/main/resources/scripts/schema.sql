//Создаем таблицу Аккаунтов(Пользователей)
CREATE TABLE account(
	id SERIAL PRIMARY KEY,
	login VARCHAR(50) UNIQUE NOT NULL ,
	password VARCHAR(50) NOT NULL,
	fio VARCHAR(70) NOT NULL,
	is_online BOOLEAN NOT NULL
);

//Создаем таблицу Диалог
CREATE TABLE dialog(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	created DATE NOT NULL
);

//Создаем таблицу Участников диалога
CREATE TABLE dialogParticipant(
	id SERIAL PRIMARY KEY,
	account_id INTEGER NOT NULL REFERENCES account(id),
	dialog_id INTEGER NOT NULL REFERENCES dialog(id)
);

//Создаем таблицу Контакты
CREATE TABLE contact(
    id SERIAL PRIMARY KEY,
    account_id INTEGER NOT NULL REFERENCES account(id),
    friend_account_id INTEGER NOT NULL REFERENCES account(id)
);

//Создаем таблицу Сообщения
CREATE TABLE message(
    id SERIAL PRIMARY KEY,
    from_account_id INTEGER NOT NULL REFERENCES account(id),
    dialog_id INTEGER NOT NULL REFERENCES dialog(id),
    message VARCHAR(500) NOT NULL,
    sended DATE NOT NULL,
    is_readed BOOLEAN NOT NULL
);
