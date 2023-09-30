CREATE TABLE respuestas (
	    id bigint not null auto_increment,
	    mensaje varchar(255) not null,
	    topico_id bigint not null,
	    fecha_creacion datetime not null,
	    autor_id bigint not null,
	    solucion tinyint default 0,

	    primary key(id),

	    constraint fk_respuestas_autor_id foreign key(autor_id) references usuarios(id),
        constraint fk_respuestas_topico_id foreign key(topico_id) references topicos(id)
	 );