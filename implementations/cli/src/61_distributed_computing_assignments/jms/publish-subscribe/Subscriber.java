import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Subscriber {

    private String clientId;
    private Connection connection;
    private MessageConsumer messageConsumer;

    public void create(String clientId, String topicName) throws JMSException {
        this.clientId = clientId;

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
        connection = connectionFactory.createConnection();
        connection.setClientID(clientId);

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic(topicName);
        messageConsumer = session.createConsumer(topic);
        connection.start();
    }

    public void closeConnection() throws JMSException {
        connection.close();
    }

    public void listenForMessages() {
        System.out.println("'" + this.clientId + "' está aguardando por mensagens... Pressione Ctrl+C para sair.");
        
        try {
            while (true) {
                Message message = messageConsumer.receive();

                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    String text = textMessage.getText();
                    System.out.println("'" + this.clientId + "' recebeu a mensagem: '" + text + "'");
                }
            }
        } catch (JMSException e) {
            System.out.println("Conexão encerrada ou erro ocorrido.");
        }
    }

    public static void main(String[] args) throws JMSException {
        if (args.length == 0) {
            System.out.println("Erro: Forneça um ID de cliente único como argumento.");
            System.out.println("Uso: java Subscriber <id-do-cliente>");
            return;
        }
        
        String clientId = args[0];
        String topicName = "topico_noticias";

        Subscriber subscriber = new Subscriber();
        subscriber.create(clientId, topicName);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                System.out.println("Fechando conexão para '" + clientId + "'...");
                subscriber.closeConnection();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }));

        subscriber.listenForMessages();
    }
}
