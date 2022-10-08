; Manoel Felipe de Almeida Bina

(comment 1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.)
(defn ultimo [lista] (reduce (fn [x y] y) lista))

(comment 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis paraesta mesma finalidade na linguagem Clojure.)
(defn penultimo [lista] (reduce (fn [x y] y) (pop lista)))

(comment 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o elemento que está na posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.)
(defn elementoN [lista n] (loop [counter n novaLista lista] (if (zero? counter) (first novaLista) (recur (dec counter) (rest novaLista)))))

(comment 4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista edevolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] edevolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.) 
(defn inverso [lista] (reduce conj '() lista))

(comment 5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.)
(defn mdc [x y] (if (zero? y) x (recur y (mod x y))))


(println "\u001B[32m" "Função 1;" "\u001B[31m" "entrada:" "[1 3 5 7 9 11 13];" "\u001B[34m" "resultado: " (ultimo [1 3 5 7 9 11 13]))
(println "\u001B[32m" "Função 2;" "\u001B[31m" "entrada:" "[1 3 5 7 9 11 13];" "\u001B[34m" "resultado: " (penultimo [1 3 5 7 9 11 13]))
(println "\u001B[32m" "Função 3;" "\u001B[31m" "entrada:" "[1 3 5 7 9 11 13];" "\u001B[34m" "resultado: " (elementoN [1 3 5 7 9 11 13] 2))
(println "\u001B[32m" "Função 4;" "\u001B[31m" "entrada:" "[1 3 5 7 9 11 13];" "\u001B[34m" "resultado: " (inverso [1 3 5 7 9 11 13]))
(println "\u001B[32m" "Função 5;" "\u001B[31m" "entrada:" "400 320;" "\u001B[34m" "resultado: " (mdc 400 320))
