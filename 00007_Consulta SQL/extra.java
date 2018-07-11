CREATE TABLE biblioteca (id_biblioteca INTEGER PRIMARY KEY, localidad TEXT);

CREATE TABLE libro (id_libro INTEGER PRIMARY KEY, 
  titulo TEXT, 
  autor TEXT,
  cantidad_reservas INTEGER,
  id_biblioteca INTEGER,
  FOREIGN KEY (id_biblioteca) REFERENCES biblioteca(id_biblioteca));
  
