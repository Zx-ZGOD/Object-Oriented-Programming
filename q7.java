class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Abhi na jao choad krr ke dil abhi bhara nhi: ");

        sb.append("abhi nhi nhi"); // append at last
        System.out.println("After append: " + sb);

        sb.insert(0, "ohhh tenuuuu "); // insert at beginning
        System.out.println("After insert: " + sb);

        sb.reverse(); // reverse whole string
        System.out.println("After reverse: " + sb);
    }
}
