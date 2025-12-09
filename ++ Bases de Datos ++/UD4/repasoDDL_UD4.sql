
----- 1
drop table clasificacionesEtapas;
drop table etapas;
drop table ciclistas;
drop table equipos;


create table Equipos(
codEquipo varchar2(4) constraint equi_codEquipo_pk primary key,
nombre varchar2(30) not null,
nacionalidad varchar2(20),
nombreDirector varchar2(20) constraint equi_nombreDirector_ck 
                            check(upper(nombreDirector) = nombreDirector)
);


create table ciclistas (
dorsal number(3) constraint cicl_dorsal_pk primary key,
nombre varchar2(30) not null,
nacionalidad varchar2(20),
codEquipo varchar2(4) constraint cicl_codEquipo_fk references equipos(codEquipo),
fechaNacimiento date,
constraint cicl_dorsal_ck check(dorsal between 1 and 99)
);

create table etapas(
numEtapas number(2) constraint etap_numEtapas_pk primary key,
numKms number(3),
tipo varchar(30),
fecha date,
constraint etap_facha_ck check( fecha between to_date('19/07/2021','DD/MM/YYYY') 
and to_date('20/08/2021','DD/MM/YYYY'))
);

create table clasificacionesEtapas (
numEtapa number(2) constraint clasEtap_numEtapa_fk references etapas(numEtapas),
dorsal number(3) constraint clasEtap_dorsal_fk references etapas(numEtapas),
posicion varchar2(8) null constraint clasEtap_posicion_ck 
                          check(posicion between '1' and '99'),
distanciasAlGanador number,
constraint clasEtap_numEtapa_dorsal_pk primary key (numEtapa,dorsal)
);

----- 2

-- A
alter table etapas
add constraint etap_tipo_ck 
check(lower(tipo) in ('llana','media montaña','alta montaña','contrarreloj'));

select *
from user_cons_columns
where lower(table_name) = 'etapas'
;

select table_name, constraint_name, constraint_type, search_condition
from user_constraints
where lower(table_name) = 'etapas'
;

-- B

alter table etapas
add premio number(5)
;

desc etapas;

-- C

alter table clasificacionesEtapas
drop constraint clasEtap_posicion_ck;

select table_name, constraint_name, constraint_type, 
        search_condition as "Condiciones de Check"
from user_constraints
where lower(constraint_name) = 'clasetap_posicion_ck'
;


alter table clasificacionesEtapas
add constraint clasEtap_posicion_ck check(posicion = 'Abandono' 
                                            or posicion between '1' and '99');

-- 3


SELECT CONSTRAINT_NAME as "Nombre Restriccion", 
                TABLE_NAME as "Nombre de la table", CONSTRAINT_TYPE 
FROM USER_CONSTRAINTS
WHERE TABLE_NAME IN ('EQUIPOS', 'CICLISTAS', 'ETAPAS', 'CLASIFICACIONESETAPAS')
ORDER BY TABLA_NAME;

















