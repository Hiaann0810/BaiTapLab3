package lab3;

public class Student {
   public String stID;
   public String stName;
   public String stClass;
   public Student(){
   }
   public Student(String stID,String stName, String stClass){
       this.stID=stID;
       this.stName=stName;
       this.stClass=stClass;
   }
        public Student(Student st){
            System.out.printf("Hay nhap ten");
            stName=scanner.next();
            System.out.printf("Hay nhap lo");
            stClass=scanner.next();
            System.out.printf("hay nhap ID");
            stID=scanner.next();    
        }
        public String geSttID(){
            return this.stID;
        }
        public String getStName(){
            return this.stName;
        }
        public String getStClass(){
            return this.stClass;
        }
        public void setStID(String id){
            this.stID=id;
        }
        public void setStName( String name){
            this.stName=name;
        }
        public void setStClass(String clas){
           this.stClass=clas;
        }
        public String toString(){
            return("Student"+stID+":"+stName+":"+stClass+"");
        }
   
}
