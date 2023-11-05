#      ---- Comando Git Basicos ----

## Repositorios Git

*git init = Apos criar seu diretorio local, use esse comando para possibilitar o versionamento no git
*git branch -M master = define a branch master


# Estados do Git

Untracked - Unmodified - Modified - Staged

^<==== Commited <=========^

\-------------------------------------------


*git add (nome do arquivo)  = para sair do Modified para ir para o Staged

*git commit -m "add new tittle" = salva o arquivo e com isso retornando para o estado de Unmodified

*git log = Retorna o Historico de todos os commits (letra 'q' para sair do git log)


# Uso do Comando Restore

*git restore (nome do arquivo) = Retorna arquivos modificados

*git restore --staged (nome do arquivo) = Depois de acionar o comando git add, para retornar para o


estado de modified usamos esse comando


# Repositorios Remotos

*git remote add origin "o link do repositorio criado no github" = define o local do remoto

*git push -u origin <nome da branch> = joga o commit para a branch no repositorio remoto.

*git pull origin master = puxa todas as configurações e modificações que estão na branch master do remoto (git hub)

*git branch <nome da branch> = criar uma nova branch







