package enum_;
/**
 * 
 * @author shani
 * every enum is always final implicitly.
 * All enum in java is direct child class of java.lang.Enum,
 * so because of direct child class we can't extend any enum by any other enum,
 * so we can't use extends keyword with enum;
 * we can implements enum;
 * enum implements serializable and comparable interfaces;
 * we can define enum inside class out side the class but not inside method;
 * if we define enum outside the class modifiers must be public,default,strictfp;
 * if we define enum inside the class then applicable modifiers are public ,default,strictfp,protected,private,static.
 * we can't create enum constructor explicitly.
 * we can call all method in enum present in Object class;
 * we can also apply static import on members of enum;
 */

/**
 * 
 * @author shani
 * enum vs Enum vs Enumeration{
 * 		enum: key word in java which can be used to define named constant in java;
 * 		Enum: it is a class present java.lang package.
 * 			  evary enum is direct child class of Enum
 * 			  hence it acts as base class of all java enum;
 * 		Enumerataion: cursor interface present in java.util package.
 * 					  used for get next(iterate) value from collection;
 * }
 */
public enum aboutpackage {
jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec
}
