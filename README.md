![Imagen](https://github.com/elarreglador/UDP-cliente-servidor/blob/main/SCREENSHOTS/Social%20preview.png)


************************************
ACERCA DEL AUTOR
************************************

David M.

elarreglador@protonmail.cocm

https://github.com/elarreglador


************************************
ACERCA DE LA APLICACION
************************************

Modificacion del programa [UDP cliente-servidor](https://github.com/elarreglador/UDP-cliente-servidor/tree/main) en la que el usuario introduce el mensaje por teclado dentro de la aplicacion cliente



************************************
LANZAR LA APP 
************************************

Esta aplicacion esta basada en dos aplicaciones diferenciadas de Java: ServidorUDP.java y ClienteUDP.java

Se requiere una compilacion de ambas aplicaciones:

<pre>
javac ServidorUDP.java
javac ClienteUDP.java
</pre>

Y despues por separado ejecutaremos en diferentes terminales el servidor y el cliente

El servidor debe recibir por parametro el numero de puerto en el que queda a la escucha

<pre>
java Servidor 9669
</pre>

El cliente debe recibir por parametro la IP de destino o localhost si el cliente esta en el mismo equipo y por ultimo el puerto en el que escucha el servidor.

Una vez lanzado el cliente el usuario escribira el mensaje que se enviara al servidor.
<pre>
java Cliente localhost 9669
</pre>

De este modo obtendremos algo similar a esto:

![Imagen]()



                                                                                            David M.
                                                                             11 de diciembre de 2023


