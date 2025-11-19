import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Receiver {

    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String fila = "TEST_QUEUE";

    public static void main(String[] args) throws JMSException {
        ConnectionFactory fabricaConexao = new ActiveMQConnectionFactory(url);
        Connection conexao = fabricaConexao.createConnection();
        conexao.start();

        Session sessao = conexao.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Destination destino = sessao.createQueue(fila);

        MessageConsumer consumidor = sessao.createConsumer(destino);

        Message mensagem = consumidor.receive();

        if (mensagem instanceof TextMessage) {
            TextMessage mensagemTexto = (TextMessage) mensagem;
            System.out.println("Mensagem recebida: '" + mensagemTexto.getText() + "'");
        }

        conexao.close();
    }
}
