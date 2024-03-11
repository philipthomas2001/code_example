public class StudentClass {
    private String name;
    private int age;
    private int id;
    private int totalMarks;
    private Boolean isPresent;


    public StudentClass(String name,int age,int id,int totalMarks,Boolean isPresent) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.totalMarks =totalMarks;
        this.isPresent=isPresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(Boolean present) {
        isPresent = present;
    }
}


