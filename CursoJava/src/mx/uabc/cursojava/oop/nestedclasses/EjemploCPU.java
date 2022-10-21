package mx.uabc.cursojava.oop.nestedclasses;

public class EjemploCPU {
    public static void main(String[] args){
        CPU miCPU = new CPU();
        miCPU.setMarca("Dell");
        miCPU.setPrice(56000);

        CPU.Processor processor = miCPU.new Processor();
        processor.setCores(8);
        processor.setManufacturer("Intel");

        CPU.Processor.Demo demo = processor.new Demo();

        CPU.RAM memoria = miCPU.new RAM();
        memoria.setMemory(32);

        System.out.println(miCPU.toString());
        System.out.println(memoria.toString());
        System.out.println(processor.toString());

    }
}
