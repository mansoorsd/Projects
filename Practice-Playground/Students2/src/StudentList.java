import java.util.ArrayList;

public class StudentList<T> {

    public ArrayList<StudentClass> students = new ArrayList<>();

    public StudentList() {
        this.students = students;
    }

    public void addElement(StudentClass student) {
        students.add(student);
    }

    public void removeElement(StudentClass student) {
        students.remove(student);
    }

    public StudentClass getElement(int a) {

        return students.get(a);

    }

    public String beginsWith(String s) {

        ArrayList<String> Names = new ArrayList<>();
        ArrayList<String> namesStartsWith = new ArrayList<>();


        for (int i = 0; i < students.size(); i++) {

            String a = students.get(i).getName();

            if (a.toLowerCase().startsWith(s.toLowerCase())) {
                namesStartsWith.add(a);
            }

//            Names.add(students.get(i).getName());
        }
//        for (String a : Names) {
//            if (a.startsWith(s)) {
//                namesStartsWith.add(a);
//            }
        String str = namesStartsWith.toString();
        str = str.concat("\n");
        str = str.replace(",", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace(" ", "\n");


        return str;

    }


    public String bloodGroupOf(String[] a, String b) {
        ArrayList<String> bloodG = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < students.size(); j++) {
                StudentClass student = getElement(j);

                if (student.getName() == a[i]) {
                    String f = student.getBloodGroup();
                    if (f.equals(b)) {
                        bloodG.add(a[i]);

                    }
                }


            }
        }
        String str = bloodG.toString();
        str = str.concat("\n");
        str = str.replace(",", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace(" ", "\n");


        return str;

    }

    public int thresholdScore(int ab) {
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            int f = students.get(i).getScoreList();

            if (f >= ab) {
                count++;
            }
        }


        return count++;
    }
}




