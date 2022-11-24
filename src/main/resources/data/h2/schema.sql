DROP TABLE IF EXISTS PUBLIC.STARSHIP;
DROP SEQUENCE IF EXISTS PUBLIC.STARSHIP_SEQUENCE;
CREATE TABLE `STARSHIP` (
                            `ID` BIGINT NOT NULL,
                            `CREW` VARCHAR(50),
                            `MGLT` int DEFAULT NULL,
                            `MAX_ATMOSPHERING_SPEED` VARCHAR(50),
                            `LENGTH` VARCHAR(50),
                            `COST_IN_CREDITS` int DEFAULT NULL,
                            `MODEL` VARCHAR(50),
                            `ACL` VARCHAR(50),
                            `STARSHIP_CLASS` VARCHAR(50),
                            `NAME` VARCHAR(50),
                            `UPDATED_AT` DATETIME,
                            `FILMS` VARCHAR(50),
                            `CONSUMABLES` VARCHAR(50),
                            `MANUFACTURER` VARCHAR(100),
                            `CARGO_CAPACITY` int DEFAULT NULL,
                            `PASSENGERS` VARCHAR(50),
                            `PILOTS` VARCHAR(50),
                            `CREATED_AT` DATETIME,
                            `HYPER_DRIVE_RATING` int DEFAULT NULL
);
CREATE SEQUENCE STARSHIP_SEQUENCE START WITH 100;