package desafio.bootcamp;

import desafio.bootcamp.dominio.Bootcamp;
import desafio.bootcamp.dominio.Curso;
import desafio.bootcamp.dominio.Dev;
import desafio.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("descricao Curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentia1 = new Mentoria();
        mentia1.setTitulo("Metoria java");
        mentia1.setDescricao("descricao Metoria java");
        mentia1.setData(LocalDate.now());

//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentia1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentia1);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+ devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos "+ devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devMarcelo.getConteudosConcluidos());
        System.out.println("XP: "+ devMarcelo.calcularTotalXp());

        System.out.println("=========================");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
    }

}
