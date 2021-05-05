public class PrisonTest {
    public static class Prisoner {
        public String name;
        public Double height;
        public int sentence;


        public Prisoner(String name, double height, int sentence){
            name = name;
            height = height;
            sentence = sentence;


        //public void setFields(String name, double height, int sentence) {
            //System.out.println(name + " "+ height + " " + sentence + " before 'this'");
            //System.out.println(this.name + " "+ this.height + " " + this.sentence + " after 'this'");
        }
        public Prisoner(String name, double height, int sentence, String cell){
            name = name;
            height = height;
            sentence = sentence;
        }
        public String think(){
           System.out.println("I'll take my revenge.");
        }
        public void getFields(){
            System.out.println(name + " " + height + " " + sentence);
        }
        public void getFields(boolean toThink){
            System.out.println(name + " " + height + " " + sentence + " " + think());
        }
    }

    public static void main(String args[]) {

        Prisoner p01 = new Prisoner("bubba", 2.03, 4);
        p01.getFields();
        p01.getFields(true);
        //System.out.println(p01.name);
    }
}
