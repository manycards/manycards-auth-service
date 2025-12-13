CREATE TABLE users (
    id UUID PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    email_verified BOOLEAN DEFAULT FALSE,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    other_name VARCHAR(100),
    password_hash VARCHAR(255) NOT NULL, -- Stores BCrypt hash
    gender VARCHAR(10),               -- ENUM: MALE, FEMALE
    account_number VARCHAR(20) UNIQUE,
    date_of_birth DATE,
    account_balance DECIMAL(19,4) DEFAULT 0.00,
    phone_number VARCHAR(20),
    two_factor_enabled BOOLEAN DEFAULT FALSE,
    two_factor_secret VARCHAR(255),      -- TOTP secret
    status VARCHAR(20) DEFAULT 'ACTIVE', -- ENUM: ACTIVE, BANNED, FROZEN
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);