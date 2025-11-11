<h1 align="center">
  Aplicações Java
</h1>

<div align="center">

![Maintenance](https://img.shields.io/maintenance/yes/2025?style=for-the-badge)
![License MIT](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/status-completed-brightgreen?style=for-the-badge)

</div>

## 🧭 Guia de Navegação (Índice)

- [Sobre o Projeto](#sobre-o-projeto)
- [Estrutura do Repositório](#estrutura-do-repositório)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Aplicações Incluídas](#aplicações-incluídas)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Docker](#docker)
- [Contribuição](#contribuição)
- [Licença](#licença)

## 📖 Descrição

Este repositório reúne uma coleção prática e progressiva de projetos Java — do primeiro "Hello World" até aplicações que usam frameworks modernos. O objetivo é ensinar por meio do código: cada exemplo foi pensado para ser executável, comentado e fácil de entender, funcionando como um catálogo de exercícios, padrões e técnicas que você pode estudar, adaptar e reutilizar.

## 🎯 Sobre o Projeto

Este repositório serve como um guia prático de aprendizado Java. Cada projeto demonstra conceitos específicos da linguagem Java, incluindo:

- Fundamentos da linguagem
- Programação orientada a objetos
- Estruturas de dados
- Concorrência e multithreading
- Frameworks como Spring Boot
- Boas práticas de desenvolvimento

## 📁 Estrutura do Repositório

```
java-applications/
├── LICENSE
├── README.md
├── configs/
│   ├── compose.yml
│   └── Dockerfile
├── implementations/
│   ├── cli/
│   │   └── src/
│   └── gui/
│       └── src/java-fx/
├── libs/
├── resources/
└── ...
```

## 🛠️ Pré-requisitos

- **Java 21** ou superior
- **Maven 3.x** (para projetos que utilizam Maven)
- **Docker** (opcional, para ambiente containerizado)
- **Git** para clonar o repositório

## 🚀 Como Executar

### Execução Local

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/0nF1REy/java-applications.git
   cd java-applications
   ```

2. **Compile e execute um projeto específico:**

   ```bash
   # Para projetos simples (sem Maven)
   cd implementations/cli/src/01_hello_world/
   javac HelloWorld.java
   java HelloWorld

   # Para projetos com Maven
   cd implementations/cli/src/05_com_maven/
   mvn compile exec:java

   # Para projetos Spring Boot
   cd implementations/cli/src/26_first_spring_app/
   mvn spring-boot:run
   ```

### Execução com Docker

1. **Execute o ambiente Docker:**

   ```bash
   docker-compose up -d
   ```

2. **Acesse o container:**

   ```bash
   docker exec -it java-applications bash
   ```

3. **Execute os projetos dentro do container:**
   ```bash
   cd implementations/cli/01_hello_world/
   javac HelloWorld.java
   java HelloWorld
   ```

## 📚 Aplicações Incluídas

### Fundamentos Básicos (01-15)

- **01_hello_world**: Primeiro programa Java com conceitos básicos
- **02_loop**: Estruturas de repetição (for, while)
- **03_condicional**: Estruturas condicionais (if, else, switch)
- **12_metodos**: Definição e uso de métodos
- **15_primitive_types**: Tipos primitivos em Java

### Orientação a Objetos (13-21)

- **13_gato**: Exemplo básico de classe e objetos
- **14_package**: Organização em pacotes
- **17_polymorphism_cafe**: Demonstração de polimorfismo
- **18_static_attribute_and_constant**: Atributos estáticos e constantes
- **21_static_heroes_class_object**: Classes e objetos estáticos

### Estruturas de Dados (20, 27, 41-43)

- **20_arrays_basics**: Fundamentos de arrays
- **27_fixed_capacity_array**: Arrays de capacidade fixa
- **41_arrays**: Manipulação avançada de arrays
- **42_matrizes**: Matrizes multidimensionais
- **43_for_each**: Loop for-each

### Programação Avançada (08-11)

- **08_array_list_stream**: ArrayList e Streams
- **09_concurrent_task_coordinator**: Coordenação de tarefas concorrentes
- **10_asynchronous_pokemon_ability_fetcher**: Programação assíncrona
- **11_multi_thread_musician_performance**: Multithreading

### Frameworks e Ferramentas

- **05_com_maven**: Projeto usando Maven
- **06_spring_maven_demo**: Demonstração Spring com Maven
- **26_first_spring_app**: Primeira aplicação Spring Boot

## 🔧 Tecnologias Utilizadas

- **Java 21**: Linguagem principal
- **Maven**: Gerenciamento de dependências e build
- **Spring Boot 3.4.4**: Framework para aplicações web
- **Docker**: Containerização do ambiente de desenvolvimento
- **Gson**: Biblioteca para manipulação JSON

## 🐳 Docker

O projeto inclui configuração Docker para facilitar o desenvolvimento:

- **Dockerfile**: Baseado no Eclipse Temurin 21 com Maven e Git
- **compose.yml**: Configuração Docker Compose para desenvolvimento
- Volumes mapeados para desenvolvimento em tempo real
- Configuração automática do Git dentro do container

### Variáveis de Ambiente Docker

Configure as seguintes variáveis de ambiente para o Docker:

```bash
export GIT_NAME="Seu Nome"
export GIT_EMAIL="seu.email@exemplo.com"
```

Cada projeto contém:

- Exemplos práticos
- Demonstração de conceitos específicos

## 👤 Sobre o Desenvolvedor

<div align="center">

<table>
  <tr>
    <td align="center">
        <br>
        <a href="https://github.com/0nF1REy" target="_blank">
          <img src="./resources/images/docs/alan-ryan.jpg" height="160" alt="Foto de Alan Ryan">
        </a>
        </p>
        <a href="https://github.com/0nF1REy" target="_blank">
          <strong>Alan Ryan</strong>
        </a>
        </p>
        ☕ Peopleware | Tech Enthusiast | Code Slinger ☕
        <br>
        Apaixonado por código limpo, arquitetura escalável e experiências digitais envolventes
        </p>
          Conecte-se comigo:
        </p>
        <a href="https://www.linkedin.com/in/alan-ryan-b115ba228" target="_blank">
          <img src="https://img.shields.io/badge/LinkedIn-Alan_Ryan-0077B5?style=flat&logo=linkedin" alt="LinkedIn">
        </a>
        <a href="https://gitlab.com/alanryan619" target="_blank">
          <img src="https://img.shields.io/badge/GitLab-@0nF1REy-FCA121?style=flat&logo=gitlab" alt="GitLab">
        </a>
        <a href="mailto:alanryan619@gmail.com" target="_blank">
          <img src="https://img.shields.io/badge/Email-alanryan619@gmail.com-D14836?style=flat&logo=gmail" alt="Email">
        </a>
        </p>
    </td>
  </tr>
</table>

</div>

---

## 📚 Recursos Adicionais

- [Documentação Oficial Java](https://docs.oracle.com/en/java/)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Docker Documentation](https://docs.docker.com/)

## 📜 Licença <a name="licenca"></a>

Este projeto está sob a **licença MIT**. Consulte o arquivo **[LICENSE](LICENSE)** para obter mais detalhes.

> ℹ️ **Aviso de Licença:** © 2025 Alan Ryan da Silva Domingues. Este projeto está licenciado sob os termos da licença MIT. Isso significa que você pode usá-lo, copiá-lo, modificá-lo e distribuí-lo com liberdade, desde que mantenha os avisos de copyright.

⭐ Se este repositório foi útil para você, considere dar uma estrela!
