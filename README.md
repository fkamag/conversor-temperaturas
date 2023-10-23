# Conversor de Temperaturas

Criar um programa para fazer conversões de temperaturas, o programa deve:

- pedir que o usuário digite uma temperatura para ser transformada.

 - pedir que o usuário informe a unidade de origem da temperatura,
podendo ser C para grau Celsius, K para Kelvin ou F para grau Fahrenheit.
Caso a entrada não for uma das especificadas imprimir uma resposta para o usuário
informando que a entrada especificada não é válida.

- pedir que o usuário informe a unidade de destino das temperaturas,
podendo ser C para grau Celsius, K para Kelvin ou F para grau Fahrenheit.
Caso a entrada não for uma das especificadas imprimir uma resposta para o usuário
informando que a entrada especificada não é válida.


- Calcule Utilizando as fórmulas de transformações:

C = (F - 32) * 5 / 9

F = (C * 9 / 5) + 32

K = 273.15 + C

C = K - 273.15

Onde C é a temperatura em grau Celsius, K a temperatura em Kelvin e
F a temperatura em grau Fahrenheit.


- imprimir cada temperatura passada, e a unidade escolhida,
e também a temperatura resultante, transformada, com sua respectiva unidade.

Exemplo 1:

Informe a temperatura:
28

Qual a unidade de origem dessa temperatura? [C, K, F]
C

Qual a unidade de destino dessa temperatura? [C, K, F]
K

28.00 C = 301.15 K

Exemplo 2:
Informe a temperatura:
28
Qual a unidade de origem dessa temperatura? [C, K, F]
C
Qual a unidade de destino dessa temperatura? [C, K, F]
F
28.00 C = 82.40 F

Exemplo 3:
Informe a temperatura:
301.15
Qual a unidade de origem dessa temperatura? [C, K, F]
K
Qual a unidade de destino dessa temperatura? [C, K, F]
C
301.15 K = 28.00 C

Exemplo 4:
Informe a temperatura:
301.15
Qual a unidade de origem dessa temperatura? [C, K, F]
K
Qual a unidade de destino dessa temperatura? [C, K, F]
F
301.15 K = 82.40 F

Exemplo 5:
Informe a temperatura:
82.4
Qual a unidade de origem dessa temperatura? [C, K, F]
F
Qual a unidade de destino dessa temperatura? [C, K, F]
C
82.40 F = 28.00 C

Exemplo 6:
Informe a temperatura:
82.4
Qual a unidade de origem dessa temperatura? [C, K, F]
F
Qual a unidade de destino dessa temperatura? [C, K, F]
K
82.40 F = 301.15 K
