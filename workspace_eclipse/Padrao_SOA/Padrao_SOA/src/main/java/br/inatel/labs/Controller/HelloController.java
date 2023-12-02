/**
 * Controlador REST responsável por manipular solicitações relacionadas ao recurso "hello".
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    /**
     * Manipula solicitações HTTP GET para o recurso "hello".
     *
     * @return Uma instância de MyMessage contendo a mensagem de saudação.
     */
    @GetMapping
    public MyMessage processarGetHello() {
        // Cria uma nova instância de MyMessage
        MyMessage msg = new MyMessage();
        
        // Define a informação da mensagem
        msg.setInfo("Olá, padrão arquitetural SOA");
        
        // Retorna a mensagem criada
        return msg;
    }
}
