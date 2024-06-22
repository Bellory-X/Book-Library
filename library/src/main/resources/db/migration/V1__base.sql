create table book(
    id uuid primary key default gen_random_uuid(),
    title varchar not null,
    author varchar not null,
    isbn varchar not null
);

create table client
(
    id               uuid primary key default gen_random_uuid(),
    surname          varchar not null,
    name             varchar not null,
    patronymic       varchar not null,
    date_of_birthday date    not null
);

create table client_book(
    client_id uuid not null references client,
    book_id uuid not null references book,
    capture date not null,
    primary key (client_id, book_id)
)
