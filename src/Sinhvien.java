public class Sinhvien implements Comparable<Sinhvien> {
    private int id;
    private String name;
    int date_of_birth ;
    private double averageMark;

    public Sinhvien() {
    }

    public Sinhvien(String name) {
        this.name = name;
    }

    public Sinhvien(int id) {
        this.id = id;
    }

    public Sinhvien(int id, String name, int date_of_birth, double averageMark) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.averageMark = averageMark;
    }

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

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.id-(o.id);
    }
}
