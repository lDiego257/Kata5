# Kata5: 
Determinar si dos palabras son isomorficas

## Requerimientos:
Req1. El programa debe de estar escrito en Clojure. <- Producto
Req2. El programa tiene que ser desarrollado utilizando test driven development (TDD) <- Proceso
Req3. El programa debe determinar si dos cadenas de string son isomorficas entre ellas

## Criterios de aceptacion:
C3.1: Al recibir dos cadenas string de diferente tamaño se debe de devolver un false.
C3.2: Al recibir dos cadenas de string vacias se debe devolver un false.
C3.3: Si se determina que dos palabras son isomorficas se debe devolver un true, en el caso contrario un false.

## Escenarios de prueba: 
C3.1.1: "abcd" "ab" = false 
C3.2.1: "" "" = false
C3.3.1: "wxyz" "gato" = true
c3.3.2: "abcd" "abbb" = false
