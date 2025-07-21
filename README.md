
# 🗓️ Sistema de Agendamento com Chat (Java)

Este é um sistema simples de agendamentos com funcionalidade de chat, desenvolvido em Java.  
Ideal para comércios que precisam marcar horários com clientes e manter um histórico de conversas.

---

## 🔧 Tecnologias utilizadas

- **Java** (JDK 24)
- **Arquivos CSV** como banco de dados local
- **Console (CLI)** para interação do usuário

---

## 🎯 Funcionalidades

✅ Marcar agendamentos com nome, data e hora  
✅ Visualizar todos os agendamentos registrados  
✅ Enviar mensagens entre cliente e vendedor  
✅ Ver histórico de mensagens (chat)  
✅ Armazenamento local em arquivos `.csv`

---

## 📁 Estrutura do Projeto

```
📂 Projeto
├── Main.java              # Classe principal
├── Agendamento.java       # Classe de modelo de agendamento
├── Mensagem.java          # Classe de modelo de mensagem
├── agendamentos.csv       # Armazena todos os agendamentos
├── mensagens.csv          # Armazena as mensagens do chat
├── .gitignore             # Ignora arquivos desnecessários
├── misc.xml / modules.xml # Configurações do IntelliJ
```

---

## ▶️ Como executar o projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

2. **Compile os arquivos Java:**
```bash
javac Main.java
```

3. **Execute a aplicação:**
```bash
java Main
```

---

## 💡 Exemplo de uso

Ao executar, o sistema mostra um menu para:

- Marcar um horário para atendimento
- Ver os agendamentos feitos
- Enviar uma nova mensagem
- Ver todas as mensagens

---

## 💾 Requisitos

- Java JDK 21 ou superior (recomendado JDK 24)
- Editor de código ou IDE (como IntelliJ IDEA, Eclipse, VS Code com Java)

---

## 📌 Observações

- Os dados não são persistidos em banco de dados real, apenas em `.csv`
- O projeto pode ser facilmente migrado para uma aplicação com interface gráfica (JavaFX, Swing) ou web (Spring, JSP)
- Ideal para aprendizado de manipulação de arquivos e lógica básica em Java

---

## 📃 Licença

Este projeto está licenciado sob a **MIT License**.  
Você pode usá-lo, modificar e distribuir livremente.

---

## 👨‍💻 Autor

**Lucas (LK)**  
Desenvolvedor Java e entusiasta de soluções simples e funcionais.

---
