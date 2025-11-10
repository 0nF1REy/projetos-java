package mpi;

import mpi.*;

public class MPI_Scatter_Gather_Demo 
{
    public static void main(String[] args) throws Exception 
    {
        MPI.Init(args);

        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        
        int unitsize = 4;
        int root = 0;
        
        int send_buffer[] = new int[unitsize * size];

        int recv_buffer[] = new int[unitsize];

		/*
		- Envia partes de um buffer do processo raiz para todos os processos.
		  Cada processo recebe uma fatia (recv_buffer) do buffer de envio (send_buffer) do processo raiz.
		*/
        MPI.COMM_WORLD.Scatter(
            send_buffer, 0, unitsize, MPI.INT,
            recv_buffer, 0, unitsize, MPI.INT,
            root
        );

        if (rank != root) {
            for (int i = 0; i < unitsize; i++) {
                recv_buffer[i] = rank;
            }
        }

		/*
		- Coleta dados de todos os processos e envia para o processo raiz.
		  Cada processo envia seu buffer de envio (recv_buffer) e o processo raiz recebe no send_buffer.
		*/
        MPI.COMM_WORLD.Gather(
            recv_buffer, 0, unitsize, MPI.INT,
            send_buffer, 0, unitsize, MPI.INT,
            root
        );

        if (rank == root) {
            System.out.println("Resultado final no processo raiz:");
            for (int i = 0; i < unitsize * size; i++) {
                System.out.print(send_buffer[i] + " ");
            }
            System.out.println();
        }

        MPI.Finalize();
    }
}