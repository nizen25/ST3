package za.org.dhe.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.org.dhe.entities.PhysicalAddress;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-19T03:29:55")
@StaticMetamodel(Learner.class)
public class Learner_ { 

    public static volatile SingularAttribute<Learner, String> firstName;
    public static volatile SingularAttribute<Learner, String> lastName;
    public static volatile SingularAttribute<Learner, PhysicalAddress> address;
    public static volatile SingularAttribute<Learner, Long> id;

}