package StudentInfoLinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList stulist= new StudentList();
		stulist.insert("Jyot Buch",3.3);
		stulist.insert("Benjamin Tennyson",2.9);
		stulist.insert("Andrew Higgins", 2.0);
		stulist.insert("Rocky Balboa", 3.1);
		stulist.insert("Elon Musk", 4.0);
		stulist.insert("Jack Ma", 1.0);
		stulist.insert("Simon Goback", 2.88);
		stulist.insert("Steve Jobs", 3.0);
		stulist.insert("Joey Tribbiani", 3.2);
		stulist.insert("Ross Geller", 3.99);
		stulist.insert("Chanandler Bong", 2.0);
		
		stulist.checkFirstClass();
		stulist.getHighest();
		stulist.getLowest();
		//stulist.deleteLast();
		stulist.displayStudents();
		stulist.deleteStudent("Simon Goback");
		stulist.displayStudents();
	}

}
