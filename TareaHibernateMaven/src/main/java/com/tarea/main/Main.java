package com.tarea.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarea.entidades.Persona;
import com.tarea.entidades.Ranking;
import com.tarea.entidades.Skill;



public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();


	public static void main(String[] args) {
		
		 {
				
			    Persona persona1 = new Persona (0,"Ronald");
			    Persona persona2 = new Persona (0,"Jefferson");
			    Persona persona3 = new Persona (0,"Marcelo");
				 
			 
			
			    ingresarPersona(persona1);
			    ingresarPersona(persona2);
			    ingresarPersona(persona3);
			    
			    
			    
			    
                Ranking ranking1 = new Ranking (0,"Bajo");
                Ranking ranking2 = new Ranking (0,"Medio");
                Ranking ranking3 = new Ranking (0,"Alto");
                
                
                ingresarRanking (ranking1);
                ingresarRanking (ranking2);
                ingresarRanking (ranking3);
                
                
                
                
                
                Skill skill1 = new Skill (0,"Cantar");
                Skill skill2 = new Skill (0,"Pintar");
                Skill skill3 = new Skill (0,"Nadar");
                Skill skill4 = new Skill (0,"Manejar");
                
                ingresarSkill (skill1);
                ingresarSkill (skill2);
                ingresarSkill (skill3);
                ingresarSkill (skill4);
                
                
              
                
		}

	}
	
  static void ingresarPersona(Persona persona) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		
		session.getTransaction().commit();
		session.close();
		System.out.println(persona.getId());
	}
  
  
  
  static void ingresarRanking(Ranking ranking) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ranking);
		
		session.getTransaction().commit();
		session.close();
		System.out.println(ranking.getId());
	}
  
  
  static void ingresarSkill (Skill skill) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(skill);
		
		session.getTransaction().commit();
		session.close();
		System.out.println(skill.getId());
	}

  
  
  
  
  
  
}
