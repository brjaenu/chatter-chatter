INSERT INTO USER (id, username, firstname, lastname, email, last_login_date, join_date, password, is_locked, is_active, role) VALUES (1, 'admin', 'admin', '', 'admin@admin.ch', now(), now(), '$2a$10$2ot5pfa78uavr1v9ky9ciu6lQ5gF5QsjwYPaAyPQ.OcU4MohG.rYG', false, true, 0);
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:read');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:create');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:update');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:delete');
