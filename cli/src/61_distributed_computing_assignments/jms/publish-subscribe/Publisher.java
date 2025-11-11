import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Publisher {

    private String clientId;
    private Connection connection;
    private Session session;
    private MessageProducer messageProducer;

    public void create(String clientId, String topicName) throws JMSException {
        this.clientId = clientId;

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);

        connection = connectionFactory.createConnection();
        connection.setClientID(clientId);

        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Topic topic = session.createTopic(topicName);

        messageProducer = session.createProducer(topic);
    }

    public void closeConnection() throws JMSException {
        connection.close();
    }

    public void sendName(String primeiroNome, String ultimoNome) throws JMSException {
        String text = primeiroNome + " " + ultimoNome;
        TextMessage textMessage = session.createTextMessage(text);
        messageProducer.send(textMessage);
        System.out.println("'" + clientId + "' enviou a mensagem: '" + text + "'");
    }

    public static void main(String[] args) throws JMSException {
        Publisher publisher = new Publisher();
        publisher.create("publicador1", "topico_noticias");
        publisher.sendName("Mensagem de Teste", "do Publicador");
        publisher.closeConnection();
    }
}
