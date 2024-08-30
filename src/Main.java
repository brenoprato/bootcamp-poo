import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosInscritos());
        devBreno.progredir();
        devBreno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Breno:" + devBreno.getConteudosConcluidos());
        System.out.println("XP:" + devBreno.calcularTotalXp());

        System.out.println("-------");

        Dev devPrato = new Dev();
        devPrato.setNome("Prato");
        devPrato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Prato:" + devPrato.getConteudosInscritos());
        devPrato.progredir();
        devPrato.progredir();
        devPrato.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Prato:" + devPrato.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Prato:" + devPrato.getConteudosConcluidos());
        System.out.println("XP:" + devPrato.calcularTotalXp());

    }

}
