DROP TABLE "Jaegers";

CREATE TABLE "Jaegers" (
    ID	INT PRIMARY KEY NOT NULL,
    modelName varchar(80) NOT NULL,
    mark varchar(80),
    height INT,
    weight double precision,
    status varchar(80),
    origin varchar(80),
    launch DATE NOT NULL,
    kaijuKill INT
);