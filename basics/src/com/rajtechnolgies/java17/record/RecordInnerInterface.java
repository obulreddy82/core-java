package com.rajtechnolgies.java17.record;

public record RecordInnerInterface(String name, int age, Print recordInnerInterface) {
    public interface Print{
        public void print();
    }

    public static void main(String[] args) {
        RecordInnerInterface recordInnerInterface=new RecordInnerInterface("Obul",
                20, new RecordInnerInterface.Print(){
            @Override
            public void print() {
                System.out.println("Record Inner Interface");
            }
        });
        recordInnerInterface.recordInnerInterface().print();
        System.out.println(recordInnerInterface.name());
    }
}
