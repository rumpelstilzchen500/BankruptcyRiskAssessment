insert into company (company_id, address, company_name, confirmation, edrpou, ipn, kind_of_company, phone, quad_description)
    values(1, 'cherkassy', 'BBB', true, 12312312, 12321313, 'economics', 932071888, 'economics');

insert into department (department_id, email, head, name, phone, company_id)
   values (1, null, 1, 'Finance', 932071888, 1);

insert into role(role_id, name)
   values (1, 'admin');

insert into users (id, email, first_name, last_name, phone, surname, department_id, role_id)
    values (1, 'support@gmail.com', 'artem', 'sinkovskiy', 932071888, null, 1, 1);



