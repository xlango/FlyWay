ALTER TABLE schema_version_test ENGINE=ndbcluster;

CREATE TABLE person (
    id INT,
    name VARCHAR(100)
);