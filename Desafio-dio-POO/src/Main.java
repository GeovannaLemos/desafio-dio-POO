import desafioDominio.Bootcamp;
import desafioDominio.Curso;
import desafioDominio.Dev;
import desafioDominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria (8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso javascrpt");
        curso2.setCargaHoraria (8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData (LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("XP: "+devCamila.calcularTotlXp());

        System.out.println("\t-------\t");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao: "+devJoao.getConteudosInscritos());
        System.out.println("-----");
        devJoao.progredir();
        System.out.println("Conteúdos inscritos Joao: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao: "+devJoao.getConteudosInscritos());
        System.out.println("XP: "+devJoao.calcularTotlXp());

    }
}
