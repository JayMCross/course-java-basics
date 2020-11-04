package com.rakovets.course.javabasics.practice.exceptionhandling.task7;

public class Task7 {
    public static void main(String[] args)
        {

            Task7TestClass consequencesOfYourHit = new Task7TestClass();


            try
            {

                String hit = consequencesOfYourHit.getHit(Math.random());
            }
            catch (NoobException e)
            {

                e.printStackTrace();
            }finally {
                System.out.println("go home");
            }
        }

}
