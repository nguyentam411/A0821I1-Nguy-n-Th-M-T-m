package module2._9_DSA_danh_sach.exercise.e1;

public class MyListText {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(2, 23);
        arrayList.remove(2);
        System.out.println(arrayList.cointains(6));
        System.out.println(arrayList.indexOf(3));
        arrayList.clear();

        try {
            MyList<Integer> arrayClone = (MyList<Integer>) arrayList.clone();
            for (int i = 0; i < arrayClone.size(); i++) {
                System.out.println(arrayClone);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

