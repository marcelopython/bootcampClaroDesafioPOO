package desafio.bootcamp;

import desafio.bootcamp.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentia1);


    }

}
