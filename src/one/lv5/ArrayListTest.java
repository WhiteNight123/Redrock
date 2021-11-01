package one.lv5;

public class ArrayListTest {
    private int size = 0;
    private Object[] arr;

    public ArrayListTest() {
        this(10);
    }

    public ArrayListTest(int size) {
        arr = new Object[size];
    }

    public int size() {
        return size;
    }

    public void add(Object obj) {
        if (size == arr.length) {
            Object[] newArr = new Object[(int) (arr.length * 1.5)];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = obj;
        size++;
    }

    public void add(int index, Object obj) {
        if (index >= arr.length) {
            return;
        }
        if (size == arr.length) {
            Object[] newArr = new Object[(int) (arr.length * 1.5)];
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = obj;
                } else {
                    newArr[i + 1] = arr[i];
                }
            }
        } else {
            Object temp = arr[index];
            for (int i = index; i < size; i++) {
                Object temp2 = arr[i + 1];
                arr[i + 1] = temp;
                temp = temp2;  //妙啊
            }
            arr[index] = obj;
        }
        size++;
    }

    public Object remove(Object obj) {
        boolean isFound = false;
        Object findObj = null;
        for (int i = 0; i < size; i++) {
            if (!isFound && arr[i].equals(obj)) {
                isFound = true;
                findObj = arr[i];
            }
            if (isFound) {
                if (i + 1 < size) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        if (isFound) {
            arr[size - 1] = null;
            size--;
        }
        return findObj;
    }

    public Object removeAt(int index) {
        Object findObj = null;
        if (index >= size) {
            return null;
        }
        for (int i = index; i < size - 1; i++) {
            findObj = arr[i];
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        return findObj;
    }

    public Object get(int index) {
        return arr[index];
    }
}
