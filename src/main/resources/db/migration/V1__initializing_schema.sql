CREATE TABLE "books"(
    "isbn" bigint NOT NULL,
    "title" varchar(200),
    constraint "books_pkey" PRIMARY KEY ("isbn")
);