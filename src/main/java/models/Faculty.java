package models;

public class Faculty {
    private int         faculty_id;
    private String      name;

    public Faculty(int faculty_id, String name) {
        this.faculty_id = faculty_id;
        this.name = name;
    }

    public Faculty(String name) {
        this.name = name;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public Faculty setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Faculty setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Факультет: № " + faculty_id + "; Название: " + name;
    }
}
