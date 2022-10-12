public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

     //override compareTo method
    @Override
    public int compareTo(Student student){
        return this.id - student.id;
    }




    //override equals method
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return this.id == student.id && this.name.equals(student.name);
    }

   

        //setters and getters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString method
    @Override
    public String toString(){
        return "Student [id=" + id + ", name=" + name + "]";
    }



    //main method
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Mary");
        Student student3 = new Student(3, "Peter");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
}