import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test {
    @Test
    public void plus_test(){
        calculator calc = new calculator();
        int c = calc.plus(5,5 );
        assertEquals(10, c );
        System.out.println("Сложение работает исправно!");
    }
    @Test
    public void minus_test(){
        calculator calc = new calculator();
        int c = calc.minus(10, 5);
        assertEquals(5,c );
        System.out.println("Вычитание работает исправно!");
    }
    @Test
    public void ymnojenie_test(){
        calculator calc = new calculator();
        int c = calc.ymn(5,5);
        assertEquals(25, c);
        System.out.println("Умножение работает исправно!");
    }
    @Test
    public void delenie_test(){
        calculator calc = new calculator();
        int c = calc.delenie(25 ,5);
        assertEquals(5,c);
        System.out.println("Деление работает исправно!");
    }
    @Test
    public void perimetr_test(){
        calculator calc = new calculator();
        int p = calc.perimetr(5, 10);
        assertEquals(30, p);
        System.out.println("Подсчет периметра работает исправно!");
    }
}
