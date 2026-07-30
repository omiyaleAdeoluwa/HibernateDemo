package com.favuur.HibernateDemo;


class App
{
    public static void main( String[] args )
    {
       Alien fave = new Alien();
       fave.setAid(113);
       fave.setName("Adeoluwa");
       fave.setColour("Red");
       
       AlienDao dao = new AlienDao();
       dao.saveAlien(fave);
       
       Alien found = dao.getAlien(113);
       
       System.out.println(found.getName());

       
    }
}
