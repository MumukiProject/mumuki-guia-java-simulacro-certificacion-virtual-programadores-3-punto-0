CREATE TABLE GestorDePaqueteDeProyectores (idGestorDePAquetes INTEGER PRIMARY KEY, nombreEmpresa TEXT);

CREATE TABLE PaqueteProyectores (codPaquete INTEGER PRIMARY KEY, 
  destino TEXT, 
  costo_envio FLOAT,
  destinatario TEXT,
  gestorDePaqueteDeProyectores_idGestorPaquetes INTEGER,
  FOREIGN KEY (gestorDePaqueteDeProyectores_idGestorPaquetes) REFERENCES GestorDePaqueteDeProyectores(idGestorDePaquetes));
  
