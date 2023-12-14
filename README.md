![Imagen]()


************************************
ACERCA DEL AUTOR
************************************

David M.

elarreglador@protonmail.cocm

https://github.com/elarreglador


************************************
ACERCA DE LA APLICACION
************************************
El cliente se conecta al servidor y le envia un mensaje, el servidor lo muestra por pantalla y se lo reenvia al cliente que tambien muestra el mensaje


![Imagen]()


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

El cliente debe recibir por parametro el mensaje (entrecomillado si son varias palabras), la IP de destino o localhost si el cliente esta en el mismo equipo y por ultimo el puerto en el que escucha el servidor.

<pre>
java Cliente "Este es el mensaje viajero" localhost 9696
</pre>

De este modo obtendremos algo similar a esto:

![Imagen]()



                                                                                            David M.
                                                                             11 de diciembre de 2023


