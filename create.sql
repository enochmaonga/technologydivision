CREATE DATABASE Technologydivision;

                                    \c Technologydivision;
                                    CREATE TABLE IF NOT EXISTS Staff (id SERIAL PRIMARY KEY,name,
                                    VARCHAR, role VARCHAR, responsibility, VARCHAR, department int);
                                    CREATE TABLE IF NOT EXISTS departments (id SERIAL PRIMARY KEY, name VARCHAR
                                    );

