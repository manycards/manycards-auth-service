
CREATE TABLE refresh_tokens(
    id UUID PRIMARY KEY,
    user_id UUID REFERENCES users(id),
    token VARCHAR(255) UNIQUE NOT NULL,
    expires_at TIMESTAMP NOT NULL,
    device_info VARCHAR(255),
    created_at TIMESTAMP
);