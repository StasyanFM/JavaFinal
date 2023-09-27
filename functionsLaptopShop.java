import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class functionsLaptopShop {
    public static void showCatalog(HashSet<laptopShop> notebooks){
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (laptopShop laptop : notebooks) {
            laptop.info();
        }
    }
    public static void menu(){
        laptopShop laptop = new laptopShop("LENOVO", "Legion 5 pro", 15.6, "Windows 11 pro", 32, 1024, "DDR5", "Intel", "Core i9 13900HX", "Nvidea 4060", "black", 160_000, "new", "Russian");
        laptopShop laptop1 = new laptopShop("SAMSUNG", "Galaxy Book S", 13.3, "Windows 10 pro", 8, 256, "LPDDR4x", "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "grey", 94_000, "new", "Russian");
        laptopShop laptop2 = new laptopShop("HUAWEI", "MateBook D 15", 15.6, "Windows 11 home", 8, 256, "DDR4", "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 47_000, "new", "Russian");
        laptopShop laptop3 = new laptopShop("LENOVO", "IdeaPad 5 pro", 16.0, "Windows 11 home", 16, 512, "LPDDR5", "AMD", "Ryzen 5 6600HS", "AMD Radeon", "grey", 94_000, "new", "English");
        laptopShop laptop4 = new laptopShop("APPLE", "MacBook pro 16", 16.2, "MacOS", 32, 1024, "LPDDR5", "Apple", "M2 max", "Apple graphics", "silver", 395_000, "new", "English");
        laptopShop laptop5 = new laptopShop("APPLE", "Macbook Air 15", 15.3, "MacOS", 8, 256, "LPDDR5", "Apple", "M2", "Apple graphics", "grey", 187_000, "new", "English");
        laptopShop laptop6 = new laptopShop("ASUS", "VivoBook 16X", 16.0, "Without OS", 16, 512, "DDR4", "AMD", "Ryzen 7 5800H", "AMD Radeon", "grey", 51_000, "new", "Russian");
        laptopShop laptop7 = new laptopShop("ASUS", "ROG Strix G18", 18.0, "Windows 11 pro", 16, 1024, "DDR5", "Intel", "Core i7 13650HX", "Nvidea 4060", "black", 123_000, "used", "Russian");
        laptopShop laptop8 = new laptopShop("MSI", "Stealth GS66", 15.6, "Windows 11 home", 32, 1024, "DDR5", "Intel", "Core i7 12700H", "Nvidea 3070 Ti", "black", 184_000, "new", "Russian");
        laptopShop laptop9 = new laptopShop("SAMSUNG", "Galaxy Book 3 Pro 360", 16.0, "Windows 11 home", 16, 512, "LPDDR5", "Intel", "Core i5 1340P", "Intel Iris Xe graphics", "dark-grey", 196_000, "new", "Russian");
        laptopShop laptop10 = new laptopShop("MSI", "GF63 Thin", 15.6, "Windows 11 home", 16, 512, "DDR4", "Intel", "Core i5 11400H", "Nvidea 3050 Ti", "black", 36_000, "used", "Russian");
        laptopShop laptop11 = new laptopShop("SAMSUNG", "Galaxy book NP750", 15.6, "Windows 10 pro", 16, 256, "LPDDR4x", "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "silver", 84_000, "new", "Russian");
        laptopShop laptop12 = new laptopShop("GIGABYTE", "Aero 16 XE5", 16.0, "Windows 11 pro", 32, 1024, "DDR5", "Intel", "Core i7 12700H", "Nvidea 3070 Ti", "grey", 178_000, "new", "Russian");
        laptopShop laptop13 = new laptopShop("RAZER", "Blade 17", 17.3, "Windows 11 pro", 32, 1024, "DDR5", "Intel", "Core i9 12900H", "Nvidea 3070 Ti ", "black", 350_000, "used", "English");
        laptopShop laptop14 = new laptopShop("DELL", "Latitude  7320", 13.3, "Windows 11 pro", 16, 256, "LPDDR4x", "Intel", "Core i5 1145G7", "Intel Iris Xe graphics ", "black", 103_000, "new", "English");
        laptopShop laptop15 = new laptopShop("DELL", "XPS 15", 15.6, "Windows 11 pro", 32, 1024, "DDR4", "Intel", "Core i9 11900H", "Nvidea 3050 Ti", "silver", 165_000, "new", "English");
        laptopShop laptop16 = new laptopShop("ACER", "Predator Helios 300", 15.6, "Windows 10 home", 16, 512, "DDR4", "Intel", "Core i7 10750H", "Nvidea 1660 Ti", "black", 92_000, "used", "English");
        laptopShop laptop17 = new laptopShop("ACER", "Swift 3", 14.0, "Windows 11 home", 8, 256, "LPDDR4x", "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 49_000, "new", "Russian");
        laptopShop laptop18 = new laptopShop("LENOVO", "ThinkPad X1 Carbon", 14.0, "Windows 11 pro", 16, 512, "LPDDR3", "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "black", 191_000, "new", "English");
        laptopShop laptop19 = new laptopShop("HP", "Spectre x360", 15.6, "Windows 10 home", 16, 1024, "DDR4", "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "silver", 136_000, "used", "English");
        laptopShop laptop20 = new laptopShop("HP", "Pavilion Gaming 15", 15.6, "Windows 11 home", 8, 256, "DDR4", "AMD", "Ryzen 5 5600H", "Nvidea 1650", "black", 61_000, "new", "Russian");
        laptopShop laptop21 = new laptopShop("ASUS", "ZenBook 14", 14.0, "Windows 11 pro", 16, 512, "LPDDR4x", "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "white", 112_000, "new", "English");
        laptopShop laptop22 = new laptopShop("ASUS", "TUF Gaming F17", 17.3, "Windows 11 home", 16, 512, "DDR4", "Intel", "Core i7 11800H", "Nvidea 3050 Ti", "black", 108_000, "new", "Russian");
        laptopShop laptop23 = new laptopShop("MSI", "Creator Z16", 16.0, "Windows 10 home", 32, 1024, "DDR4", "Intel", "Core i7 11800H", "Nvidea 3060", "silver", 213_000, "new", "Russian");
        laptopShop laptop24 = new laptopShop("MSI", "Modern 14", 14.0, "Windows 11 home", 16, 512, "LPDDR4x", "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 71_000, "new", "Russian");
        laptopShop laptop25 = new laptopShop("HUAWEI", "MateBook 16S", 16.0, "Windows 11 home", 16, 1024, "LPDDR5", "Intel", "Core i9 13900h", "Intel Iris Xe graphics", "grey", 133_000, "new", "Russian");
        
        HashSet<laptopShop> laptops = new HashSet<laptopShop>(
                Arrays.asList(laptop, laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10, laptop11, laptop12, laptop13, laptop14, laptop15,laptop16,laptop17,laptop18,laptop19,laptop20,laptop21,laptop22,laptop23,laptop24,laptop25));
        functionsLaptopShop op = new functionsLaptopShop();
        boolean fl = true;
        Scanner scanner = new Scanner(System.in, "cp866");
        while (fl) {
            System.out.println("Выбирите:
            \n1. Вывести весь каталог ноутбуков 
            \n2. Оперативная память 
            \n3. Размер SSD 
            \n4. Тип памяти 
            \n5. Производитель 
            \n6. Операционная система 
            \n7. Диагональ экрана 
            \n8. Цвет 
            \n9. Раскладка клавиатуры 
            \n10. Произвоитель процессора 
            \n11. Цена 
            \n12. Cостояние
            \n13. Закончить");
            System.out.print("Вывведите: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                op.showCatalog(laptops);
                break;
            } else if (choice == 2) {
                filterRAM(laptops, scanner);
                break;
            } else if (choice == 3) {
                filterSSD(laptops, scanner);
                break;
            } else if (choice == 4) {
                filterTypeSSD(laptops, scanner);
                break;
            } else if (choice == 5) {
                filterBrand(laptops, scanner);
                break;
            }else if (choice == 6){
                filterOS(laptops,scanner);
                break;
            } else if (choice == 7) {
                filterScreenResolution(laptops,scanner);
                break;
            } else if (choice == 8) {
                filterColor(laptops,scanner);
                break;
            } else if (choice == 9) {
                filterKeyboard(laptops, scanner);
                break;
            } else if (choice == 10) {
                filterCpuBrand(laptops,scanner);
                break;
            }else if (choice == 11){
                filterPrice(laptops,scanner);
                break;
            } else if (choice == 12) {
                filterState(laptops,scanner);
                break;
            }else if(choice == 13){
                break;
            }
            else {
                System.out.println("Такой команды не сущестует");
            }
        }
    }

    static void filterRAM(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<Integer> RAM = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            RAM.add(laptop.getRAM());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите от какого размера памяти фильтровать:");
        int minRAM = scanner.nextInt();

        System.out.println("Введите до какого размера памяти фильтровать:");
        int maxRAM = scanner.nextInt();
        boolean isLaptopFound = false;

        for (laptopShop laptop : laptops) {
            int laptopRAM = laptop.getRAM();
            if (laptopRAM >= minRAM && laptopRAM <= maxRAM) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указаной оперативной памятью, повторите(нажмите на Enter)");
            filterRAM(laptops,scanner);
        }
    }

    static void filterSSD(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<Integer> SSD = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            SSD.add(laptop.getSSD());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите от какого размера памяти фильтровать:");
        int minSSD = scanner.nextInt();

        System.out.println("Введите до какого размера памяти фильтровать:");
        int maxSSD = scanner.nextInt();
        boolean isLaptopFound = false;

        for (laptopShop laptop : laptops) {
            int laptopSSD = laptop.getSSD();
            if (laptopSSD >= minSSD && laptopSSD <= maxSSD) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указаным размером SSD, повторите(нажмите на Enter)");
            filterSSD(laptops,scanner);
        }
    }

    static void filterTypeSSD(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> typeSSD = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            typeSSD.add(laptop.getTypeSSD());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужный вам тип памяти:");
        String filter = scanner.nextLine();
        if (typeSSD.contains(filter)) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getTypeSSD().equals(filter)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаным типом памяти, повторите(нажмите на Enter)");
            filterTypeSSD(laptops, scanner);
        }
    }

    static void filterBrand(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> brand = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            brand.add(laptop.getBrand().toUpperCase());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужного вам производителя:");
        String oper = scanner.nextLine().toUpperCase();
        String filter = oper;
        if (brand.contains(filter) ) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getBrand().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаного производителя, повторите(нажмите на Enter)");
            filterBrand(laptops, scanner);
        }
    }

    static void filterOS(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> OS = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            OS.add(laptop.getOS());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужную вам операционную систему:");
        String oper = scanner.nextLine();
        if (OS.contains(oper) ) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getOS().equals(oper)) {
                    laptop.info();
                }
            }
        }
        else {
            System.out.println("К сожалению, у нас нет товаров указаной операционной системой, повторите(нажмите на Enter)");
            filterOS(laptops, scanner);
        }
    }
    static void filterScreenResolution(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<Double> sr = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            sr.add(laptop.getScreenResolution());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите от какой диагонали экрана фильтровать:");
        double minSr = scanner.nextDouble();
        System.out.println("Введите до какой диагонали экрана фильровать:");
        double maxSr = scanner.nextDouble();
        boolean isLaptopFound = false;

        for (laptopShop laptop : laptops) {
            double laptopSr = laptop.getScreenResolution();
            if (laptopSr >= minSr && laptopSr <= maxSr) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указаной диагональю экрана, повторите(нажмите на Enter.");
            filterScreenResolution(laptops,scanner);
        }
    }

    static void filterColor(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            colors.add(laptop.getColor().toLowerCase());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужный вам цвет:");
        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getColor().toLowerCase().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаным цветом, повторите(нажмите на Enter)");
            filterColor(laptops, scanner);
        }
    }

    static void filterKeyboard(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> keyboard = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            keyboard.add(laptop.getKeyboard());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужную вам раскладку клавиатуры:");
        String oper = scanner.nextLine();
        if (keyboard.contains(oper)) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getKeyboard().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаной раскладкой клавиатуры, повторите(нажмите на Enter)");
            filterKeyboard(laptops, scanner);
        }
    }

    static void filterCpuBrand(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> cpuBrand = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            cpuBrand.add(laptop.getCpuBrand());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужного произовдителя процессоров:");
        String oper = scanner.nextLine();
        if (cpuBrand.contains(oper)) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getCpuBrand().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаным производителем процессоров, повторите(нажмите на Enter)");
            filterCpuBrand(laptops, scanner);
        }
    }

    static void filterPrice(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<Integer> price = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            price.add(laptop.getPrice());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите от какой цены фильтровать:");
        int minPrice = scanner.nextInt();
        System.out.println("Введите до какой цены фильтровать:");
        int maxPrice = scanner.nextInt();
        boolean isLaptopFound = false;

        for (laptopShop laptop : laptops) {
            int laptopPrice = laptop.getPrice();
            if (laptopPrice >= minPrice && laptopPrice <= maxPrice) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указаной ценой, повторите(нажмите на Enter)");
            filterPrice(laptops, scanner);
        }
    }

    static void filterState(HashSet<laptopShop> laptops, Scanner scanner) {
        TreeSet<String> state = new TreeSet<>();
        for (laptopShop laptop : laptops) {
            state.add(laptop.getState());
        }
        String error = scanner.nextLine();
        System.out.println();
        System.out.println("Введите нужное вам состояние ноутбука:");
        String oper = scanner.nextLine();
        if (state.contains(oper)) {
            System.out.println();
            for (laptopShop laptop : laptops) {
                if (laptop.getState().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указаным состояноем, повторите(нажмите на Enter)");
            filterState(laptops, scanner);
        }

    }
}