package mx.uabc.cursojava.oop.nestedclasses;

public class CPU {
    private double price;

    private String marca;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "price=" + price +
                ", marca='" + marca + '\'' +
                '}';
    }

    public class RAM {
        int memory;

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "memory=" + memory +
                    '}';
        }
    }
    public class Processor {
        private int cores;
        private String manufacturer;

        public int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "cores=" + cores +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }

        public class Demo {

        }
    }
}
