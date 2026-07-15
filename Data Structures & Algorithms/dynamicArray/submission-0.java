class DynamicArray {

    private int[] values;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.values = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return values[i];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }

        values[size] = n;
        size++;
    }

    public int popback() {
        int lastValue = values[size - 1];
        size--;

        return lastValue;
    }

    public void resize() {
        capacity *= 2;

        int[] newValues = new int[capacity];

        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }

        values = newValues;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}