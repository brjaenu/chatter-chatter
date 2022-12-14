INSERT INTO USER (id, username, firstname, lastname, email, last_login_date, join_date, password, is_locked, is_active, role) VALUES (1, 'admin', 'admin', '', 'admin@admin.ch', now(), now(), '$2a$10$2ot5pfa78uavr1v9ky9ciu6lQ5gF5QsjwYPaAyPQ.OcU4MohG.rYG', false, true, 1);
INSERT INTO USER (id, username, firstname, lastname, email, last_login_date, join_date, password, is_locked, is_active, role) VALUES (2, 'deleted', 'deleted', 'user', 'deleted@admin.ch', now(), now(), '', true, false, 0);
INSERT INTO USER (id, username, firstname, lastname, email, last_login_date, join_date, password, is_locked, is_active, role) VALUES (3, 'user', 'Default', 'User', 'user@user.ch', now(), now(), '$2a$10$JIjDBwglgAQuj23EKLWfT.Tx7FwdSCjh7OXKNxCkXsPUCE9K7j5ZS', false, true, 0);
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:read');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:create');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:update');
INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (1, 'user:delete');

INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (2, 'user:read');

INSERT INTO USER_AUTHORITIES (user_id, authorities) VALUES (3, 'user:read');
