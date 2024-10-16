Ingreso de datos al paciente
En el ejercicio anterior integramos una nueva vista que permite ingresar múltiples pacientes a la aplicación. Siempre que se ingresa uno de los pacientes se genera un botón de "Calcular IMC" que lleva a la calculadora que previamente habíamos creado, ahora es momento de ponerla a trabajar y tomar los resultados para llevarlos de vuelta a la vista principal en donde están todos los pacientes con sus datos.

Preocúpate que la navegación del botón esté funcionando correctamente.

Esta vez agregaras un par de cosas a la calculadora:

Bajo la vista del resultado debes integrar un espacio para mostrar el estado de salud del paciente (Bajo peso, Peso Normal, Sobrepeso, Obesidad I, II o III - Se adjuntará al final una imagen con la tabla de la OMS para poder realizar el cálculo).
Además de eso se debe generar un botón que nos permite guardar todos los datos para llevarlos de vuelta a la vista principal.
Ojo: El botón de guardar únicamente se debe visualizar cuando la calculadora fue usada, si se ingresa por primera vez solo se debe ver el botón de calcular.
Al momento de dar clic sobre el botón de "Guardar" es importante que la edad, el sexo, el resultado del IMC y el estado de salud, retornen a la vista principal.

En la vista principal la Card del cliente va a sufrir modificaciones:

Ya no debe mostrar el botón para "Calcular IMC".
Pero si debe mostrar todos los datos capturados desde la calculadora, es decir, debe aparecer en la Card el nombre, la edad, el sexo, el IMC y el estado de salud del paciente.
Importante: Las imágenes del final son solo una referencia en cuanto al diseño, lo primordial es que se visualicen correctamente los datos pedidos, luego la orientación dentro de la Card es a libre elección.

Una vez implementes el nuevo ejercicio, actualiza tu repositorio de GitHub y sube el enlace a la plataforma por medio de un archivo .txt