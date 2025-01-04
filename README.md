# proyectos-varios
PARA INICIAR CONTENEDOR DE DESARROLLO VSCODE:
CTROL + SHIFF + P  -> Dev Containers: REOpen container

CREE ESTRUCTURA BASE CON:
mvn archetype:generate \
-DarchetypeGroupId=org.codehaus.mojo.archetypes \
-DarchetypeArtifactId=pom-root \
-DarchetypeVersion=RELEASE \
-DgroupId=com.proyectosdesarrollo \
-DartifactId=proyectosvarios \
-Dversion=1.0-SNAPSHOT \
-DinteractiveMode=false

CREAR UN MODULO:
1.-cd proyectosvarios
2.-
mvn archetype:generate \
-DarchetypeGroupId=de.rieckpil.archetypes \
-DarchetypeArtifactId=testing-toolkit \
-DarchetypeVersion=1.0.0 \
-DgroupId=com.proyectosdesarrollo \
-DartifactId=patronesdiseno \
-Dversion=1.0-SNAPSHOT \
-Dpackage=com.proyectosdesarrollo.patronesdiseno \
-DinteractiveMode=false

ELIMINAR TODO DESPUES DE PROPERTIES

>mvn test







CREAR PROYECTOS JAVA SIMPLE
mvn archetype:generate -DgroupId=com.proyectosdesarrollo -DartifactId=proyectosvarios -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

START LOS DEL LIBRO-----------------------------------------------------
mvn archetype:generate \
-DarchetypeGroupId=org.codehaus.mojo.archetypes \
-DarchetypeArtifactId=pom-root \
-DarchetypeVersion=RELEASE \
-DgroupId=mx.hexagonodev \
-DartifactId=proyectoprueba \
-Dversion=1.0-SNAPSHOT \
-DinteractiveMode=false

mvn archetype:generate \
-DarchetypeGroupId=de.rieckpil.archetypes \
-DarchetypeArtifactId=testing-toolkit \
-DarchetypeVersion=1.0.0 \
-DgroupId=mx.hexagonodev \
-DartifactId=domain \
-Dversion=1.0-SNAPSHOT \
-Dpackage=mx.hexagonodev.proyectoprueba.domain \
-DinteractiveMode=false

END LOS DEL LIBRO-----------------------------------------------------