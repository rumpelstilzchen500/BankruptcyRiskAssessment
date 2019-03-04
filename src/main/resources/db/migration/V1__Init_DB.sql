create sequence hibernate_sequence start 1 increment 1;

create table company
(
  company_id       int8         not null,
  address          varchar(255),
  company_name     varchar(255) not null,
  confirmation     boolean,
  edrpou           int4         not null,
  ipn              int4,
  kind_of_company  varchar(255) not null,
  phone            int4,
  quad_description varchar(255) not null,
  primary key (company_id)
);

create table company_efficiency_factor
(
  id                int8 not null,
  date              date not null,
  efficiency_factor int4 not null,
  primary key (id)
);

create table department
(
  department_id int8         not null,
  email         varchar(255),
  head          int4         not null,
  name          varchar(255) not null,
  phone         int4,
  company_id    int8         not null,
  primary key (department_id)
);

create table department_efficiency_factor
(
  id                int8 not null,
  company           int4 not null,
  date              date not null,
  efficiency_factor int4 not null,
  primary key (id)
);

create table question
(
  question_id int8         not null,
  description varchar(255) not null,
  points      int4         not null,
  test_id     int8         not null,
  primary key (question_id)
);

create table role
(
  role_id int8         not null,
  name    varchar(255) not null,
  primary key (role_id)
);

create table test
(
  test_id          int8         not null,
  name             varchar(255) not null,
  test_category_id int8         not null,
  primary key (test_id)
);

create table test_category
(
  test_category_id int8         not null,
  name             varchar(255) not null,
  primary key (test_category_id)
);

create table user_efficiency_factor
(
  id                int8 not null,
  date              date not null,
  department        int8 not null,
  efficiency_factor int4 not null,
  test_category     int8 not null,
  primary key (id)
);

create table users
(
  id            int8        not null,
  email         varchar(255),
  first_name    varchar(20) not null,
  last_name     varchar(20) not null,
  phone         int8,
  surname       varchar(20),
  department_id int8        not null,
  role_id       int8        not null,
  primary key (id)
);

alter table if exists company
  add constraint UK_ffbbveb4nelo8vtef4ffs857g unique (edrpou);

alter table if exists company
  add constraint UK_olvtdd0wxr1ofssh3030ahwff unique (ipn);

alter table if exists department
  add constraint FKh1m88q0f7sc0mk76kju4kcn6f foreign key (company_id) references company;

alter table if exists question
  add constraint FK8hejcpbbiq1qje11346akp3uj foreign key (test_id) references test;

alter table if exists test
  add constraint FKlxkmp6ha6dq7k1g62hs9ssjl7 foreign key (test_category_id) references test_category;

alter table if exists users
  add constraint FKfi832e3qv89fq376fuh8920y4 foreign key (department_id) references department;

alter table if exists users
  add constraint FK4qu1gr772nnf6ve5af002rwya foreign key (role_id) references role;
