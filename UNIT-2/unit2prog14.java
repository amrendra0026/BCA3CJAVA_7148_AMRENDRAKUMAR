
class vivaanbasepolicy {

    final void verifyIndetiti() {
        System.out.println("student vivaan identify verified via biometric ");
    }
}

class Advancestudent extends vivaanbasepolicy {

    void satyam(){
        System.out.println("hello");
    }
    // void verifyIndetiti(){
    //     System.out.println("check....");
    // }
}

class unit2prog14 {

    public static void main(String[] args) {
        Advancestudent newAdvancestudent = new Advancestudent();

        newAdvancestudent.verifyIndetiti();
    }
}