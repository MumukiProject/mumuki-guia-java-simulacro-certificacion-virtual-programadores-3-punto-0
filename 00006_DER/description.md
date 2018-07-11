A partir del siguiente DER

<div
  class='mu-erd'
  data-entities='{
    "libro": {
      "id_libro": {
        "type": "Integer",
        "pk": true
      },
      "titulo": {
        "type": "Text"
      },
      "autor": {
        "type": "Text"
      },
      "cantidad_reservas": {
        "type": "Integer"
      },
      "id_biblioteca": {
        "type": "Integer",
        "pk": false,
        "fk": {
          "to": { "entity": "biblioteca", "column": "id_biblioteca" },
          "type": "many_to_one"
        }
      }
    },
    "biblioteca": {
      "id_biblioteca": {
        "type": "Integer",
        "pk": true
      },
      "localidad": {
        "type": "Text"
      }
    }
  }'>
</div>