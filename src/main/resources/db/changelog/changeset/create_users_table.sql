CREATE TABLE IF NOT EXISTS users (
    id          UUID not null,
    first_name  varchar(55),
    surname     varchar(55),
    nickname    varchar(55),
    email       varchar(55),
    password    varchar(55),
    activate    boolean not null default false,
    user_role   varchar(55),
    primary key (id)
);