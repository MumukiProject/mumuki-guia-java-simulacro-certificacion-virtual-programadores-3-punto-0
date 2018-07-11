type: query
expected: SELECT l.autor FROM libro l, biblioteca b WHERE l.id_biblioteca = b.id_biblioteca AND b.localidad = 'San Luis' AND l.cantidad_reservas > 100;