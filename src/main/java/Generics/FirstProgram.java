package Generics;

public class FirstProgram
{
    public static < E > void printArray( E[] inputArray )
    {
        for(E element:inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
        }

    public static void main(String[] args) {
        Integer[]intArray={1,3,6,12,5};
        Double[]doubleArray={12.5,75.6,9.0,8.5};
        Character[]charArray={'S','Z','K',};
        System.out.println("Array intergerArray contains:");
        printArray(intArray);
        System.out.println("double doubleArray contains:");
        printArray(doubleArray);
        System.out.println("character charcterArray contains:");
        printArray(charArray);
    }
    }

