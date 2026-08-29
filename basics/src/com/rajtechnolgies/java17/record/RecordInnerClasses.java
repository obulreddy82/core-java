package com.rajtechnolgies.java17.record;

public record RecordInnerClasses(String name, int age, Contact contact) {

    public static class Contact{
        public String email;
        public String phone;
        public Contact(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }
        public String toString(){
            return "Email : "+email+" Phone : "+phone;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }
    }

    public static void main(String[] args) {
        RecordInnerClasses recordInnerClasses=new RecordInnerClasses("Obul",20,new Contact("r@gmail.com","234343"));
        System.out.println(recordInnerClasses);
        System.out.println(recordInnerClasses.contact());
    }
}
