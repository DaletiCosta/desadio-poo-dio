package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String []args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaleti = new Dev();
        devDaleti.setNome("Daleti");
        devDaleti.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Daleti" + devDaleti.getConteudosInscritos());
        devDaleti.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Daleti" + devDaleti.getConteudosInscritos());
        System.out.println("Conteudos Conclusion Daleti" + devDaleti.getConteudosConcluidos());
        System.out.println("XP:" + devDaleti.calcularTotalXp());

        System.out.println("-------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcos" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Marcos" + devMarcos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marcos" + devMarcos.getConteudosConcluidos());
        System.out.println("XP:" + devMarcos.calcularTotalXp());

    }

}
