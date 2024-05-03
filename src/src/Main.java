import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso de java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descicao da mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Daniel");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos daniel: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos inscritos daniel: " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos daniel: " + dev.getConteudosConcluidos());
        dev.progredir();
        dev.progredir();
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("\n");


        Dev dev2 = new Dev();
        dev2.setNome("Pedro");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos pedro: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos inscritos pedro: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos pedro: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());



    }
}
