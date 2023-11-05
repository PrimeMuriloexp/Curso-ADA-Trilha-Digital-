#      ---- Comando Git Basicos ----

## Repositorios Git

* ```git init``` = Apos criar seu diretorio local, use esse comando para possibilitar o versionamento no git
* ```git branch``` -M master = define a branch master


## Estados do Git

Untracked - Unmodified - Modified - Staged

^<==== Commited <=========^

\-------------------------------------------

## Gravando Mudancas no Repositorio

* ``` git add ``` (nome do arquivo)  = para sair do Modified para ir para o Staged

* ``` git commit -m ``` "add new tittle" = salva o arquivo e com isso retornando para o estado de Unmodified

* ```git log``` = Retorna o Historico de todos os commits (letra 'q' para sair do git log)

* ```git diff``` = visualizar as mudanças não confirmadas em um arquivo em relação ao commit mais recente (pressione 'q' para sair do diff)

* ```git diff commit1..commit2``` =  visualizar as mudanças entre dois commits específicos




## Uso do Comando Restore

* ```git restore``` (nome do arquivo) = Retorna arquivos modificados

* ```git restore --staged``` (nome do arquivo) = Depois de acionar o comando git add, para retornar para o


estado de modified usamos esse comando


## Repositorios Remotos

* ```git remote``` add origin "o link do repositorio criado no github" = define o local do remoto

* ```git push -u origin``` <nome da branch> = joga o commit para a branch no repositorio remoto.

* ```git pull origin master``` = puxa todas as configurações e modificações que estão na branch master do remoto (git hub)

* ```git branch``` <nome da branch> = criar uma nova branch

* ```git fetch``` <repositório-remoto> = atualiza o repositório local com as mudanças do repositório remoto, sem mesclar automaticamente com a ramificação(branches) atual

* ```git diff origin/master``` =  visualizar as mudanças antes de incorporá-las ao seu trabalho local

## Git Branch

---
---
*  ```git log --oneline --decorate``` 
  
  ```git log``` : Este é o comando básico para exibir o histórico de commits. 


  . ***<span style="font-weight: bold; font-style: italic;">oneline</span>*** : Essa opção formata a saída para que cada commit seja exibido em uma única linha, com uma mensagem de commit resumida. 

  . ***<span style="font-weight: bold; font-style: italic;">decorate</span>*** : Essa opção mostra informações adicionais sobre os ramos em que os commits estão localizados. Por exemplo, você verá os rótulos (tags) e nomes das ramificações que apontam para cada commit. 

---
---

* ```git checkout -b (nome da Branch)```

```checkout``` : O comando "checkout" no Git é usado para alternar entre diferentes branches (ramos) ou até mesmo para criar novas branches.


-***<span style="font-weight: bold; font-style: italic;">b</span>*** : Esta é uma opção do comando "checkout" que indica que você deseja criar uma nova branch (ramo). Em outras palavras, você está dizendo ao Git que deseja criar uma nova branch.

---
---







