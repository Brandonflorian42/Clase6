package Listas;

import java.util.ArrayList;
import java.util.List;
public class ClsArrayList {


    public Object listaTareas;

    public void ejemplo1(){
        List<String> tasklist = new ArrayList<String>();


        tasklist.add("Hacer compras");
        tasklist.add("Pasear al perro");
        tasklist.add("Hacer la cama");
        tasklist.add("Lavar el carro");

//        System.out.println(tasklist);
//        String primerTarea = tasklist.get(0);
//        System.out.println("La primera tarea es: " + primerTarea);
//
//        tasklist.remove(0);
//        String primerTarea = tasklist.get(0);
//        System.out.println("La primera tarea es: " + primerTarea);

        for (String tarea : tasklist) {
            System.out.println("Tarea: " + tarea); //Iteración.
        }
    }

    public void listadevalores(){
        List<Integer> tasklist = new ArrayList<Integer>();
        tasklist.add(500);
        tasklist.add(1000);
        tasklist.add(1500);
        tasklist.add(2000);
        tasklist.add(2500);

        int suma = 0;
        for (int valor : tasklist) {
            suma = suma + valor;
        }
        System.out.println("La suma de los valores es de: " + suma);

    }

    public void listaTareas() {
        List<ClsTasklist> task = new ArrayList<>();
        ClsTasklist tareaIndividual = new ClsTasklist();
        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTasklist();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("Llevarlo al paque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTasklist();

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("Si no lo hago me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTasklist();

        tareaIndividual.setTaskName("Ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi país");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTasklist();

        int tarea_numero = 0;
        for (ClsTasklist tl : task) {
            System.out.println(tarea_numero+" Tarea: "+tl.getTaskName()+" Descripción: "+tl.getTaskDescription());
            tarea_numero++;
        }
    }
}