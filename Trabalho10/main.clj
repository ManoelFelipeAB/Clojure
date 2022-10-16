; Manoel Felipe de Almeida Bina

; 1. Na  aula  disponível  em:  https://replit.com/@frankalcantara/ClojureAula2?v=1  foram destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em Clojure.  Sua  primeira  tarefa  será  descrever  cada  uma  destas  funções  e  apresentar  dois exemplos  de  uso  de  cada  uma  delas.  Lembre-se  os  exemplos  precisam  ser  utilizados  de forma que o resutado da função possa ser visto no terminal.

; assoc - Atrelada a função de map, retorna um novo map que contem o mapeamento de chave e valor.
; dissoc - Atrelada a função map, retorna um novo map desasociando umas das chaves passadas como parametro
; range - Retorna uma sequencia no valor dado como parametro, sempre iniciando em 0. Caso passe 2 paremetros, o 1° é onde começa e o 2° onde termina.
; map - Retorna uma sequência que consiste no resultado da aplicação de f ao conjunto dos primeiros itens de cada col, seguido pela aplicação de f ao conjunto de segundos itens em cada coll.
; inc - Retorna um valor maior que o valor inserido
; filter - Retorna uma sequência dos itens no parametro para os quais passam por uma filtragem.
; odd - Retorna true se o valor for impar
; into - Retorna uma saida conjugada de uma coleção pra outra
; nth - Retorna o valor que corresponde ao indice fornecido como parametro
; conj - Adiciona o/os valores do parametro 2 no parametro 1
; sort - retorna uma saida ordenada dos itens ca coleção
; partition-by - Retorna uma sequência de partições
; empty - Retorna true se o conteudo da coleção é vazio, se não for retorna false
; count - Retorna o numero de itens da coleção
; char - Retorna o char equivalente ao numero dado

