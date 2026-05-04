# 🧩 Copilotos de IA — Sistema de Modos de Desenvolvimento

Este projeto define um conjunto de **copilotos de IA baseados em prompts especializados**, criados para diferentes fases e necessidades do desenvolvimento de software.

A ideia é simples: em vez de uma IA genérica, você escolhe um **modo específico de atuação**, com comportamento, nível de autonomia e formato de resposta bem definidos.

---

## 🎯 Objetivo

Organizar a assistência de IA em **modos técnicos especializados**, permitindo:

* melhor controle do fluxo de desenvolvimento
* separação clara entre análise, planejamento e execução
* aprendizado mais estruturado
* maior previsibilidade nas respostas

---

## 🧠 Modos do Copiloto

--- 
### 🤖 Agent (Execução autônoma)

Modo focado em **implementação completa**.

Use quando quiser:

* construir features inteiras
* aplicar mudanças em múltiplos arquivos
* delegar tarefas complexas

📌 Características:

* gera código pronto para uso
* segue ciclo A/P/I/V/F
* assume decisões técnicas quando necessário

📄 `prompts/prompt-agent.md`


---

### ❓ Ask (Diagnóstico e explicação)

Modo focado em **entender, investigar e explicar**.

Use quando quiser:

* entender erros
* analisar código
* tirar dúvidas técnicas
* investigar comportamento inesperado

📌 Características:

* não altera código
* não executa mudanças
* foca em diagnóstico e clareza

📄 `prompts/prompt-ask.md`

---

### 🧭 Plan (Planejamento de solução)

Modo focado em **planejar antes de implementar**.

Use quando quiser:

* estruturar uma nova funcionalidade
* avaliar abordagens
* reduzir riscos antes de codar

📌 Características:

* define escopo e estratégia
* lista arquivos e impactos
* inclui riscos e testes
* não gera código completo

📄 `prompts/prompt-plan.md`

---

### 📚 Study (Aprendizado guiado)

Modo focado em **entendimento profundo e ensino técnico**.

Use quando quiser:

* aprender conceitos
* entender boas práticas
* estudar trade-offs e arquitetura

📌 Características:

* abordagem didática
* progressão conceitual
* exemplos explicativos
* foco em “por que” e não só “como”

📄 `prompts/prompt-study.md`

---

### 🔧 Refactor (Melhoria de código)

Modo focado em **refatoração e qualidade de código**.

Use quando quiser:

* melhorar legibilidade
* reduzir complexidade
* aplicar boas práticas
* reorganizar código existente

📌 Características:

* não muda comportamento funcional
* identifica code smells
* aplica melhorias estruturais
* foca em manutenção e clareza

📄 `prompts/prompt-refactor.md`

---

## 🧠 Visão geral dos modos

* **Ask** → entender e diagnosticar
* **Plan** → estruturar antes de construir
* **Agent** → executar e implementar
* **Study** → aprender e aprofundar
* **Refactor** → melhorar e limpar código existente

---

## 💡 Ideia central do projeto

Este sistema transforma a IA em um conjunto de **papéis especializados**, permitindo que o desenvolvedor escolha explicitamente:

> “O que eu quero que a IA seja agora?”

Em vez de uma resposta única, você tem um **fluxo técnico completo de desenvolvimento assistido**.
