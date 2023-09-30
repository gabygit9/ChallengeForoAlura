ALTER TABLE topicos add activo tinyint;
UPDATE topicos SET activo=1;
ALTER TABLE usuarios add activo tinyint;
UPDATE usuarios SET activo=1;