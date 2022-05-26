# Desafio técnico do bootcamp GFT Start 5
---
### "Devido ao aumento de seres com habilidades sobrehumanas, se fez necessária uma base de dados para que o governo possa garantir a segurança da população..."
---

Projeto construído reproduzindo e adaptando o passo a passo dos vídeos "Explorando Padrões de Projetos na Prática com Java" da plataforma [Digital Innovation One](https://www.dio.me).

Das diferenças técnicas principais, destaco:
* Não foi usado o módulo OpenFeign, pois não havia necessidade de consumir uma API externa;
* Apenas uma classe foi usada para cadastro, sendo assim, não houve relação entre classes (como no exemplo "Cliente -> @ManyToOne -> Endereço");
* Atributo id é um Integer ao invés de Long;
* Dois métodos adicionados ao serviço: buscar apenas os criminosos e apenas os que tem a identidade secreta desconhecida, ambos a serem implantados com o auxílio de Iterator[^1][^2].

[^1]: Em 25/05/2022-> Os métodos ainda não funcionam no momento
[^2]: Em 26/05/2022-> os métodos agora foram implantados com sucesso, com auxílio de Lists, e não Iterators