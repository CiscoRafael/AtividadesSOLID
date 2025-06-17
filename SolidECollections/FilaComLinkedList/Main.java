package FilaComLinkedList;

public class Main {
    public static void main(String args[]){
        AtendimentoMedico atendimentoMedico = new AtendimentoMedico();

        Paciente p1 = new Paciente("Francisca", "12345678901");
        Paciente p2 = new Paciente("Maria", "12345678674");
        Paciente p3 = new Paciente("Francisco", "12345632456");

        atendimentoMedico.adicionarPaciente(p1);
        atendimentoMedico.adicionarPaciente(p2);
        atendimentoMedico.adicionarPaciente(p3);
        int tamanhoFila = atendimentoMedico.getPacientes().size();
        for(int i = 0; i< tamanhoFila; i++){
            System.out.println(atendimentoMedico.atenderProximoPaciente());
        }

    }
    
}
