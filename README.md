## projetoIntegrador


# GRUPO 02



## INTEGRANTES

### Nome: Osmar Alves Cardoso Junior
### Nome: Filipe Buba N Hada
### Nome: Leonardo Paiva
### Nome: Tiago Cavalcante
### Nome: Deivison Rocha 
### Nome: Jonas Pontes Queiroz



## [PROJETO JAVA ESCOPO DO PROJETO](https://docs.google.com/document/d/14dBIbkO7Kmin7Pm7-EBlOEL9iIQ4szlY/edit)


# Tema: E-Commerce

## [Fluxograma e Diagrama de classe](https://docs.github.com/pt/get-started/using-git/pushing-commits-to-a-remote-repository)


## [Lidar com erros "non-fast-forward"]([https://docs.github.com/pt/get-started/using-git/dealing-with-non-fast-forward-errors](https://docs.github.com/pt/get-started/using-git/pushing-commits-to-a-remote-repository)

Se outra pessoa tiver feito push no mesmo branch que você, o Git não poderá fazer push das alterações

    git push origin main
   
 Isso pode ser corrigido buscando e mesclando as alterações feitas na ramificação remota com as alterações feitas localmente:
 
    git fetch origin
    
    
    git merge origin NOME_DO_SEU_BRANCH
    
    
 Ou você pode usar ```git pull``` para executar ambos os comandos ao mesmo tempo:
 
    git pull origin YOUR_BRANCH_NAME

