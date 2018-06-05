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

CREATE TABLE revinfo (
  rev integer not null auto_increment,
  revtstmp bigint,
  primary key (rev)
)
 engine=InnoDB;

alter table client_history add constraint FK_client_history_revinfo foreign key (audit_id) references revinfo (rev);
