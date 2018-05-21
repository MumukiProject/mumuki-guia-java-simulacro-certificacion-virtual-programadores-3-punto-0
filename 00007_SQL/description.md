Dado el DER presentado

<div
  class='mu-erd'
  data-entities='{
    "paqueteProyectores": {
      "codPaquete": {
        "type": "Int",
        "pk": true
      },
      "destino": {
        "type": "VARCHAR(45)"
      },
      "costoEnvio": {
        "type": "FLOAT"
      },
      "destinatario": {
        "type": "VARCHAR(45)"
      },
      "gestorDePaqueteDeProyectores_idGestorPaquetes": {
        "type": "Int",
        "pk": false,
        "fk": {
          "to": { "entity": "GestorDePaquetesDeProyectores", "column": "idGestorDePaquetes" },
          "type": "many_to_one"
        }
    },
    "gestorDePaqueteDeProyectores": {
      "idGestorDePaquetes": {
        "type": "Int",
        "pk": true
      },
      "nombreEmpresa": {
        "type": "VARCHAR(45)"
      }
    }
  }'>
</div>

> Escriba una consulta SQL que liste todos los paquetes de proyectores cuya ciudad destinataria sea “Tucumán” y tenga un costo de envío mayor a 300$ y el nombre de la empresa correspondiente