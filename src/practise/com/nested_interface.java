package sample.com;
interface  nested_01 {
    void run_name();

    interface nested_02 {
        void run_01();

    }
}
    interface nested_03 extends nested_01.nested_02{
    void run_09();
    void name_09();


    }
    class school implements  nested_03
    {

        @Override
        public void run_01() {

        }

        @Override
        public void run_09() {

        }

        @Override
        public void name_09() {

        }
    }



public class nested_interface {
    public static void main(String[] args) {
        school obj= new school();

    }
}
