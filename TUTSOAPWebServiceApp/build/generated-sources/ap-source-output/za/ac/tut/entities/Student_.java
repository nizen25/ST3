package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-19T03:30:11")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Address> address;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Long> id;

}