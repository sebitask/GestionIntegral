# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table alumno (
  id                        bigint not null,
  nombre                    varchar(255),
  apellido                  varchar(255),
  constraint pk_alumno primary key (id))
;

create sequence alumno_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists alumno;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists alumno_seq;

