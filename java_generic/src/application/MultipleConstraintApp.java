package application;

public class MultipleConstraintApp {

    public static void main(String[] args) {
        // Example usage
        VicePresident vp = new VicePresident();
        Data<VicePresident> data = new Data<>(vp);
        data.getData().sayHello("John"); // Output: Hello John
    }

    public static abstract class Employee {
        // Add common employee properties or methods here (optional)
    }

    public static class Manager extends Employee {
        // Add manager specific properties or methods here (optional)
    }

    public interface CanSayHello {
        void sayHello(String name);
    }

    public static class VicePresident extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}