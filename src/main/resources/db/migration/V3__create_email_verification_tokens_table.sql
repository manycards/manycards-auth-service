    CREATE TABLE email_verification_tokens(
        id UUID PRIMARY KEY,
        user_id UUID REFERENCES users(id),
        token VARCHAR(255) UNIQUE NOT NULL,
        expires_at TIMESTAMP NOT NULL,
        used BOOLEAN DEFAULT FALSE
    );