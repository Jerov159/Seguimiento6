package Ejerc3.Cla;

import Ejerc3.Book;

import javax.swing.plaf.SpinnerUI;
import java.util.ArrayList;

public class BookstoreDAO extends BookstoreAbs {
    @Override
    public void addElement(Object element, ArrayList<Object> elements) {
        elements.add(element);
    }

    @Override
    public void displayElements(ArrayList<Object> elements) {
        for (Object element : elements) {
            System.out.println(element);
        }
    }
}
