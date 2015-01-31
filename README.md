# GunzStudio
Gunzstudio é um projeto que desenvolvi, onde através de um comando, você pode executar combos/skills
no jogo GunZ The Duel.

# Explicações

Utilizei uma classe do Java chamada Robot, onde você pode executar eventos do teclado.
Tive que usar também, a library JNativeHook, para poder executar tais comandos
sem estar com o foco na aplicação. Então você deverá adicionar o JNativeHook.jar
em seu Buildpath.

# Como usar?

Você, após instanciar a classe Robot, deve escrever cada evento tanto quando é clicado, quanto
tirado o dedo do teclado, exemplo:

Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER); //Quando o Enter é pressionado.
r.delay(1000); //Um retardo/delay de 1 segundo.
r.keyRelease(KeyEvent.VK_ENTER); //Quando o Enter para de ser pressionado.

# Projeto

Caso queria compartilhar modificações, funções, combos, fique a vontade!
A continuação do projeto pode ajudar cada vez mais os jogadores.
