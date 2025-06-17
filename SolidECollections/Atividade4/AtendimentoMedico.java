package Atividade4;

import java.util.LinkedList;

public class AtendimentoMedico {
    private LinkedList<Paciente> pacientes = new LinkedList<Paciente>();

    public void adicionarPaciente(Paciente paciente){
        pacientes.offer(paciente);
    }

    public String atenderProximoPaciente(){
        Paciente proximoPaciente = pacientes.getFirst();
        pacientes.removeFirst();
        return "Paciente " + proximoPaciente.getNome() + " de número " + proximoPaciente.getSenha() + " vá para a sala médica";
    }

    public LinkedList<Paciente> getPacientes() {
        return pacientes;
    }
}
