import CalcApp.*;
import CalcApp.CalcPackage.DivisionByZero;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

import java.util.Properties;

// Implementação da interface Calc definida no arquivo IDL
class CalcImpl extends CalcPOA {

    @Override
    public float sum(float a, float b) {
        return a + b;
    }

    @Override
    public float div(float a, float b) throws DivisionByZero {
        if (b == 0) {
            throw new CalcApp.CalcPackage.DivisionByZero();
        } else {
            return a / b;
        }
    }

    @Override
    public float mul(float a, float b) {
        return a * b;
    }

    @Override
    public float sub(float a, float b) {
        return a - b;
    }
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }
}

public class CalcServer {

    public static void main(String args[]) {
        try {
            // Criação e inicialização do ORB (Object Request Broker)
            ORB orb = ORB.init(args, null);

            // Obtém referência ao POA raiz e ativa o gerenciador
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Cria o objeto servidor (servant) e o registra no ORB
            CalcImpl helloImpl = new CalcImpl();
            helloImpl.setORB(orb);

            // Obtém uma referência CORBA para o objeto servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Calc href = CalcHelper.narrow(ref);

            // Obtém o contexto de nomes raiz (NameService)
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            // Usa NamingContextExt (versão estendida e interoperável)
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Registra (associa) o objeto Calc no serviço de nomes
            String name = "Calc";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("Servidor pronto... aguardando chamadas de clientes.");

            // Mantém o servidor em execução aguardando invocações remotas
            orb.run();
            
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Encerrando servidor...");
    }
}
