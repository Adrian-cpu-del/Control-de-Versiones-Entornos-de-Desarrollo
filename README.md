# Práctica 1 Calculadora
Para publicar en GitHub un proyecto creado localmente desde cero (sin partir de un repositorio clonado), seguimos estos pasos:
## Comandos ejecutados por orden cronológico:
1. `git init`
Inicializa un nuevo repositorio de Git en la carpeta actual.
2. `git remote add origin https://github.com/Adrian-cpu-del/Control-de-Versiones-Entornos-de-Desarrollo.git`
Vincula nuestro repositorio local con el creado previamente en GitHub.
3. `git checkout -b main`
Crea la rama principal llamada "main".
4. `echo "Práctica 1 Calculadora" > README.md`
Crea el archivo "README.md"
5. `git add README.md`
Añade el archivo al área de preparación para incluirlo en el siguiente commit.
6. `git commit -m "Commit inicial con README"`
Guarda los cambios preparados en el historial con un mensaje descriptivo.
7. `git push -u origin main`
Sube los commits locales de "main" a GitHub.
8. `git branch backend`
Crea la rama backend.
9. `git branch frontend`
Crea la rama frontend.
10. `git push -u origin backend`
Publica la rama "backend" en el repositorio remoto.
11. `git push -u origin frontend`
Publica la rama "frontend" en el repositorio remoto.
12. `git checkout backend`
Cambia el espacio de trabajo a la rama "backend"
13. `touch calculadora.java`
Crea el archivo "calculadora.java".
14. `git add calculadora.java`
Prepara el archivo para el commit.
15. `git commit -m "Se añade la parte java en el backend"`
Registra el archivo en el historial y añade una breve descripción.
16. `git push origin backend`
Sube los cambios de la rama "backend" a GitHub.
17. `git checkout frontend`
Cambia el espacio de trabajo a la rama frontend.
18. `touch index.html`
Crea el archivo "index.html"
19. `git add index.html`
Prepara el archivo para el commit.
20. `git commit -m "Añadimos la parte de frontend con el html"`
Registra el archivo en el historial y añade una pequeña descripción.
21. `git push origin frontend`
Sube los cambios de la rama "frontend" a GitHub.
22. `git checkout main`
Regresa a la rama principal.
23. `git merge backend`
Fusiona los commits y archivos de la rama "backend" en la rama "main".
24. `git merge frontend`
Fusiona los commits y archivos de la rama frontend en la rama "main".
### Estos últimos son para subir el README.md definitivo
25. `git add README.md`
Prepara la versión final de "README.md" con toda la documentación.
26. `git commit -m "Subimos definitivamente el README.md"`
Registra la documentación en el historial y añade un mensaje descriptivo.
27. `git push origin main`
Sube la versión final integrada del proyecto a la rama "main" de GitHub.