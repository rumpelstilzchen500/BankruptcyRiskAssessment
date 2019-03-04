insert into company (company_id, address, company_name, confirmation, edrpou, ipn, kind_of_company, phone, quad_description)
    values(1, 'cherkassy', 'BBB', true, 12312312, 12321313, 'economics', '+380932071888', 'economics');

insert into department (department_id, email, head, name, phone, company_id)
   values (1, null, 1, 'Finance', '+380932071888', 1);

insert into role(role_id, role_name)
   values (1, 'ADMIN');

insert into users (user_id, email, first_name, last_name, login, password, phone, department_id)
    values (1, 'support@gmail.com', 'admin', 'admin', 'admin', '1111', '+380932071888', 1);
-- insert into users(id, email, first_name, last_name, login, password, phone, department_id, role_id)
--     values (1, 'support@gmail.com', 'admin', 'admin', 'admin', '1111', '+380932071888', 1, 1);

insert into user_role (user_id, role_id)
  values (1, 1);

