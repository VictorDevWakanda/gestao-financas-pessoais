# Gestor de Finanças Pessoais

Sua inteligência financeira em um aplicativo desktop moderno, robusto e automatizado.

---

## ✨ Visão Geral

O **Gestor de Finanças Pessoais** nasceu da necessidade de tornar o controle financeiro acessível, seguro e inteligente. Inspirado na experiência de Wakanderes, que precisava monitorar e aprimorar seus hábitos financeiros, o aplicativo oferece uma solução prática para registrar, analisar e automatizar a gestão das suas finanças pessoais.

---

## 🏗️ Arquitetura da Solução

- **Interface Gráfica (JavaFX):** Experiência desktop intuitiva e fluida.
- **Banco de Dados Local (SQLite):** Segurança e privacidade dos dados, armazenados diretamente na máquina do usuário.
- **Middleware (Spring Boot):** Serviço intermediário para comunicação entre a interface desktop e APIs externas (ex: WhatsApp).
- **Integração com WhatsApp & E-mail:** Utilização da API WhatsApp Business Platform para envio automático de notificações e relatórios.
- **Autenticação Local:** Sistema de login baseado em SQLite, dispensando servidores externos.

---

## ⚙️ Funcionalidades

- ✅ **Registro de Transações:** Adicione e categorize receitas e despesas facilmente.
- ✅ **Gráficos de Análise Financeira:** Visualize seus hábitos de consumo com gráficos interativos.
- ✅ **Sugestões Inteligentes:** O sistema analisa seus padrões de gastos e sugere práticas para economizar.
- ✅ **Exportação de Relatórios:** Exporte dados em PDF ou Excel.
- ✅ **Notificações Automáticas:** Receba alertas sobre gastos e investimentos via WhatsApp ou e-mail.

---

## Funcionalidades Avançadas e Diferenciais

- 🚀 **Integração com Bancos e Cartões**  
  Importe transações automaticamente usando integração bancária (open finance), facilitando o acompanhamento em tempo real.

- 🎯 **Controle de Metas Financeiras**  
  Defina objetivos financeiros (ex: economizar para uma viagem) e acompanhe o progresso de cada meta.

- 💸 **Planejamento de Orçamento Mensal**  
  Planeje orçamentos por categoria e receba alertas ao se aproximar dos limites definidos.

- 🔁 **Gestão de Assinaturas e Despesas Recorrentes**  
  Identifique, controle e receba avisos sobre assinaturas e despesas periódicas.

- 📷 **Reconhecimento Inteligente de Notas Fiscais**  
  Registre gastos automaticamente ao fotografar notas fiscais/recibos (OCR).

- 📊 **Dashboards Personalizáveis**  
  Monte seu painel de indicadores e gráficos conforme suas preferências.

- 📈 **Módulo de Investimentos**  
  Acompanhe investimentos em ações, fundos, criptomoedas, e receba sugestões baseadas no seu perfil.

- 🎓 **Educação Financeira Integrada**  
  Tenha acesso a dicas, artigos, vídeos e quizzes de educação financeira na plataforma.

- 👨‍👩‍👧‍👦 **Compartilhamento de Contas**  
  Permita que famílias, casais ou grupos gerenciem finanças juntos, com diferentes permissões de acesso.

- 🎨 **Modo Escuro/Claro e Personalização Visual**  
  Escolha entre temas e personalize o visual da aplicação.

- ☁️ **Backup Automático e Sincronização Multi-dispositivo**  
  Sincronize e faça backup dos dados na nuvem, acessando de qualquer dispositivo.

- 🤖 **Assistente Financeiro com IA**  
  Tire dúvidas, receba sugestões e interaja com um assistente virtual inteligente (texto ou voz).

---

## 📦 Empacotamento e Distribuição

Para garantir uma experiência profissional e prática desde a instalação até a atualização, seguimos os seguintes passos:

1. **Criação do Executável (.exe):** Utilizamos ferramentas como [Launch4j](http://launch4j.sourceforge.net/) e `jpackage` para transformar o `.jar` em `.exe`.
2. **Instalador Profissional:** Empacotamento do aplicativo com instaladores criados via [Inno Setup](https://jrsoftware.org/isinfo.php) ou [NSIS](https://nsis.sourceforge.io/).
3. **Pipeline CI/CD (Jenkins):** Automação completa do processo de build, teste, empacotamento e publicação de novas versões.
4. **Atualizações Automáticas:** O aplicativo verifica periodicamente por novas versões e facilita o download e instalação.

---

## 🚀 CI/CD para Aplicação Desktop

Implementamos um pipeline automatizado com Jenkins, que contempla:

- Integração Contínua: Build e testes automáticos a cada alteração no repositório.
- Entrega Contínua: Geração do executável e do instalador a cada release.
- Publicação Automática: Disponibilização dos instaladores via servidor interno ou GitHub Releases.

### Exemplo de Pipeline (Jenkinsfile)

```groovy
pipeline {
    agent any
    stages {
        stage('Clonar repositório') {
            steps {
                git url: 'https://github.com/VictorDevWakanda/gestao-financas-pessoais.git', branch: 'main'
            }
        }
        stage('Compilar') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Testar') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Gerar Executável') {
            steps {
                sh 'javac -d bin src/*.java'
                sh 'jar cvf GestorFinancas.jar -C bin .'
            }
        }
        stage('Criar Instalador') {
            steps {
                sh 'makensis installer.nsi'
            }
        }
        stage('Publicar') {
            steps {
                archiveArtifacts artifacts: 'GestorFinancas.jar, GestorFinancasSetup.exe', fingerprint: true
            }
        }
    }
}
```

---

## 💡 História do Usuário

Em um mundo onde cada centavo conta, o Gestor de Finanças Pessoais foi criado para ajudar pessoas como João a monitorar gastos, eliminar desperdícios e tomar decisões financeiras mais conscientes. A integração com WhatsApp e relatórios inteligentes garantem que o usuário permaneça informado e no controle de suas finanças — de forma simples, automatizada e eficiente.

---

## 📚 Recursos úteis

- [WhatsApp Business Platform](https://www.twilio.com/whatsapp)
- [Documentação JavaFX](https://openjfx.io/)
- [Spring Boot Reference](https://spring.io/projects/spring-boot)
- [Jenkins Documentation](https://www.jenkins.io/doc/)
- [Launch4j](http://launch4j.sourceforge.net/)
- [Inno Setup](https://jrsoftware.org/isinfo.php)
- [NSIS](https://nsis.sourceforge.io/)

---

## 🛠️ Contribuição

Quer contribuir? Fique à vontade para abrir issues ou pull requests! Sugestões, correções e novas ideias são bem-vindas.

---

## 📄 Licença

Este projeto está sob a licença MIT.

---

*Desenvolvido com 💙 por VictorDevWakanda*
