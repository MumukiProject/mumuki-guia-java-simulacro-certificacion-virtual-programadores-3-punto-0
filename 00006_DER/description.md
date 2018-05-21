A partir del siguiente DER

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


> Elija las opciones correctas