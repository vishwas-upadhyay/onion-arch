CREATE SCHEMA db_onion_arch;

CREATE TABLE db_onion_arch.request_logger (
    reqid INT IDENTITY(1,1) PRIMARY KEY,
    req_time DATETIME NOT NULL DEFAULT GETDATE(),
    req_originator VARCHAR(100) NOT NULL
);