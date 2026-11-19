package smartvehicle;

// Interface untuk kendaraan yang memiliki mesin
interface EnginePowered {
    void startEngine();
}

// Interface untuk kendaraan berbahan bakar
interface FuelPowered {
    void isiBahanBakar();
}

// Interface untuk kendaraan listrik
interface BatteryPowered {
    void isiBaterai();
}

// Interface untuk kendaraan yang dikayuh
interface PedalPowered {
    void kayuh();
}

// Kelas mobil listrik
class ElectricCar implements EnginePowered, BatteryPowered {

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mobil listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik...");
    }
}

// Kelas mobil bensin
class GasolineCar implements EnginePowered, FuelPowered {

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin...");
    }
}

// Kelas sepeda
class Bicycle implements PedalPowered {

    @Override
    public void kayuh() {
        System.out.println("Mengayuh sepeda...");
    }
}

// Kendaraan baru: mobil hybrid
class HybridCar implements EnginePowered, FuelPowered, BatteryPowered {

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mobil hybrid...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil hybrid...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil hybrid...");
    }
}

// Program utama
public class Main {

    public static void main(String[] args) {

        // Membuat objek kendaraan
        ElectricCar mobilListrik = new ElectricCar();
        GasolineCar mobilBensin = new GasolineCar();
        Bicycle sepeda = new Bicycle();
        HybridCar mobilHybrid = new HybridCar();

        System.out.println("=== SISTEM SMART VEHICLE ===");

        // Mobil listrik
        System.out.println("\n1. Mobil Listrik");
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        // Mobil bensin
        System.out.println("\n2. Mobil Bensin");
        mobilBensin.startEngine();
        mobilBensin.isiBahanBakar();

        // Sepeda
        System.out.println("\n3. Sepeda");
        sepeda.kayuh();

        // Mobil hybrid
        System.out.println("\n4. Mobil Hybrid");
        mobilHybrid.startEngine();
        mobilHybrid.isiBahanBakar();
        mobilHybrid.isiBaterai();
    }
}
