%diagnotico en base a los parametros de puncion
puntos(normal,568).
puntos(madurez,568).
puntos(paranoia,571).
puntos(incapacidad_de_vinculos,578).
puntos(inferioridad,577).
puntos(ansiedad,583).
puntos(esquizofrenia,582).
puntos(psicopatologia,584).
puntos(abuso_sexual,586).
puntos(sexulidad,581).
diagnostico(Puntos,Diagnostico):- puntos(Diagnostico,Puntos).
informacion(normal,"Puede soportar el estres asi como tambien ser resolutivo en casos de conflicto pero presenta problemas ya que  es muy minuciso como miticulos con su trabajo suele sentirse superior a los demas").
informacion(madurez,"Tiene la madure e inteligencia emocional de acuedo a su edad, capacidad para expresar emociones así como armoniza sus acciones atraves de procesos reflexivos").
informacion(paranoia,"Transtorno de la personalidad que afecta metalmente a la persona ya que tiene un patron de desconfianza y recelo hacia los demas individuos en forma prolongada, es comun que este transtorno se pase por los genes apesar de ser un transtocomo la ezquizofrenia no se cuenta aun como esta ya que es un nivelmas bajo").
informacion(incapacidad_de_vinculos,"Este transtorno es una manifestacion que suele ocurrir en infantes ya que se da hiperactividad e impulsividad cuando los infantes ropen lazos afectivos con su padres especialmente hablando de la madre, este transtorno es la causa muchas veces en adudultos como adolecentes cuando pasan por una experiencia traumatica").
informacion(inferioridad,"Complejo que causa en las personas rasgos caracteristicos que dicultan el completo desarrollo en surutina diaria usulamete tienen timidez excesiva, baja autestima o una necesidad de complacer siempre a los demas en cualquier ambito,este complejo se empieza a desarrollar desde un acontesimiento que marco a la indivuduo").
informacion(ansiedad,"El transtorno de ansiedad es una respuesta emocional caracterizada por una gran exitacion fisiologica que prepara al idividuo a luchar o huir usualmente todos los seres humanos tienen ese instintopero cuando este se presenta en situciones cotidianes o frecuentemente puede llegar a ser demaciado peligroso, de emergencia ser tratada esta persona").
informacion(esquizofrenia,"Transtorno mental grave por el cual las personas intepretan la relidad de manera anormal puede provocar una combinacion de alucinaciones delirios con trastornos mas graves ya que el comportamiento afecta al fucionamiento diario este transtorno se divide en varios niveles").
informacion(psicopatologia,"En este caso es posible que tenga algun transtorno mentan mas elevado pero tambien puede ser una persona que muestre filias como el fetichismo,voyerismo,frotteurismo,masoquismo,sadismo pero el mas comun en este caso en la pedofilia como gerontofialia asi como tambien otro tipo de filias").
informacion(abuso_sexual,"Traumatismo que piede provocar un alto porcentaje de desarrollar un transtoro psicologico, pues ela
la persona sufre un trasntorno de estres postraumatico el cual puede durar meses o años si no son atendidos a tiempo, apripidadmente como de manera profesional").
informacion(sexualidad,"Puede haber una necidad sexual en la paeja de forma amistosa o la relacion con uno mismo, el rompimiento de ideologias sexuales como mala informacion sobre la sexualidad puede causar falta de pertenencia sexual, ya que los decubrimientos sexuales sensoriales estan dormidos por lo que cuando hablamos ya a una determinada edad estos deberian ir estimulandose o estar trabajando de manera adecuada").
prueba(X,Y):-informacion(X,Y).

examenes(test,normal,"test de proyectivo,prueba de HTP, test de autoconcepto de Rosenberg, prueba de Eneagrama de la personalidad").
examenes(test,madurez,"test de autoestima, test de evaluacion de amistad, pruba de comunicacion,prueba de HTP, prueba de hemisferios diminante, test de madurez emocional").
examenes(test,paranoia,"test de desorden paranoico,prueba de perosnalidad de cinco factores,, prueba de los och colores de luscher, prueba de Arquetipos de Jung, test de sociabilidad, prueba Eneagrama de la personalidad, prueba de Eneagrama de personalidad reducido").
examenes(test,incapacidad_de_vinculos,"Prueba de HTP,test de introvertido o extrovertido,prueba de Eneagrama de la personalidad, pruebade Arqueotipos de Jung, prueba de asertividad de Rathus,test de autoestima infantil,test de hiperactividad, test de autoestima, prueba de sindrome de depresion").
examenes(test,inferioridad,"Prueba de HTP, test de autoestima, test de autoestima infantil, prueba de autoconcepto de Rosenberg, Prieba de Eneagrama de Personalidad,pruea de autoestima de Coopersmith para adultos, test de el subconciente,prueba emocional, prueba de autoconciencia, prueba de autoconocimiento,prueba los animales y escondite").
examenes(test,ansiedad,"test CECAD, test de CESQT evaluacion del sindorme de quemarse por el tranajo, prueba de HTP,test de impulsos, puebra de sindrome depresivo,prueba de autestima, test de ansiedad profesional, prueba de caracter ibsesivo-compulsivo").
examenes(test,ezquizofrenia,"Inventario Multifaisco de Personalidad de Minnemsota MMPI-2,prueba Robert Hare de psicopatia, prueba de personalidad de cinco factores, prueba de los ocho colores de lusher, prieba de autoconcepto de Rosenberg, prueba de Eneagrama de la personalidad,test de ansiedad, avaluacion de la persinalidad PAI").
examenes(test,psicopatologia,"Inventario de multifasico de personalidad de MINNESOTA-2,inventario clinico multiaxial de millon MCMI-III,evaluacion de la personalidad PAI,prueba de la personalidad neo revisado NEO PI-R,cuestieonario factorial de personalidad 16 PF-5,cuestionario de personalidad para adolecentes 16 PF-APO,sistema de evaluacion de conducta de niños y adolecentes BASC").
examenes(test,abuso_sexual,"prueba de HTP, prueba de Eneagrama de la Personalidad, Test de Arqueotipos de Jung, test de inteligencia emocional, test de ansiedad, inventario multifasico de personalidad de MINNESOTA-2").
examenes(test,sexualidad,"test de orientacion sexual, test de la escala de Kinsey, test de respuesta y orientacion erotica EROS").
prueba2(X,Y,Z):-examenes(X,Y,(Z)).

main(Puntos,Diagnostico,Y,Z,A):-diagnostico(Puntos,Diagnostico),prueba(Diagnostico,A),prueba2(Y,Diagnostico,Z).
