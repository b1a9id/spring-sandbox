create table client (
  id integer not null auto_increment,
  name varchar(255),
  postal_code integer not null,
  address1 varchar(255),
  address2 varchar(255),
  primary key (id)
)
  engine=InnoDB;

create table client_history (
  id integer not null,
  name varchar(255),
  postal_code integer,
  address1 varchar(255),
  address2 varchar(255),
  audit_id integer not null,
  audit_type tinyint,
  primary key (id, audit_id)
) engine=InnoDB;

create table user (
  id integer not null auto_increment,
  client_id integer not null,
  name varchar(255),
  gender varchar(255),
  primary key (id)
)
  engine=InnoDB;

create table user_history (
  id integer not null auto_increment,
  client_id integer not null,
  name varchar(255),
  gender varchar(255),
  audit_id integer not null,
  audit_type tinyint,
  primary key (id, audit_id)
)
  engine=InnoDB;

CREATE TABLE revinfo (
  rev integer not null auto_increment,
  revtstmp bigint,
  primary key (rev)
)
 engine=InnoDB;

alter table user add constraint FK_user_client foreign key (client_id) references client (id);
alter table client_history add constraint FK_client_history_revinfo foreign key (audit_id) references revinfo (rev);
alter table user_history add constraint FK_user_history_revinfo foreign key (audit_id) references revinfo (rev);
