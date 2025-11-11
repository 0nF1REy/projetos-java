import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String fila = "TEST_QUEUE";

    public static void main(String[] args) throws Exception {
        ConnectionFactory fabricaConexao = new ActiveMQConnectionFactory(url);
        Connection conexao = fabricaConexao.createConnection();
        conexao.start();

        Session sessao = conexao.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Destination destino = sessao.createQueue(fila);

        MessageProducer produtor = sessao.createProducer(destino);

        TextMessage mensagem = sessao.createTextMessage("Olá!!! Bem-vindo ao mundo do ActiveMQ.");

        produtor.send(mensagem);

        System.out.println("Mensagem enviada: '" + mensagem.getText() + "'");
        conexao.close();
    }
}
