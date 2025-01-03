# proyectos-varios
# PARA INICIAR CONTENEDOR DE DESARROLLO VSCODE:
# CTROL + SHIFF + P  -> Dev Containers: REOpen container

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




mvn archetype:generate -DgroupId=com.proyectosdesarrollo -DartifactId=proyectosvarios -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false