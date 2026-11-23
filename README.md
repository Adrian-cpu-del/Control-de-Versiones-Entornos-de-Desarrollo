# Práctica 1 Calculadora

## Comandos ejecutados por orden cronológico:
1. `git init`
2. `git remote add origin https://github.com/Adrian-cpu-del/Control-de-Versiones-Entornos-de-Desarrollo.git`
3. `git checkout -b main`
4. `echo "Prática 1 Calculadora" > README.md`
5. `git add README.md`
6. `git commit -m "Commit inicial con README"`
7. `git push -u origin main`
8. `git branch backend`
9. `git branch frontend`
10. `git push -u origin backend`
11. `git push -u origin frontend`
12. `git checkout backend`
13. `touch calculadora.java`
14. `git add calculadora.java`
15. `git commit -m "Se añade la parte java en el backend"`
16. `git push origin backend`
17. `git checkout frontend`
18. `touch index.html`
19. `git add index.html`
20. `git commit -m "Añadimos la parte de frontend con el html"`
21. `git push origin frontend`
22. `git checkout main`
23. `git merge backend`
24. `git merge frontend`