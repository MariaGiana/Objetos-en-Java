# Objetos-en-Java
Este repositorio va a constar de ejercicios sobre objetos en java, desde trabajos con herencias, interfaces, busquedas, diseño composite, copia, etc 

## ENUNCIADO DE LOS EJERCICIOS  
  
** Composite.Correo:  
  
Una compañía de envíos posee distintos tipos de servicios de envíos, entre los mismos se encuentran:  
- Envío de paquetes y cartas, una carta/paquete posee un destinatario con su dirección, un remitente con su dirección, si la retiran en la sucursal de destino o la envían a domicilio, y su peso.
- Combo Postal, es una modalidad por la cual se agrupa un conjunto de envíos (cualquier tipo de envío). Todos los envíos incluidos en un combo postal deben tener la misma ciudad de destino.  
Todos los envíos poseen un único número de tracking que permite hacer su seguimiento. En los combos el tracking es el mismo para todos los elementos que contiene, y cuando un elemento se agrega a un combo se le cambia el tracking del elemento poniendo el del combo. Si el elemento agregado era un combo, este debe cambiar también el tracking de todos sus elementos para adecuarse al nuevo valor.  
El peso de los combos es la suma de todos los elementos que este contiene.  
