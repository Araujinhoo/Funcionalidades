#language : pt
Funcionalidade: Laudando devolvendo

  @tag1
  Cenario: Laudando
    Dado que eu esteja na tela de home
    Quando pesquiso pelo paciente desejado
    E clico em laudario	
    E clico em salvar
    E clico em assinados
    Então posso ver o exame com status de assinado