(println "\u001B[32m" "Função assoc;" "\u001B[31m" "entrada:" ":x 2;" "\u001B[34m" "resultado: " (assoc {:x 1 :y 2} :x 2))
(println "\u001B[32m" "Função assoc;" "\u001B[31m" "entrada:" ":z 3" "\u001B[34m" "resultado: " (assoc {:x 1 :y 2} :z 3))
(println "\u001B[32m" "Função dissoc;" "\u001B[31m" "entrada:" ":x 2" "\u001B[34m" "resultado: " (dissoc {:x 1 :y 2} :x 2))
(println "\u001B[32m" "Função dissoc;" "\u001B[31m" "entrada:" ":y 2" "\u001B[34m" "resultado: " (dissoc {:x 1 :y 2} :y 2))
(println "\u001B[32m" "Função range;" "\u001B[31m" "entrada:" "10" "\u001B[34m" "resultado: " (range 10))
(println "\u001B[32m" "Função range;" "\u001B[31m" "entrada:" "20 30" "\u001B[34m" "resultado: " (range 20 30))
(println "\u001B[32m" "Função map;" "\u001B[31m" "entrada:" "+ [1 2 3] [4 5 6]" "\u001B[34m" "resultado: " (map + [1 2 3] [4 5 6]))
(println "\u001B[32m" "Função map;" "\u001B[31m" "entrada:" "- [1 2 3] [4 5 6]" "\u001B[34m" "resultado: " (map - [1 2 3] [4 5 6]))
(println "\u001B[32m" "Função inc;" "\u001B[31m" "entrada:" "10.0" "\u001B[34m" "resultado: " (inc 10.0))
(println "\u001B[32m" "Função inc;" "\u001B[31m" "entrada:" "99" "\u001B[34m" "resultado: " (inc 99))
(println "\u001B[32m" "Função filter;" "\u001B[31m" "entrada:" "even? (range 10))" "\u001B[34m" "resultado: " (filter even? (range 10)))
(println "\u001B[32m" "Função filter;" "\u001B[31m" "entrada:" "odd? (range 10))" "\u001B[34m" "resultado: " (filter odd? (range 10)))
(println "\u001B[32m" "Função odd;" "\u001B[31m" "entrada:" "5" "\u001B[34m" "resultado: " (odd? 5))
(println "\u001B[32m" "Função odd;" "\u001B[31m" "entrada:" "50" "\u001B[34m" "resultado: " (odd? 50))
(println "\u001B[32m" "Função into;" "\u001B[31m" "entrada:" " () '(1 2 3)" "\u001B[34m" "resultado: " (into () '(1 2 3)))
(println "\u001B[32m" "Função into;" "\u001B[31m" "entrada:" "[1 3 5] '(7 9)" "\u001B[34m" "resultado: " (into [1 3 5] '(7 9)))
(println "\u001B[32m" "Função nth;" "\u001B[31m" "entrada:" "meunome 0" "\u001B[34m" "resultado: " (nth ["Manoel" "Felipe" "Almeida" "Bina"] 0))
(println "\u001B[32m" "Função nth;" "\u001B[31m" "entrada:" "meunome 3" "\u001B[34m" "resultado: " (nth ["Manoel" "Felipe" "Almeida" "Bina"] 3))
(println "\u001B[32m" "Função conj;" "\u001B[31m" "entrada:" "[1 2 3] 4 5))" "\u001B[34m" "resultado: " (conj [1 2 3] 4 5))
(println "\u001B[32m" "Função conj;" "\u001B[31m" "entrada:" "'(1 2 3) 4 5)" "\u001B[34m" "resultado: " (conj '(1 2 3) 4 5))
(println "\u001B[32m" "Função sort;" "\u001B[31m" "entrada:" "[10 1 3 5 1 3]" "\u001B[34m" "resultado: " (sort [10 1 3 5 1 3]))
(println "\u001B[32m" "Função sort;" "\u001B[31m" "entrada:" "[10 1 3 5 1 3]" "\u001B[34m" "resultado: " (sort > (vals {:x 50, :y 26, :z 650})))
(println "\u001B[32m" "Função partition-by;" "\u001B[31m" "entrada:" "odd? [1 1 1 2 2 2 2 3 3 3]" "\u001B[34m" "resultado: " (partition-by odd? [1 1 1 2 2 2 2 3 3 3]))
(println "\u001B[32m" "Função partition-by;" "\u001B[31m" "entrada:" "even? [1 1 1 2 2 2 2 3 3 3 4]" "\u001B[34m" "resultado: " (partition-by even? [1 1 1 2 2 2 2 3 3 3 4]))
(println "\u001B[32m" "Função empty;" "\u001B[31m" "entrada:" "()" "\u001B[34m" "resultado: " (empty? ()))
(println "\u001B[32m" "Função empty;" "\u001B[31m" "entrada:" "'(2)" "\u001B[34m" "resultado: " (empty? '(2)))
(println "\u001B[32m" "Função count;" "\u001B[31m" "entrada:" "[]" "\u001B[34m" "resultado: " (count []))
(println "\u001B[32m" "Função count;" "\u001B[31m" "entrada:" "[1 2 3 4 5]" "\u001B[34m" "resultado: " (count [1 2 3 4 5]))
(println "\u001B[32m" "Função char;" "\u001B[31m" "entrada:" "97" "\u001B[34m" "resultado: " (char 97))
(println "\u001B[32m" "Função char;" "\u001B[31m" "entrada:" "109" "\u001B[34m" "resultado: " (char 109))

; 2. Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e devolva True caso este inteiro seja verdadeiro e False caso contrário. 
(defn ehPrimo [n] (
              loop [counter 1 lista []]
                    (if (= counter (+ n 1)) (if (= (count lista) 2) true false)
                     (recur (inc counter) (if (zero? (mod n counter)) (conj lista counter) lista)))
                   
))
(println "\u001B[32m" "Função ehPrimo;" "\u001B[31m" "entrada:" "3" "\u001B[34m" "resultado: " (ehPrimo 3))
(println "\u001B[32m" "Função ehPrimo;" "\u001B[31m" "entrada:" "4" "\u001B[34m" "resultado: " (ehPrimo 34))

; 3. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  fatoresPrimos  que  receba  um inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma tarefa fundamental da aritmética.  
(defn fatoresPrimos [n] (
                         loop [counter 2 numero n lista []]
                         (if (= numero 1) lista 
                           (recur (if (and (ehPrimo counter) (zero? (mod numero counter))) 2 (inc counter)) (if (and (ehPrimo counter) (zero? (mod numero counter))) (/ numero counter) numero) (if (and (ehPrimo counter) (zero? (mod numero counter))) (conj lista counter) lista))
)))
(println "\u001B[32m" "Função fatoresPrimo;" "\u001B[31m" "entrada:" "520" "\u001B[34m" "resultado: " (fatoresPrimos 520))
(println "\u001B[32m" "Função fatoresPrimo;" "\u001B[31m" "entrada:" "280" "\u001B[34m" "resultado: " (fatoresPrimos 280))

; 4. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  todosPrimos  que  receba  dois valores inteiros e devolve todos os números primos que existam entre estes dois valores.

(defn todosPrimos [n1 n2] (
                           loop [lista (range n1 (+ n2 1)) lista2 []]
                           (if (empty? (rest lista)) lista2 (recur (rest lista) (if (ehPrimo (nth lista 0)) (conj lista2 (nth lista 0)) lista2)))
))

(println "\u001B[32m" "Função todosPrimos;" "\u001B[31m" "entrada:" "5 30" "\u001B[34m" "resultado: " (todosPrimos 5 30))
(println "\u001B[32m" "Função todosPrimos;" "\u001B[31m" "entrada:" "30 100" "\u001B[34m" "resultado: " (todosPrimos 30 100))
