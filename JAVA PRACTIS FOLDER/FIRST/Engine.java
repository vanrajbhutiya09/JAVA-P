package FIRST;

import javax.swing.text.html.HTMLDocument;

public class Engine {

    public static class Main{
        int top=0;
        int[] arr = new int[100];
        int size=0;
        void add(int data){
            if(size > 0) {

                if(size < 100)
                arr[size] = data;
                size++;
            }
        }
    }

}
