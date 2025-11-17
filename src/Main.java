public class Main {
    public static void main(String[] args) {
        UniversityDatabase db = new UniversityDatabase();

        // Register users
        Student s1 = new Student("Juan Dela Cruz", "juan@student.edu", "2002-04-15", "Manila");
        Student s2 = new Student("Maria Santos", "maria@student.edu", "2003-09-20", "Cebu");
        Faculty f1 = new Faculty("Prof. Reyes", "reyes@faculty.edu", "1980-01-10", "Quezon City", "FAC001");
        Administrator admin1 = new Administrator("Admin User", "admin@uni.edu", "1975-03-22", "Davao", "ADM001");

        db.registerUser(s1);
        db.registerUser(s2);
        db.registerUser(f1);
        db.registerAdmin(admin1);

        // Display users
        System.out.println("All Students:");
        db.displayAllStudents();

        System.out.println("All Faculty:");
        db.displayAllFaculty();

        // Update & Delete example
        db.updateStudent(1000, "Juan Updated", "juan.updated@student.edu");
        db.deleteStudent(1001);

        System.out.println("After Update/Delete:");
        db.displayAllStudents();
    }
}

